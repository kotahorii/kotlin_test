fun main() {
    printOddOrEvenNumberText(3)
}


fun printOddOrEvenNumberText(num: Int) {
    val text = if (num % 2 == 1) {
        "偶数"
    } else {
        "奇数"
    }
    println(text)
}