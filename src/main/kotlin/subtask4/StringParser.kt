package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var resutlStr = arrayOf<String>()

        val brackets = mapOf("[" to "]", "(" to ")", "<" to ">")

        inputString.forEachIndexed { index, c ->
            val openBracket = c.toString()

            if (brackets.containsKey(openBracket)) {
                val closeBracket = brackets.getValue(openBracket)

                var startIndex = index + 1
                var endIndex = startIndex

                while(endIndex >= 0) {
                    endIndex = inputString.indexOf(closeBracket, startIndex)
                    if (endIndex != -1) {
                        val string = inputString.substring(index + 1, endIndex)
                        if (string.count{ c -> c.toString() == openBracket } != string.count{ c -> c.toString() == closeBracket}) {
                            startIndex = endIndex + 1
                            continue
                        }
                        println(string)
                        resutlStr += string
                        break
                    }
                }

            }
        }

        return resutlStr
    }
}
