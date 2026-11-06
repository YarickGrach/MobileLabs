package task5

/**
 * Возвращает элементы массива, которые больше и предыдущего, и следующего.
 * Первый и последний элемент не рассматриваются.
 */
fun localMaxElements(array: IntArray): List<Int> {
    if (array.size < 3) return emptyList()
    val result = mutableListOf<Int>()
    for (i in 1 until array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            result += array[i]
        }
    }
    return result
}

fun runTask5() {
    val array = intArrayOf(1, 3, 2, 6, 4, 9, 1, 8, 5)
    println("Массив: ${array.joinToString()}")
    val result = localMaxElements(array)
    println("Элементы, большие соседних: $result")
}
