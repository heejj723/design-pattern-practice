package decorator.element

import decorator.menu.Beverage

abstract class CondimentDecorator : Beverage() {

    abstract override val description: String

}