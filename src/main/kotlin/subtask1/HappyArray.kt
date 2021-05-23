package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray = mutableListOf<Int>()
        for (i in sadArray) {
            happyArray.add(i)
        }
        if (happyArray.size != 0) {
            var isBad = true
            while (isBad) {
                for (i in 1 until happyArray.size) {
                    if (i != happyArray.size - 1) {
                        if (happyArray[i] > (happyArray[i - 1] + happyArray[i + 1])) {
                            happyArray.removeAt(i)
                            break
                        }
                    }
                    else {
                        isBad = false
                        break
                    }
                }
            }
        }
        return happyArray.toIntArray()
    }
}
