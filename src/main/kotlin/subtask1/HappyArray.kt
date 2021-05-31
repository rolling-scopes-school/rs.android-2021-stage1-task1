package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var i = 1
        var happyList = sadArray.toMutableList()
        while (i < happyList.size - 1) {
            if ( i != 0 && happyList[i] > happyList[i + 1] + happyList[i - 1]) {
                happyList.removeAt(i)
                i --
            } else {
                i ++
            }
        }
        return happyList.toIntArray()
    }
}
