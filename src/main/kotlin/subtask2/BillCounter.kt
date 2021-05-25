package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var result = "StringResult"
        var billAnna = (bill.filter { i -> i != bill[k] }.sum()) / 2

        if (billAnna == b) result = "Bon Appetit"
            else result = (b - billAnna).toString()
        return result
    }
}
