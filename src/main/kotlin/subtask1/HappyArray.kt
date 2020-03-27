package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var resultArray = intArrayOf()
        if (sadArray.isEmpty() || (sadArray.count() < 3)) {
            resultArray = sadArray
        }

        resultArray = sadArray
        var arr1: IntArray
        do {
            arr1 = resultArray
            resultArray = resultArray.filterIndexed { index, value ->
                if ((index == 0) || (index == resultArray.count() - 1)) {
                    true
                } else {
                    value <= (resultArray.get(index - 1) + resultArray.get(index + 1))
                }
            }.toIntArray()

        } while (arr1.count() != resultArray.count())

        return resultArray
    }
}
