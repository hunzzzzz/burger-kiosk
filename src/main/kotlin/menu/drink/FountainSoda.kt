package menu.drink

import resource.DrinkResources

class FountainSoda : Drink() {
    override val name: String = DrinkResources.DRINK1_NAME
    override val price: Double = DrinkResources.DRINK1_PRICE
    override val description: String = DrinkResources.DRINK1_DESCRIPTION
}