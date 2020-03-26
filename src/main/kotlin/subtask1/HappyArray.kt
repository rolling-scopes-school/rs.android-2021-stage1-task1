package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArrayList = sadArray.toCollection(ArrayList())
        var counter = 1
        while(counter < happyArrayList.size-1) {
            if ((happyArrayList[counter-1]+happyArrayList[counter+1]) < happyArrayList[counter]) {
                println(counter)
                happyArrayList.removeAt(counter)
                if(counter != 1) counter--
            } else {
                counter++
            }
        }
        return happyArrayList.toIntArray()
    }
}
