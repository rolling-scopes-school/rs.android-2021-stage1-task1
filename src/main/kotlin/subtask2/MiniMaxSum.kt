package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        val sum = input.sum()
        val max = input.max() ?: 0
        val min = input.min() ?: 0
        return arrayOf(sum - max, sum - min).toIntArray()
    }
}
