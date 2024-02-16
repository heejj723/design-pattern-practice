package decorator.menu

import java.math.BigDecimal

abstract class Beverage {

    open val description: String = "음료"

    open abstract fun cost(): BigDecimal

}