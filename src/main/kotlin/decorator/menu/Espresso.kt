package decorator.menu

import java.math.BigDecimal

class Espresso(): Beverage() {
    override val description: String
        get() = "에스프레소"

    override fun cost(): BigDecimal {
        return BigDecimal.TEN
    }
}