package decorator.element

import decorator.menu.Beverage
import decorator.menu.Size
import java.math.BigDecimal

class Mocha(
    private val beverage: Beverage,
    override val description: String = beverage.description + "[재료]모카",
    override val size: Size = beverage.size
): CondimentDecorator() {

    override fun cost(): BigDecimal {
        return price() + beverage.cost()
    }

    private fun price(): BigDecimal {
        return when (size) {
            Size.TALL -> BigDecimal.ONE
            Size.GRANDE -> BigDecimal(2)
            else -> BigDecimal(3)
        }
    }

}