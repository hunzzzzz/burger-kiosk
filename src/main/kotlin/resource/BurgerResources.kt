package resource

class BurgerResources : Resources() {
    override val menu = "\n[ BURGER MENU ]"

    companion object {
        // 버거 메뉴
        const val BURGER1_NAME = "쉑 버거"
        const val BURGER1_PRICE = 8.4
        const val BURGER1_DESCRIPTION = "비프 패티와 함께 토마토, 양상추, 쉑소스가 토핑된 치즈버거"
        const val BURGER2_NAME = "스모크 쉑"
        const val BURGER2_PRICE = 10.6
        const val BURGER2_DESCRIPTION = "애플 우드 칩으로 훈연한 짭짤한 베이컨, 매콤한 체리 페퍼, 비프 패티와 쉑소스가 토핑된 치즈버거"
        const val BURGER3_NAME = "슈룸 버거"
        const val BURGER3_PRICE = 10.0
        const val BURGER3_DESCRIPTION = "치즈로 속을 채워 바삭하게 튀겨낸 포토벨로 버섯 패티에 양상추, 토마토, 쉑소스를 올린 베지테리안 버거"
        const val BURGER4_NAME = "버번 쉑"
        const val BURGER4_PRICE = 12.9
        const val BURGER4_DESCRIPTION = "메이커스 마크 위스키를 활용한 버번 베이컨 잼, 바삭하게 튀긴 적양파, 화이트 체다 치즈가 올라간 비프 버거"
    }
}