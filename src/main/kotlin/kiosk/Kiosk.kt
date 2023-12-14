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
    private val burgerList = arrayListOf<Burger>(ShackBurger(), SmokeShack(), ShroomBurger(), BourbonShack())
    private val sideList = arrayListOf<Side>(CheeseFries(), ShackAttack(), FlatHotDog(), ChickenBites())
    private val drinkList = arrayListOf<Drink>(FountainSoda(), Lemonade(), ShackCoffee(), RootBeer())
    private val payList = arrayListOf<Menu>() // 장바구니

    fun start() {
        var option: String
        println(Resources.START_KIOSK)
        while (true) {
            Thread.sleep(500)
            showMenu()

            option = readln()
            when (option) {
                "1" -> showBurgerMenu()
                "2" -> showSideMenu()
                "3" -> showDrinkMenu()
                "4" -> {
                    println(Resources.QUIT_KIOSK)
                    return
                }

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
        println("4. ${Resources.QUIT_NAME}\t\t|\t${Resources.QUIT_DESCRIPTION}")
    }

    // [Option 1] 버거 메뉴를 보여주는 메서드
    private fun showBurgerMenu() {
        var option: String

        while (true) {
            Thread.sleep(500)
            println(BurgerResources.BURGER_MENU)
            for (i in burgerList.indices) {
                println("${i + 1}. ${burgerList[i]}")
            }
            println("5. ${Resources.BACK_NAME}\t\t|\t\t\t|\t${Resources.BACK_DESCRIPTION}")

            option = readln()
            when (option) {
                "1", "2", "3", "4" -> putInPayList(burgerList[option.toInt() - 1])
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

    // [Option 2] 사이드 메뉴를 보여주는 메서드
    private fun showSideMenu() {
        var option: String

        while (true) {
            Thread.sleep(500)
            println(SideResources.SIDE_MENU)
            for (i in sideList.indices) {
                println("${i + 1}. ${sideList[i]}")
            }
            println("5. ${Resources.BACK_NAME} |\t\t| ${SideResources.BACK_DESCRIPTION}")

            option = readln()
            when (option) {
                "5" -> return
                else -> {
                    System.err.println(Resources.CHOOSE_WRONG_OPTION)
                }
            }
        }
    }

    // [Option 3] 음료 메뉴를 보여주는 메서드
    private fun showDrinkMenu() {
        var option: String

        while (true) {
            Thread.sleep(500)
            println(DrinkResources.DRINK_MENU)
            for (i in drinkList.indices) {
                println("${i + 1}. ${drinkList[i]}")
            }
            println("5. ${Resources.BACK_NAME} |\t\t| ${Resources.BACK_DESCRIPTION}")

            option = readln()
            when (option) {
                "5" -> return
                else -> {
                    System.err.println(Resources.CHOOSE_WRONG_OPTION)
                }
            }
        }
    }


}