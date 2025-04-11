import org.junit.jupiter.api.Assertions.*
import org.practice.ProjectEulerQ1
import org.junit.jupiter.api.Test

class TestProjectEulerQ1 {

    private val testClass = ProjectEulerQ1()

    @Test
    fun testCase1() {
        val result = testClass.solution(10)
        assertEquals(23, result)
    }

    fun testCase2() {
        val result = testClass.solution(10)
        assertEquals(233168, result)
    }

}