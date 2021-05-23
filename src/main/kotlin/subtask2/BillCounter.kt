package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var costOfCommonDishes = 0
        for ((index, i) in bill.withIndex()) {
            if (index != k) {
                costOfCommonDishes += i
            }
        }
        return when (val annBill = costOfCommonDishes / 2) {
            b -> {
                "Bon Appetit"
            }
            else -> {
                (b - annBill).toString()
            }
        }
    }
}
