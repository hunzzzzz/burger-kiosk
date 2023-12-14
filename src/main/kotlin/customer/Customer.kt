package customer

class Customer(name: String, amount: Double) {
    private val customerName: String
    private var customerAmount: Double

    init {
        this.customerName = name
        this.customerAmount = amount
    }

    fun getCustomerAmount() = this.customerAmount

    fun spendMoney(money: Double) {
        this.customerAmount += money
    }
}