package menu.side

import menu.Menu
import resource.Resources

open class Side : Menu() {
    override val name: String
        get() = Resources.SIDE_NAME
    override val price: Double
        get() = 0.0
    override val description: String
        get() = Resources.SIDE_DESCRIPTION
}