package menu.drink

import menu.Menu
import resource.Strings

class Drink : Menu() {
    override val name: String
        get() = Strings.DRINK_NAME
    override val price: Double
        get() = 0.0
    override val description: String
        get() = Strings.DRINK_DESCRIPTION
}