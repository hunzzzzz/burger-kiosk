package menu.burger

import resource.BurgerResources
class BourbonBaconShack : Burger() {
    override val name: String = BurgerResources.BURGER4_NAME
    override val price: Double = BurgerResources.BURGER4_PRICE
    override val description: String = BurgerResources.BURGER4_DESCRIPTION
}