package org.example

fun main() {
    val x = ProjectEulerQ1()
    println(x.solution(1000))
}

class ProjectEulerQ1 {

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6, 9.
     * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
     * */

    fun solution(number: Int): Int {
        var sum = 0
        for (num in 1..< number) {
            if (isMultipleOfThree(num) || isMultipleOfFive(num))
                sum += num
        }

        return sum
    }

    private fun isMultipleOfThree(number:Int):Boolean {
        return (number % 3) == 0
    }

    private fun isMultipleOfFive(number:Int):Boolean {
        return (number % 5) == 0
    }
}