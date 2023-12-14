package menu.drink

import resource.DrinkResources

class RootBeer : Drink() {
    override val name: String = DrinkResources.DRINK4_NAME
    override val price: Double = DrinkResources.DRINK4_PRICE
    override val description: String = DrinkResources.DRINK4_DESCRIPTION
}