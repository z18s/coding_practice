package project_euler.set_1

/**
 * Even Fibonacci numbers. / Четные числа Фибоначчи.
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2,
 * the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the
 * even-valued terms.
 *
 * Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих. Начиная с 1 и 2, первые 10 элементов
 * будут:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.
 */

fun main() {
    val number = 4_000_000

    var a = 1
    var b = 2
    var result = 2

    while (true) {
        // Нахождение следующего элемента ряда Фибоначчи
        val next = a + b
        if (next > number) break

        // Сумма чётных значений
        if (next % 2 == 0) result += next
        a = b
        b = next
    }
    println("The sum of the even-valued terms of the Fibonacci sequence is $result.")
}