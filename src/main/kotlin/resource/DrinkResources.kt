package resource

class DrinkResources : Resources() {
    override val menu = "\n[ DRINK MENU ]"

    companion object {
        // 음료 메뉴
        const val DRINK1_NAME = "탄산음료"
        const val DRINK1_PRICE = 2.9
        const val DRINK1_DESCRIPTION = "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플"
        const val DRINK2_NAME = "레몬에이드"
        const val DRINK2_PRICE = 4.3
        const val DRINK2_DESCRIPTION = "매장에서 직접 만드는 상큼한 레몬에이드"
        const val DRINK3_NAME = "아메리카노"
        const val DRINK3_PRICE = 3.5
        const val DRINK3_DESCRIPTION = "쉑 블렌드 원두를 사용한 밸런스 좋은 블랙 커피"
        const val DRINK4_NAME = "무알콜 맥주"
        const val DRINK4_PRICE = 4.8
        const val DRINK4_DESCRIPTION = "청량감 있는 독특한 미국식 무알콜 탄산음료"
    }
}