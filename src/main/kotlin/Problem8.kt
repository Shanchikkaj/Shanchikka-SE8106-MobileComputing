fun main() {
    val nums = listOf(-2, 5, -1, 8, 0, 3)
    var sum = 0

    for (n in nums) {
        if (n > 0) sum += n
    }
    println("Sum of positive numbers = $sum")
}