fun main() {
    val text = "Hello Kotlin"
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var count = 0

    for (i in text.lowercase()) {
        if (i in vowels) {
            count++
        }
    }

    println("Vowel count = $count")
}