package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        val actualBill = (bill.sum() - bill[k]) / 2
        if (actualBill == b) return "Bon Appetit"
        else return (b - actualBill).toString()


    }
}
