package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        throw NotImplementedError("Not implemented")
        fun convertToHappy(sadArray: IntArray): IntArray {

            val happyArray = sadArray.toMutableList()
            recursion(happyArray)
            return happyArray.toIntArray()
        }
    }
    fun recursion(array :MutableList<Int>){
        for (i in array.indices){
            if(i == array.indices.first)
                continue
            if(i==array.indices.last)
                break

            else if(array[i-1]+array[i+1]<array[i]) {
                array.removeAt(i)
                recursion(array)
                break
            }
            else {
                continue
            }
        }
    }
}
