fun main() {
    val items = listOf("A", "B", "C", "D")
    val reversed = mutableListOf<String>()

    for (i in items.size - 1 downTo 0) {
        reversed.add(items[i])
    }
    println("Reversed: $reversed")
}