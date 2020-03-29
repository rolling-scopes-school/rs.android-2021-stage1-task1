package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray = sadArray.toMutableList()
        var i=1
        if(sadArray.size<3)
            return sadArray
        else{
            while(i<happyArray.size-1){
                if (happyArray[i+1]+happyArray[i-1] < happyArray[i]) {
                    happyArray.removeAt(i)
                    if (i!=1) i-- }
                else
                    i++ }}
        return happyArray.toIntArray()
    }
}
