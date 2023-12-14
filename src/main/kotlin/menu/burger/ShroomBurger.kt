package menu.burger

import resource.BurgerResources

class ShroomBurger : Burger() {
    override val name: String = BurgerResources.BURGER3_NAME
    override val price: Double = BurgerResources.BURGER3_PRICE
    override val description: String = BurgerResources.BURGER3_DESCRIPTION
}