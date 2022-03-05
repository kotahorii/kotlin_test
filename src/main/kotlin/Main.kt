import java.time.LocalDateTime

fun main() {
    val now = Time(LocalDateTime.now())
    println(now.time)
}

class CompanyConstants {
    companion object {
        @JvmStatic
        val maxEmployeeCount = 100
    }
}