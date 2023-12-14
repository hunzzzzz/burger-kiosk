package menu.burger

import menu.Menu
import resource.Strings

class Burger() : Menu() {
    override val name: String
        get() = Strings.BURGER_NAME
    override val price: Double
        get() = 0.0
    override val description: String
        get() = Strings.BURGER_DESCRIPTION
}