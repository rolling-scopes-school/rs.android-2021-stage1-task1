package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {

        val resultList = mutableListOf<Int>()

        if (sadArray.isNotEmpty()) {
            resultList.add(sadArray[0])
            for (i in 1 until sadArray.lastIndex) {
                when {
                    (sadArray[i] <= resultList.last() + sadArray[i + 1]) -> resultList.add(sadArray[i])
                    else -> {
                        for (j in resultList.lastIndex downTo 1) {
                            if (resultList[j] > resultList[j - 1] + sadArray[i + 1]) resultList.removeAt(j)
                        }
                    }
                }
            }
            resultList.add(sadArray.last())
        }
        return resultList.toIntArray()
    }
}

