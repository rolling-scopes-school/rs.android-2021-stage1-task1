package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val Digit = digitString.toCharArray()
        val isChanged = Array(n / 2) {false}
        var remainingChanges = k

        for (i in 0..(n / 2)) {
            if (Digit[i] != Digit[n - i - 1]) {
                if (remainingChanges == 0) {
                    return "-1"
                }
                Digit[i] = max(Digit[i], Digit[n - i - 1])
                Digit[n - i - 1] = max(Digit[i], Digit[n - i - 1])
                isChanged[i] = true
                remainingChanges--
            }
        }

        for (i in 0..(n / 2)) {
            if (((remainingChanges == 1 && isChanged[i]) || remainingChanges >= 2) && Digit[i] != '9') {
                Digit[i] = '9'
                Digit[n - i - 1] = '9'
                if (isChanged[i]) {
                    remainingChanges--
                } else {
                    remainingChanges -= 2
                }
            }
        }

        var str = ""
        for (i in Digit) {
            str += i
        }
        return str
    }

    private fun max(x: Char, y: Char) = if (x > y) x else y

}
