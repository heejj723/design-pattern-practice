package decorator

import java.math.BigDecimal

class DarkRoast(

): Beverage() {

    override val description: String
        get() = "최고의 다크로스트 커피"


    override val milk: Boolean
        get() = false

    override val mocha: Boolean
        get() = false

    override val soy: Boolean
        get() = false
    override val water: Boolean
        get() = true
    override val whip: Boolean
        get() = false
    override val shot: Boolean
        get() = true


    override fun cost(): BigDecimal {
        return super.cost() + BigDecimal.valueOf(2)
    }
}