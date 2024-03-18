fun main() {
    val i = 4
    val d = 4.0
    val s = "HackerRank "

    val intNumber = readln().toInt()
    val doubleNumber = readln().toDouble()
    val stringValue = readLine()

    val sum1 = intNumber + i
    val sum2 = doubleNumber + d

    println("${sum1}\n${String.format("%.1f", sum2)}\n" + s + stringValue)
}