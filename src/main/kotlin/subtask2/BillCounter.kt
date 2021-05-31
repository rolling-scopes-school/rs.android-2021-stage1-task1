package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = (bill.sum() - bill[k]) / 2
        return if (sum - b  == 0) {
            "Bon Appetit"
        } else {
            (b - sum).toString()
        }
    }
}
