package decorator

import java.math.BigDecimal

class HouseBlend(

): Beverage() {

    override val description: String
        get() = "최고의 하우스블렌드 커피"


    override fun cost(): BigDecimal {
        return super.cost() + BigDecimal.ONE
    }
}