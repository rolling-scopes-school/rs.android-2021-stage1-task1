package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val result: MutableList<String> = mutableListOf()
        inputString.forEachIndexed { index, s ->
            when (s) {
                '(' -> result.add(getSubString(inputString, index, '(', ')'))
                '[' -> result.add(getSubString(inputString, index, '[', ']'))
                '<' -> result.add(getSubString(inputString, index, '<', '>'))
            }
        }
        return result.toTypedArray()
    }

    private fun getSubString(inputString: String, index: Int, openingChar: Char, closingChar: Char): String {
        var i = index
        var n = 0
        while (n < 1) {
            i++
            if (inputString[i] == openingChar)
                n--
            if (inputString[i] == closingChar)
                n++
        }
        return (inputString.substring(index + 1, i))
    }
}
