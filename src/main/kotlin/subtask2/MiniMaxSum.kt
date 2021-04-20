package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var resultArr = IntArray(input.size)
        for(i in input.indices)
            resultArr[i] = input.filter { it != input[i] }.sum()
        return intArrayOf(resultArr.min()!!,resultArr.max()!!)
    }
}
