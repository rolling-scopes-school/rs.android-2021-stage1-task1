import org.junit.Test
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertTrue
import subtask3.StringParser

class Task1StringParserTest {

    private val stringParser = StringParser()

    @Test
    fun testStringParser1() {
        val inputStr = "It's a <simple> [input] (string)"
        val result = arrayOf("simple", "input", "string")
        assertArrayEquals(result, stringParser.getResult(inputStr))
    }

    @Test
    fun testStringParser2() {
        val inputStr = "It's so special<link>. " +
                "The numbers(3500) are incredible, so difficult." +
                " I said we wanted to write our own stories, create our own history," +
                " said Klopp(the boss of Liverpool[English football club])."
        val result = arrayOf("link", "3500", "the boss of Liverpool[English football club]", "English football club")
        assertArrayEquals(result, stringParser.getResult(inputStr))
    }

    @Test
    fun testStringParser3() {
        val inputStr = "Lorem <(ipsum [dolor <sit] amet), consectetur adipiscing elit>. " +
                "Integer nec odio. Praesent libero. " +
                "Sed cursus ante dapibus diam. Sed nisi. " +
                "Nulla quis sem at nibh elementum imperdiet>. " +
                "Duis sagittis ipsum. Praesent mauris. " +
                "Fusce nec tellus sed augue semper porta. " +
                "Mauris massa. Vestibulum lacinia arcu eget (nulla. " +
                "Class aptent <taciti [sociosqu ad] litora torquent per conubia> nostra), per inceptos himenaeos."
        val parsedArray = stringParser.getResult(inputStr)

        val testSubStr1 = "(ipsum [dolor <sit] amet), consectetur adipiscing elit>. " +
                "Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. " +
                "Sed nisi. Nulla quis sem at nibh elementum imperdiet"
        assertTrue(testSubStr1 in parsedArray)

        val testSubStr2 = "ipsum [dolor <sit] amet"
        assertTrue(testSubStr2 in parsedArray)

        val testSubStr3 = "(ipsum [dolor <sit] amet), consectetur adipiscing elit>. Integer nec odio. " +
                "Praesent libero. Sed cursus ante dapibus diam. Sed nisi. Nulla quis sem at nibh elementum imperdiet"
        assertTrue(testSubStr3 in parsedArray)

        val testSubStr4 = "sit] amet), consectetur adipiscing elit"
        assertTrue(testSubStr4 in parsedArray)

        val testSubStr5 = "dolor <sit"
        assertTrue(testSubStr5 in parsedArray)

        val testSubStr6 = "nulla. Class aptent <taciti [sociosqu ad] litora torquent per conubia> nostra"
        assertTrue(testSubStr6 in parsedArray)

        val testSubStr7 = "taciti [sociosqu ad] litora torquent per conubia"
        assertTrue(testSubStr7 in parsedArray)

        val testSubStr8 = "sociosqu ad"
        assertTrue(testSubStr8 in parsedArray)
    }
}
