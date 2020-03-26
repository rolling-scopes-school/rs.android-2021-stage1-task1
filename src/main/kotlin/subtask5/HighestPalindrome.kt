package subtask5

class HighestPalindrome {
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var counter = 0
        for (i in 0 until n / 2) {
            if (digitString[i] != digitString[n - i - 1]) {
                counter++
            }
        }
        if (counter > k) {
            return "-1"
        }
        val result = digitString.toMutableList()

        if (counter == 1 && n % 2 == 1) {
            result[n / 2] = '9'
        }

        for (i in 0 until n / 2) {
            println(digitString[i] + ":" + digitString[n - i - 1])
            if (digitString[i] < digitString[n - i - 1]) {
                println(digitString[i])
                result[i] = digitString[n - i - 1]
                counter--
            } else if (digitString[i] > digitString[n - i - 1]) {
                result[n - 1 - i] = result[i]
                counter--
            }
        }

        counter = k - counter
        var i = 0
        while (counter > 1) {
            if (result[i] != '9') {
                result[i] = '9'
                result[n - 1 - i] = '9'
                counter -=2
            }
            i++
        }
        val stringBuilder = StringBuilder()
        result.forEach { stringBuilder.append(it) }
        return stringBuilder.toString()
    }
}
