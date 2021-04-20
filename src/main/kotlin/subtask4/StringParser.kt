package subtask4

import java.util.ArrayList

class StringParser {
    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val characterOpnArr = charArrayOf('<','(','[')
        val characterEndArr = charArrayOf('>',')',']')
        var result = ArrayList<String>()
        var flag = false
        var flagIndices : Int=0
        var pos : Int = 0
        var brPos: Int = 0
        var clone=0
        while(pos <= inputString.length-1){
            var word = inputString[pos++]
            if(word in characterOpnArr && !flag ) {
                flag=true
                brPos = pos++
                flagIndices = characterOpnArr.indexOf(word)
            }
            else if(word == characterOpnArr[flagIndices] && flag){
                clone ++
            }
            else if(word ==characterEndArr[flagIndices] && clone>0) {
                clone--
                pos++
            }
            else if(word in characterEndArr && flag && word==characterEndArr[flagIndices]){
                result.add(inputString.substring(brPos,pos-1))
                pos = brPos++
                flag = false
            }
        }
        return result.toTypedArray()
    }
}
