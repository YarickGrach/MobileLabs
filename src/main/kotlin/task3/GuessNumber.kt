package task3

import kotlin.random.Random

/**
 * Одна итерация проверки: -1 — «Мало», 1 — «Много», 0 — «Угадал».
 */
fun checkGuess(target: Int, guess: Int): Int = when {
    guess > target -> 1
    guess < target -> -1
    else -> 0
}

fun runTask3() {
    val target = (0..10).random()
    println("Программа загадала число от 0 до 10. Попробуйте угадать!")

    while (true) {
        print("Ваш вариант: ")
        val guess = readln().trim().toIntOrNull()
        if (guess == null) {
            println("Введите целое число.")
            continue
        }
        when (checkGuess(target, guess)) {
            1 -> println("Много")
            -1 -> println("Мало")
            else -> {
                println("Угадал!")
                return
            }
        }
    }
}
