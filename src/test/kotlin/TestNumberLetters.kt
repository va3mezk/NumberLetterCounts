import org.junit.Test
import kotlin.test.assertEquals

class TestNumberLetters {
    @Test
    fun `test one`() = assertEquals(19, NumberLetters.countLetter(5))

    @Test
    fun `test fifty`() = assertEquals(389, NumberLetters.countLetter(50))

    @Test
    fun `test two hundred twenty-two`() = assertEquals(3068, NumberLetters.countLetter(222))

    @Test
    fun `test six hundred forty-five`() = assertEquals(11331, NumberLetters.countLetter(645))

    @Test
    fun `test one thousand`() = assertEquals(18451, NumberLetters.countLetter(1000))
}