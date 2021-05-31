package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val openBrackets = listOf('(', '<', '[')
        val closeBrackets = listOf(')', '>', ']')

        val result = ArrayList<String>()
        val string = StringBuilder(inputString)
        var lastBracket = 0
        for (i in string.length - 1 downTo 0) {
            if (openBrackets.contains(string[i])) {
                for (j in i until string.length) {
                    if (string[j] == closeBrackets[openBrackets.indexOf(inputString[i])]) {
                        lastBracket = j
                        string[lastBracket] = '_'
                        string[i] = '_'
                        break
                    }
                }
                result.add(0, inputString.substring(i + 1, lastBracket))
            }
        }
        return result.toTypedArray()
    }
    }
}
