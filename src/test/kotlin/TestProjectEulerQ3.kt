import org.junit.jupiter.api.Assertions.*
import org.practice.ProjectEulerQ3
import org.junit.jupiter.api.Test

class TestProjectEulerQ3 {

    private val testClass = ProjectEulerQ3()

    @Test
    fun testCase1() {
        val result = testClass.solution(13195)
        assertEquals(29, result)
    }

    @Test
    fun testCase2() {
        val result = testClass.solution(600851475143)
        assertEquals(6857, result)
    }

}