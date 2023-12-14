package menu

abstract class Menu {
    abstract val name: String
    abstract val price: Double
    abstract val description: String

    override fun toString(): String {
        return if (this.price == 0.0)
            "${this.name}\t|\t${this.description}"
        else
            "${this.name}\t|\t${String.format("%4.1f", this.price)}\t|\t${this.description}"
    }
}