import customer.Customer
import kiosk.Kiosk

fun main() {
    val customer = Customer("Hun", 20000.0)
    val kiosk = Kiosk()
    kiosk.start(customer)
}