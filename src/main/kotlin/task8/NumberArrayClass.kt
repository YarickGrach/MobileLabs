package task8

class NumberArray(private val array: IntArray) {

    fun sumPositive(): Long =
        array.filter { it > 0 }.sumOf { it.toLong() }

    fun product(): Long {
        if (array.isEmpty()) return 0
        var p = 1L
        for (e in array) p *= e
        return p
    }

    fun average(): Double =
        if (array.isEmpty()) 0.0 else array.average()

    override fun toString(): String = "NumberArray(${array.joinToString()})"
}

fun runTask8() {
    val arr = intArrayOf(4, -2, 7, 0, -5, 3)
    val obj = NumberArray(arr)
    println(obj)
    println("Сумма положительных: ${obj.sumPositive()}")
    println("Произведение:        ${obj.product()}")
    println("Среднее:             ${obj.average()}")
}
