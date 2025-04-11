import org.junit.jupiter.api.Assertions.*
import org.practice.FizzBuzz
import org.junit.jupiter.api.Test

class TestFizzBuzz {

    @Test
    fun testFizzBuzz() {
        val fizzBuzz = FizzBuzz()
        assertEquals(true,fizzBuzz.isDivisibleByThree(3))
    }
}