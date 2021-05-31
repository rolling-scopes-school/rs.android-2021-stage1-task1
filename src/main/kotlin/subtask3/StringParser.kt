package subtask3

class StringParser {
    
fun getResult(inputString: String): Array<String> {
    
    val arr= mutableListOf<String>()

        for (i in inputString.indices){
            if(inputString[i]=='<' || inputString[i]=='(' || inputString[i]=='['){
                arr.add(inputString.substring(i+1, findNextScopeIndex(inputString,i+1,inputString[i])))
            }
        }
        return arr.toTypedArray()
    }
}
fun findNextScopeIndex(str: String, startIndex: Int, ch : Char) : Int{
    var toFind =' '
    var flag =0
    when (ch){
        '<' -> toFind ='>'
        '[' -> toFind = ']'
        '(' -> toFind = ')'
    }
    for (i in startIndex .. str.length){
        when (str[i]){
            ch      -> flag++
            toFind  -> {
                if(flag!=0) flag-- else
                return i
            }
        }
    }
    return 0
}
