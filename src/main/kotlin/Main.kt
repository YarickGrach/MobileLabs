import task1.runTask1
import task2.runTask2
import task3.runTask3
import task4.runTask4
import task5.runTask5
import task6.runTask6
import task7.runTask7
import task8.runTask8
import task9.runTask9
import task10.runTask10

fun main() {
    while (true) {
        println(
            """
            |=== Лабораторная работа №0. Основы Kotlin ===
            |1  - Сумма первой и последней цифры числа
            |2  - Статистика введённых чисел до 0
            |3  - Угадай число
            |4  - Первые n простых чисел
            |5  - Элементы массива больше соседних
            |6  - Произведение, min и max массива
            |7  - Квадратное уравнение
            |8  - Класс с массивом чисел
            |9  - Класс Vector
            |10 - Класс Vehicle и наследники
            |0  - Выход
            |Выберите задание: 
            """.trimMargin()
        )
        when (readlnOrNull()?.trim()) {
            "1"  -> runTask1()
            "2"  -> runTask2()
            "3"  -> runTask3()
            "4"  -> runTask4()
            "5"  -> runTask5()
            "6"  -> runTask6()
            "7"  -> runTask7()
            "8"  -> runTask8()
            "9"  -> runTask9()
            "10" -> runTask10()
            "0"  -> return
            else -> println("Неизвестная команда")
        }
        println()
    }
}
