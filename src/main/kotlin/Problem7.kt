fun main() {
    val n = 5
    var fact = 1L

    for (i in 1..n) {
        fact *= i.toLong()
    }
    println("Factorial of $n = $fact")
}