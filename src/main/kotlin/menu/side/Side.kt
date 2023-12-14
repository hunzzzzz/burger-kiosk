package menu.side

import menu.Menu
import resource.Strings

class Side : Menu() {
    override val name: String
        get() = Strings.SIDE_NAME
    override val price: Double
        get() = 0.0
    override val description: String
        get() = Strings.SIDE_DESCRIPTION
}