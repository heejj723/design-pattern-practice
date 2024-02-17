package decorator.menu

import java.math.BigDecimal

class DarkRoast(
    override val size: Size

): Beverage() {

    override val description: String
        get() = "최고의 다크로스트 커피"

    override fun cost(): BigDecimal {
        return BigDecimal.valueOf(7)
    }
}