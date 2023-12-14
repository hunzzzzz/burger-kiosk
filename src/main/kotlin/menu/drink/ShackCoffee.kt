package menu.drink

import resource.DrinkResources

class ShackCoffee : Drink() {
    override val name: String = DrinkResources.DRINK3_NAME
    override val price: Double = DrinkResources.DRINK3_PRICE
    override val description: String = DrinkResources.DRINK3_DESCRIPTION
}