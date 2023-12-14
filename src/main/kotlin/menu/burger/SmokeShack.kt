package menu.burger

import resource.Strings

class SmokeShack : Burger() {
    override val name: String = Strings.BURGER2_NAME
    override val price: Double = Strings.BURGER2_PRICE
    override val description: String = Strings.BURGER2_DESCRIPTION
}