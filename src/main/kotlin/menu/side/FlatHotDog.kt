package menu.side

import resource.SideResources

class FlatHotDog : Side() {
    override val name: String = SideResources.SIDE3_NAME
    override val price: Double = SideResources.SIDE3_PRICE
    override val description: String = SideResources.SIDE3_DESCRIPTION
}