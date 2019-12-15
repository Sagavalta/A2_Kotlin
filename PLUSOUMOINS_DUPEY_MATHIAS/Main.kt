fun main(args: Array<String>) {

    var win: Boolean = false
    var count: Int = 1
    val targetNumber: Int
    var guessNumber: Int

    print("Player1, enter target number: ")

    targetNumber = readLine()!!.toInt()
    println("You entered the target number!")

    do {
        print("Player2, try $count, enter guess number: ")
        count++

        guessNumber = readLine()!!.toInt()

        when {
            guessNumber > targetNumber -> println("Add less! ")
            guessNumber < targetNumber -> println("Add more! ")
            else -> {
                print("You guessed it!")
                win = true
            }
        }

    } while (!win)
}