import java.util.*

class Person(private var age: Int) {
    init {
        if (age < 0) {
            println("Age is not valid, setting age to 0..")
            age = 0
        }
    }

    fun amIOld() {
        if (age < 13)
            println("You are young..")
        else if (age in 13..17)
            println("You are a teenager..")
        else
            println("You are old..")
    }

    fun yearPasses() {
        age++
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sc = Scanner(System.`in`)
            val T = sc.nextInt()
            for (i in 0 until T) {
                val age = sc.nextInt()
                val p = Person(age)
                p.amIOld()
                for (j in 0..2) {
                    p.yearPasses()
                }
                p.amIOld()
                println()
            }
            sc.close()
        }
    }
}