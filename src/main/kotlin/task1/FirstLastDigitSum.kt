package task1

/**
 * Сумма первой и последней цифры целого положительного числа.
 */
fun sumFirstLastArithmetic(number: Int): Int {
    require(number > 0) { "Число должно быть положительным" }
    var n = number
    val last = n % 10
    while (n >= 10) n /= 10
    val first = n
    return first + last
}

/**
 * Сумма первой и последней цифры через строку.
 */
fun sumFirstLastString(number: String): Int {
    require(number.isNotEmpty()) { "Строка не должна быть пустой" }
    val first = number.first().digitToInt()
    val last = number.last().digitToInt()
    return first + last
}

fun runTask1() {
    println("Введите целое положительное число: ")
    val input = readln().trim()

    // Способ 1: арифметический
    val asInt = input.toInt()
    println("Способ 1 (арифметика): сумма = ${sumFirstLastArithmetic(asInt)}")

    // Способ 2: строковый
    println("Способ 2 (строки):      сумма = ${sumFirstLastString(input)}")
}
