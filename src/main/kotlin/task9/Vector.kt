package task9

import kotlin.math.sqrt

class Vector(val x: Double, val y: Double, val z: Double) {

    /** Длина вектора. */
    fun length(): Double = sqrt(x * x + y * y + z * z)

    /** Скалярное произведение с другим вектором (метод). */
    infix fun dot(other: Vector): Double =
        x * other.x + y * other.y + z * other.z

    /** Перегрузка оператора * для скалярного произведения. */
    operator fun times(other: Vector): Double = this dot other

    /** Инфиксная запись (использование ключевого слова infix). */
    fun scalarProductInfix(other: Vector): Double = this dot other

    override fun toString(): String = "Vector($x, $y, $z)"
}

/** Внешняя функция скалярного произведения. */
fun scalarProduct(v1: Vector, v2: Vector): Double = v1 dot v2

fun runTask9() {
    val v1 = Vector(1.0, 2.0, 3.0)
    val v2 = Vector(3.0, 2.0, 1.0)

    println("v1 = $v1, v2 = $v2")
    println("Длина v1: ${v1.length()}")
    println("Длина v2: ${v2.length()}")
    println("Скалярное произведение (метод): ${v1 dot v2}")
    println("Скалярное произведение (оператор *): ${v1 * v2}")
    println("Скалярное произведение (внешняя функция): ${scalarProduct(v1, v2)}")
}
