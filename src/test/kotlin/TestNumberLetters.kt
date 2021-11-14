import org.junit.Test
import kotlin.test.assertEquals

class TestNumberLetters {
    @Test
    fun `test #1`() = assertEquals(19, NumberLetters.countLetter(5))

    @Test
    fun `test #2`() = assertEquals(389, NumberLetters.countLetter(50))

    @Test
    fun `test #3`() = assertEquals(3068, NumberLetters.countLetter(222))

    @Test
    fun `test #4`() = assertEquals(11331, NumberLetters.countLetter(645))

    @Test
    fun `test #5`() = assertEquals(18451, NumberLetters.countLetter(1000))
}