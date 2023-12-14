package menu.burger

import resource.Strings

class ShroomBurger : Burger() {
    override val name: String = Strings.BURGER3_NAME
    override val price: Double = Strings.BURGER3_PRICE
    override val description: String = Strings.BURGER3_DESCRIPTION
}