package menu

abstract class Menu {
    abstract val name: String
    abstract val price: Double
    abstract val description: String

    override fun toString(): String {
        return if (this.price == 0.0)
            "${String.format("%4s", this.name)}\t|\t${this.description}"
        else
            "${String.format("%7s", this.name)}\t|\t${String.format("%4.1f", this.price)}\t|\t${this.description}"
    }
}