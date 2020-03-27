package subtask5

import kotlin.math.max

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        val intMaxVal = maxPalindrome(digitString, k)

        return intMaxVal
    }

    fun maxPalindrome(str: String, kkk: Int): String {
        var availableSwaps = kkk
        var palin = mutableListOf<Int>()
        str.forEach { c -> palin.add(c.toString().toInt()) }

        var l = 0
        var r = str.length - 1


        while (l <= r && availableSwaps > 0) {
            if (l == r) {
                palin[l] = 9
            }

            if (palin[l] != palin[r]) {
                if (availableSwaps >= 2){
                    if (palin[l] != 9) {
                        palin[l] = 9
                        availableSwaps--
                    }

                    if (palin[r] != 9) {
                        palin[r] = 9
                        availableSwaps--
                    }
                } else if (availableSwaps == 1) {
                    var m = max(palin[l], palin[r])
                    palin[l] = m
                    palin[r] = m
                    availableSwaps--
                }
            } else {
                if (availableSwaps >= 2) {
                    if (palin[l] != 9) {
                        palin[l] = 9
                        availableSwaps--
                    }

                    if (palin[r] != 9) {
                        palin[r] = 9
                        availableSwaps--
                    }
                }
            }

            l++
            r--
        }

        var result = palin.joinToString(separator = "")

        while (l < r) {
            if  (palin[l] != palin[r]) {
                result = "-1"
                break
            }
            l++
            r--
        }

        return result
    }
}