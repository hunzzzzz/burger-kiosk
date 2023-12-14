package kiosk

import menu.Menu
import menu.burger.*
import menu.drink.*
import menu.side.*
import resource.BurgerResources
import resource.DrinkResources
import resource.Resources
import resource.SideResources

class Kiosk {
    private val menuList = arrayListOf<Menu>(Burger(), Side(), Drink())
    private val burgerList = arrayListOf<Menu>(ShackBurger(), SmokeShack(), ShroomBurger(), BourbonShack())
    private val sideList = arrayListOf<Menu>(CheeseFries(), ShackAttack(), FlatHotDog(), ChickenBites())
    private val drinkList = arrayListOf<Menu>(FountainSoda(), Lemonade(), ShackCoffee(), RootBeer())
    private val payList = arrayListOf<Menu>() // 장바구니

    fun start() {
        var option: String
        println(Resources.START_KIOSK)
        while (true) {
            Thread.sleep(500)
            showMenu()

            option = readln()
            when (option) {
                "1" -> showMenuInDetail(BurgerResources(), burgerList)
                "2" -> showMenuInDetail(SideResources(), sideList)
                "3" -> showMenuInDetail(DrinkResources(), drinkList)
                "4" -> {
                    println(Resources.QUIT_KIOSK)
                    return
                }

                "5" -> {}
                else -> System.err.println(Resources.CHOOSE_WRONG_OPTION)
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
        println("4. ${String.format("%4s", Resources.QUIT_NAME)}\t|\t${Resources.QUIT_DESCRIPTION}")
        println(Resources.ORDER_MENU)
        println("5. ${String.format("%4s", Resources.ORDER_NAME)}\t|\t${Resources.ORDER_DESCRIPTION}")
        println("6. ${String.format("%4s", Resources.CLEAR_NAME)}\t|\t${Resources.CLEAR_DESCRIPTION}")
    }

    // 버거/사이드/음료 메뉴를 보여주는 메서드
    private fun showMenuInDetail(resources: Resources, list: ArrayList<Menu>) {
        var option: String

        while (true) {
            Thread.sleep(500)
            println(resources.getMenuName())
            for (i in list.indices) {
                println("${i + 1}. ${list[i]}")
            }
            println("5. ${String.format("%7s", Resources.BACK_NAME)}\t|\t\t\t|\t${Resources.BACK_DESCRIPTION}")

            option = readln()
            when (option) {
                "1", "2", "3", "4" -> putInPayList(list[option.toInt() - 1])
                "5" -> return
                else -> {
                    System.err.println(Resources.CHOOSE_WRONG_OPTION)
                }
            }
        }
    }

    // 메뉴를 클릭했을 때 장바구니에 담는 메서드
    private fun putInPayList(menu: Menu) {
        Thread.sleep(500)
        println()
        println(menu)
        println(Resources.ASK_TO_ADD_MENU)
        println(Resources.CHOOSE_BEFORE_ADD_MENU)

        val option = readln()
        when (option) {
            "1" -> {
                payList.add(menu)
                println("${menu.name}${Resources.ADD_MENU}")
            }

            "2" -> println(Resources.CANCEL_TO_ADD_MENU)
            else -> System.err.println(Resources.CHOOSE_WRONG_OPTION)
        }
    }

}