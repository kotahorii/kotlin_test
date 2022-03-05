fun main() {
    val oddNumbers = mutableListOf<Int>().run {
        for (i in 1..10) {
            if (i % 2 == 1) add(i)
        }
        joinToString(separator = " ")
    }
    println(oddNumbers)
}

