package menu.drink

import resource.DrinkResources

class Lemonade : Drink() {
    override val name: String = DrinkResources.DRINK2_NAME
    override val price: Double = DrinkResources.DRINK2_PRICE
    override val description: String = DrinkResources.DRINK2_DESCRIPTION
}