package menu.burger

import menu.Menu
import resource.Resources

open class Burger() : Menu() {
    override val name: String = Resources.BURGER_NAME
    override val price: Double = 0.0
    override val description: String = Resources.BURGER_DESCRIPTION
}