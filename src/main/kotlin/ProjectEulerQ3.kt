package org.practice

fun main() {
    val x = ProjectEulerQ3()
    println(x.solution(600851475143))
}

class ProjectEulerQ3 {

    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143?
     * */

    fun solution(number: Long): Long {

        var largestFactor = 1L

        for (i in 3..number / 2 step 2) {
            if (i % 3 == 0L || i % 5 == 0L || i % 7 == 0L) {
                continue
            }
            if (number % i == 0L) {
                if (isPrime(i)) {
                    largestFactor = i
                    println("\n$i is prime and divides that no.")
                }
            }
        }

        return largestFactor
    }

    fun isPrime(num: Long): Boolean {
        for (i in 2..num / 2)
            if (num % i == 0L)
                return false

        return true
    }
}