import kotlin.math.round

fun main() {
    val price = readln().toDouble()
    val tipPercentage = readln().toInt()
    val taxPercentage = readln().toInt()

    val tip = price * tipPercentage / 100
    val tax = price * taxPercentage / 100
    val totalCost = price + tip + tax
    val totalCostInRound = round(totalCost)
    println(String.format("%.0f", totalCostInRound))
}