package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sumWithoutAnn = bill.filter{it!=bill[k]}.sum()/2
        if(sumWithoutAnn == b)
            return "Bon Appetit"
        else
            return (b-sumWithoutAnn).toString()
    }
}
