package org.practice
import java.io.IO.println
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    for (i in 1..5) {
        println("i = $i")
    }

    val fizzBuzz = FizzBuzz()
    println(fizzBuzz.isDivisibleByThree(3))
}

class FizzBuzz {
    fun isDivisibleByThree(x: Int): Boolean {
        return (x % 3) == 0
    }
}