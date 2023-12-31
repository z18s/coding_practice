package project_euler.set_1

/**
 * Multiples of 3 and 5. / Числа, кратные 3 или 5.
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
 * multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.
 * Найдите сумму всех чисел меньше 1000, кратных 3 или 5.
 */

fun main() {
    val number = 1_000

    var result = 0

    for (i in (1 until number).filter { it % 3 == 0 || it % 5 == 0 }) {
        result += i
    }
    println("The sum of all the multiples of 3 or 5 below $number is $result.")
}