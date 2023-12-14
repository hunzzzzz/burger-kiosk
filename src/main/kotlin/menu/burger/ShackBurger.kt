package menu.burger

import resource.BurgerResources

class ShackBurger : Burger() {
    override val name: String = BurgerResources.BURGER1_NAME
    override val price: Double = BurgerResources.BURGER1_PRICE
    override val description: String = BurgerResources.BURGER1_DESCRIPTION
}