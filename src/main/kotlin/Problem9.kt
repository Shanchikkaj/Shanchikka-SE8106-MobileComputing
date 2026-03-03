fun main() {
    val secret = 7
    var guess: Int?

    do {
        print("Guess a number between 1 and 10: ")
        guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Please enter a valid number.")
        } else if (guess != secret) {
            println("Wrong, try again.")
        }

    } while (guess != secret)

    println("Correct!")
}