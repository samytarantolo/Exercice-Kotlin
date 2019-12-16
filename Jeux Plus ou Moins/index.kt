fun main(args: Array<String>) { // Menu

    println("Player1 : Enter a nomber\n") // Afficher les éléments
    val secretNumber = readLine()!!.toInt() //

    var Player1: Int
    var attempts=0

    while (true) {
        print("Player2 : Guess a nomber between (1 to 500): ")
        Player1 = readLine()!!.toInt()

        when (Player1.compareTo(secretNumber)) {
            -1 -> { println("Bigger"); attempts++ }
            0 -> { attempts++; println("Congratulations ! You win $attempts try !"); return }
            1 -> { println("Smaller"); attempts++ }
        }
    }
}