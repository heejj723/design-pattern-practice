package decorator.menu

import java.math.BigDecimal

abstract class Beverage {

    abstract val description: String
    abstract val size: Size

    abstract fun cost(): BigDecimal

}

enum class Size {
    TALL, GRANDE, VENTI
}