package task2

/**
 * Считывает числа с клавиатуры до ввода 0 (не включая 0).
 * Возвращает тройку: количество, сумма, среднее.
 */
fun collectStats(numbers: List<Int>): Triple<Int, Int, Double> {
    val count = numbers.size
    val sum = numbers.sum()
    val avg = if (count == 0) 0.0 else sum.toDouble() / count
    return Triple(count, sum, avg)
}

fun runTask2() {
    val collected = mutableListOf<Int>()
    println("Вводите числа (0 — завершение):")

    while (true) {
        val line = readln().trim()
        val value = line.toIntOrNull()
        if (value == null) {
            println("Пожалуйста, введите целое число.")
            continue
        }
        if (value == 0) break
        collected += value
    }

    val (count, sum, avg) = collectStats(collected)
    println("Количество введённых чисел: $count")
    println("Сумма: $sum")
    println("Среднее арифметическое: $avg")
}
