fun main() {
    val nums = listOf(12, 5, 99, 34, 7)
    var max = nums[0]
    for (i in nums) {
        if (i > max) max = i
    }
    println("Maximum num is  = $max")
}