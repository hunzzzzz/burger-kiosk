package menu.burger

import resource.BurgerResources

class SmokeShack : Burger() {
    override val name: String = BurgerResources.BURGER2_NAME
    override val price: Double = BurgerResources.BURGER2_PRICE
    override val description: String = BurgerResources.BURGER2_DESCRIPTION
}