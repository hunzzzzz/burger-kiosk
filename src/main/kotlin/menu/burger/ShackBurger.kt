package menu.burger

import resource.Strings

class ShackBurger : Burger() {
    override val name: String = Strings.BURGER1_NAME
    override val price: Double = Strings.BURGER1_PRICE
    override val description: String = Strings.BURGER1_DESCRIPTION
}