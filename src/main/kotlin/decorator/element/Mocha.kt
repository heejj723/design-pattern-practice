package decorator.element

import decorator.menu.Beverage
import java.math.BigDecimal

class Mocha(
    private val beverage: Beverage,
    override val description: String = beverage.description + "[재료]모카"
): CondimentDecorator() {

    companion object {
        val price = BigDecimal(2)
    }
    override fun cost(): BigDecimal {
        return price + beverage.cost()
    }

}