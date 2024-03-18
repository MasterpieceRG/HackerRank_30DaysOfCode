fun main() {
    val n = readln().toInt()

    if(n % 2 == 0 && n>=2 && n<=5) {
        println("Not Weird")
    }else if(n % 2 == 0 && n>=6 && n<=20) {
        println("Weird")
    }else if(n % 2 == 0 && n>20) {
        println("Not Weird")
    }else {
        println("Weird")
    }
}