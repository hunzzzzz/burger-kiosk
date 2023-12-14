package menu.drink

import menu.Menu
import resource.Resources

open class Drink : Menu() {
    override val name: String
        get() = Resources.DRINK_NAME
    override val price: Double
        get() = 0.0
    override val description: String
        get() = Resources.DRINK_DESCRIPTION
}