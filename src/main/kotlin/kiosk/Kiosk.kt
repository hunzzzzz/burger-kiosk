package kiosk

import menu.side.Side
import menu.burger.Burger
import menu.drink.Drink
import menu.Menu
import resource.Strings

class Kiosk {
    private val menuList = arrayListOf<Menu>(Burger(), Side(), Drink())
    fun start() {
        var option: String
        println(Strings.START_KIOSK)
        while (true) {
            showMenu()

            option = readln()
            when (option) {
                "4" -> {
                    println(Strings.QUIT_KIOSK)
                    return
                }
            }
        }
    }

    // 메뉴를 보여주는 메서드
    private fun showMenu() {
        println(Strings.SHOW_OPTIONS)
        println(Strings.SHAKESHACK_MENU)
        for (i in menuList.indices) {
            println("${i + 1}. ${menuList[i]}")
        }
        println("4. ${Strings.QUIT_NAME} | ${Strings.QUIT_DESCRIPTION}")
    }
}