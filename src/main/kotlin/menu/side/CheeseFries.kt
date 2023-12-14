package menu.side

import resource.SideResources

class CheeseFries : Side() {
    override val name: String = SideResources.SIDE1_NAME
    override val price: Double = SideResources.SIDE1_PRICE
    override val description: String = SideResources.SIDE1_DESCRIPTION
}