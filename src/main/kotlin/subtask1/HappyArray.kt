package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArrayList = sadArray.toCollection(ArrayList())
        val i = 1
        while (i < happyArrayList.size - 1){
            if((happyArrayList[i-1] + happyArrayList[i+1]) < happyArrayList[i]){
                println(i)
                happyArrayList.removeAt(i)
                if(i!=1) i--
            }
            else{
                i++
            }
            return happyArrayList.toIntArray()
        }
    }
}
