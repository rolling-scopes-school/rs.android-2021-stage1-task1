package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        val sum=input.sum()
        val mini=input.min()
        val maxi=input.max()
        return intArrayOf(sum-maxi!!,sum-mini!!)
    }
}
