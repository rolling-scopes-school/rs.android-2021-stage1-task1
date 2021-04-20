package subtask1

class HappyArray {
    // TODO: Complete the following function
    fun isHappy(Array: IntArray) : Boolean{
        for(i in 1..Array.size-2) {
            if (Array[i] > (Array[i - 1] + Array[i + 1]))
                return false
        }
        return true
    }
    fun makeHappy(sadArray: IntArray): IntArray{
        var temp = IntArray(sadArray.size)
        temp[0] = sadArray[0]
        var offset = 0
        for(i in 1..sadArray.size-2)
        {
            if(sadArray[i] <= (sadArray[i-1]+sadArray[i+1]))
                temp[i-offset] = sadArray[i]
            else
                offset++
        }
        temp[sadArray.size-offset-1] = sadArray[sadArray.size-1]
        return (temp.filter{it>0}).toIntArray()
    }
    fun convertToHappy(sadArray: IntArray): IntArray {
    var tmp = sadArray
        while(!isHappy(tmp))
            tmp = makeHappy(tmp)
        return tmp
    }
}
