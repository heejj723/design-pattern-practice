package decorator

import java.math.BigDecimal

open class Beverage {

    open val description: String = "음료"
    private val minimumPrice: BigDecimal = BigDecimal.TEN

    open val milk: Boolean = false
    open val soy: Boolean = false
    open val mocha: Boolean = false
    open val whip: Boolean = false
    open val water: Boolean = false
    open val shot: Boolean = false

    open fun cost(): BigDecimal {
        return minimumPrice
    }

}