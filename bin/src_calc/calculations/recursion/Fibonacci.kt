package calculations.recursion

/**
 * Числа Фибоначчи (Fibonacci Sequence).
 *
 * Элементы числовой последовательности, в которой первые два числа равны 0 и 1, а каждое последующее число равно
 * сумме двух предыдущих чисел.
 *
 * > 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, …
 */

fun main() {
    val number = readln().toInt()
    // Обычная рекурсия
    println("The $number-th Fibonacci number is ${fibonacci(number)}.")

    // Оптимизированная рекурсия (с кешированием)
    val cache = IntArray(number + 1) { 0 }
    println("The $number-th Fibonacci number is ${fibonacciOptimised(number, cache)}.")
}

fun fibonacci(i: Int): Int =
    if (i == 0) {
        0
    } else if (i == 1) {
        1
    } else if (i > 1) {
        fibonacci(i - 1) + fibonacci(i - 2)
    } else {
        -1
    }

fun fibonacciOptimised(i: Int, cache: IntArray): Int =
    if (i == 0) {
        0
    } else if (i == 1) {
        1
    } else if (i > 1) {
        if (cache[i] == 0) cache[i] = fibonacciOptimised(i - 1, cache) + fibonacciOptimised(i - 2, cache)
        cache[i]
    } else {
        -1
    }