package resource

class Resources {
    companion object {
        // 키오스크 시작
        const val START_KIOSK = "\\\\\\\\\\ SHAKE SHACK 버거에 오신 것을 환영합니다. /////"
        const val SHOW_OPTIONS = "\n아래 메뉴판을 보시고 메뉴를 골라 입력해주세요."

        // 쉑쉑버거 메뉴
        const val SHAKESHACK_MENU = "\n[ SHAKESHACK MENU ]"
        const val BURGER_NAME = "햄버거\t"
        const val BURGER_DESCRIPTION = "\t앵거스 비프 통살을 다져만든 버거입니다."
        const val SIDE_NAME = "사이드 메뉴"
        const val SIDE_DESCRIPTION = "\t버거를 먹을 때 사이드 메뉴가 빠져서는 안되죠!"
        const val DRINK_NAME = "음료\t\t"
        const val DRINK_DESCRIPTION = "\t매장에서 직접 만드는 시원한 음료들도 잊지 마세요."
        const val QUIT_NAME = "종료\t\t"
        const val QUIT_DESCRIPTION = "\t프로그램을 종료합니다."
        const val CHOOSE_WRONG_OPTION = "잘못된 값을 입력하셨습니다. 다시 입력해주세요."

        // 키오스크 종료
        const val QUIT_KIOSK = "키오스크를 종료합니다. 좋은 하루 되세요!"
    }
}