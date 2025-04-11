import org.junit.jupiter.api.Assertions.*
import org.practice.ProjectEulerQ2
import org.junit.jupiter.api.Test

class TestProjectEulerQ2 {

    private val testClass = ProjectEulerQ2()

    @Test
    fun testCase1() {
        val result = testClass.solution(90)
        assertEquals(44, result)
    }

    @Test
    fun testCase2() {
        val result = testClass.solution(4000000)
        assertEquals(4613732, result)
    }

}