package menu

abstract class Menu {
    abstract val name: String
    abstract val price: Double
    abstract val description: String

    override fun toString(): String {
        return "${this.name} | ${this.description}"
    }
}