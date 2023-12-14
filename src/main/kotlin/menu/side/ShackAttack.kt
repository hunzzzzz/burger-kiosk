package menu.side

import resource.SideResources

class ShackAttack : Side() {
    override val name: String = SideResources.SIDE2_NAME
    override val price: Double = SideResources.SIDE2_PRICE
    override val description: String = SideResources.SIDE2_DESCRIPTION
}