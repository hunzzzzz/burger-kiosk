package kiosk

import menu.side.Side
import menu.drink.Drink
import menu.Menu
import menu.burger.*
import resource.BurgerResources
import resource.Resources

class Kiosk {
    private val menuList =
        arrayListOf<Menu>(Burger(), Side(), Drink())
    private val burgerList = arrayListOf<Burger>(ShackBurger(), SmokeShack(), ShroomBurger(), BourbonBaconShack())
    fun start() {
        var option: String
        println(Resources.START_KIOSK)
        while (true) {
            showMenu()

            option = readln()
            when (option) {
                "1" -> showBurgerMenu()
                "4" -> {
                    println(Resources.QUIT_KIOSK)
                    return
                }
            }
        }
    }

    // [초기 화면] 메뉴를 보여주는 메서드
    private fun showMenu() {
        println(Resources.SHOW_OPTIONS)
        println(Resources.SHAKESHACK_MENU)
        for (i in menuList.indices) {
            println("${i + 1}. ${menuList[i]}")
        }
        println("4. ${Resources.QUIT_NAME} | ${Resources.QUIT_DESCRIPTION}")
    }

    // [Option 1] 버거 메뉴를 보여주는 메서드
    private fun showBurgerMenu() {
        println(BurgerResources.BURGER_MENU)
        for (i in burgerList.indices) {
            println("${i + 1}. ${burgerList[i]}")
        }
        println("5. ${BurgerResources.BACK_NAME} |\t\t| ${BurgerResources.BACK_DESCRIPTION}")
        chooseBurgerOption()
    }

    private fun chooseBurgerOption() {
        var option: String
        while (true) {
            option = readln()
            when (option) {
                "5" -> showMenu()
            }
        }
    }
}