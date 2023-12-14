package kiosk

import menu.side.Side
import menu.drink.Drink
import menu.Menu
import menu.burger.*
import resource.Strings

class Kiosk {
    private val menuList =
        arrayListOf<Menu>(Burger(), Side(), Drink())
    private val burgerList = arrayListOf<Burger>(ShackBurger(), SmokeShack(), ShroomBurger(), BourbonBaconShack())
    fun start() {
        var option: String
        println(Strings.START_KIOSK)
        while (true) {
            showMenu()

            option = readln()
            when (option) {
                "1" -> showBurgerMenu()
                "4" -> {
                    println(Strings.QUIT_KIOSK)
                    return
                }
            }
        }
    }

    // [초기 화면] 메뉴를 보여주는 메서드
    private fun showMenu() {
        println(Strings.SHOW_OPTIONS)
        println(Strings.SHAKESHACK_MENU)
        for (i in menuList.indices) {
            println("${i + 1}. ${menuList[i]}")
        }
        println("4. ${Strings.QUIT_NAME} | ${Strings.QUIT_DESCRIPTION}")
    }

    // [Option 1] 버거 메뉴를 보여주는 메서드
    private fun showBurgerMenu() {
        println(Strings.BURGER_MENU)
        for (i in burgerList.indices) {
            println("${i + 1}. ${burgerList[i]}")
        }
        println("5. ${Strings.BACK_NAME} |\t\t| ${Strings.BACK_DESCRIPTION}")
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