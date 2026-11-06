package task4

fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    var i = 2
    while (i * i <= n) {
        if (n % i == 0) return false
        i++
    }
    return true
}

/**
 * Возвращает список первых n простых чисел, начиная с 2.
 */
fun firstPrimes(n: Int): List<Int> {
    require(n >= 1) { "n должно быть >= 1" }
    val result = mutableListOf<Int>()
    var candidate = 2
    while (result.size < n) {
        if (isPrime(candidate)) result += candidate
        candidate++
    }
    return result
}

fun runTask4() {
    print("Введите количество простых чисел n (n >= 1): ")
    val n = readln().trim().toIntOrNull()
    if (n == null || n < 1) {
        println("Некорректный ввод.")
        return
    }
    val primes = firstPrimes(n)
    primes.forEachIndexed { index, prime ->
        val suffix = when {
            (index + 1) % 100 in 11..14 -> "ое"
            (index + 1) % 10 == 1 -> "ое"
            (index + 1) % 10 in 2..4 -> "ое"
            else -> "ое"
        }
        println("${index + 1}-$suffix число: $prime")
    }
}
