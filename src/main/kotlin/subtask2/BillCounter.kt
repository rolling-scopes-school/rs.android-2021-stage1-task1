package subtask2

class BillCounter {
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val billForOne = (bill.sum() - bill[k]) / 2 // рассчитываем сколько должен заплатить каждый
        return if (billForOne == b) {   // проверяем равна ли сумма счета с каждого тому что заплатила Анна
            "Bon Appetit"
        } else {
            (b - billForOne).toString() //показываем сколько Брайан должен Анне
        }
    }
}
