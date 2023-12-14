package menu.burger

import menu.Menu
import resource.Strings

open class Burger() : Menu() {
    override val name: String = Strings.BURGER_NAME
    override val price: Double = 0.0
    override val description: String = Strings.BURGER_DESCRIPTION
}