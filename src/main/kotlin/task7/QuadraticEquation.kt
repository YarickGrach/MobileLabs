package task7

import kotlin.math.sqrt

fun sqr(n: Double): Double = n * n

fun discriminant(a: Double, b: Double, c: Double): Double =
    sqr(b) - 4 * a * c

/**
 * Возвращает количество корней (0, 1 или 2).
 * Если a == 0 — это не квадратное уравнение, выбрасываем исключение.
 */
fun rootsNumber(a: Double, b: Double, c: Double): Int {
    require(a != 0.0) { "a должно быть != 0" }
    return when {
        discriminant(a, b, c) > 0 -> 2
        discriminant(a, b, c) == 0.0 -> 1
        else -> 0
    }
}

/**
 * Печатает корни квадратного уравнения.
 */
fun quadraticRoot(a: Double, b: Double, c: Double) {
    if (a == 0.0) {
        println("Не квадратное уравнение (a = 0).")
        return
    }
    val d = discriminant(a, b, c)
    when (rootsNumber(a, b, c)) {
        2 -> {
            val x1 = (-b + sqrt(d)) / (2 * a)
            val x2 = (-b - sqrt(d)) / (2 * a)
            println("Два корня: x1 = $x1, x2 = $x2")
        }
        1 -> {
            val x = -b / (2 * a)
            println("Один корень: x = $x")
        }
        else -> println("Корней нет (D < 0)")
    }
}

fun runTask7() {
    print("Введите a b c: ")
    val parts = readln().trim().split(Regex("\\s+"))
    if (parts.size != 3) {
        println("Нужно 3 коэффициента.")
        return
    }
    val (a, b, c) = parts.map { it.toDouble() }
    println("D = ${discriminant(a, b, c)}")
    quadraticRoot(a, b, c)
}
