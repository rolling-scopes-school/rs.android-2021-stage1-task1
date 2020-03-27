package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var result = "Bon Appetit"

        val sum = bill.foldIndexed(0) {index, acc, v -> if (index == k) acc else acc + v }
        var bActual = b - sum / 2

        if (bActual != 0) {
            result = bActual.toString()
        }

        return result
    }
}
