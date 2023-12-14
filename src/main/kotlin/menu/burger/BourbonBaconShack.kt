package menu.burger

import resource.Strings

class BourbonBaconShack : Burger() {
    override val name: String = Strings.BURGER4_NAME
    override val price: Double = Strings.BURGER4_PRICE
    override val description: String = Strings.BURGER4_DESCRIPTION
}