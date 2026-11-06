package task6

fun productForLoop(array: IntArray): Long {
    var product = 1L
    for (e in array) product *= e
    return product
}

fun productWhileLoop(array: IntArray): Long {
    var product = 1L
    var i = 0
    while (i < array.size) {
        product *= array[i]
        i++
    }
    return product
}

fun productForEach(array: IntArray): Long {
    var product = 1L
    array.forEach { product *= it }
    return product
}

fun productReduce(array: IntArray): Long {
    return array.fold(1L) { acc, e -> acc * e }
}

fun findMin(array: IntArray): Int = array.min()

fun findMax(array: IntArray): Int = array.max()

fun runTask6() {
    val array = intArrayOf(3, 5, -2, 7, 4)
    println("Массив: ${array.joinToString()}")

    println("Произведение (for):      ${productForLoop(array)}")
    println("Произведение (while):    ${productWhileLoop(array)}")
    println("Произведение (forEach):  ${productForEach(array)}")
    println("Произведение (reduce):   ${productReduce(array)}")

    println("Min элемент: ${findMin(array)}")
    println("Max элемент: ${findMax(array)}")
}
