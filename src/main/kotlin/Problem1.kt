fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6)
    var sum = 0
    for (i in nums) {
        if (i % 2 == 0) sum += i
    }
    println("Sum of even numbers = $sum")
}