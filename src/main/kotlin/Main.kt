fun main(args: Array<String>) {
//    val testArray = arrayOf(1, 2, 2, 9, 93, 2, 6, 9, 6, 10)
//    val result = convertToHappy(testArray.toIntArray())
//    for (i in result) {
//        print("$i ")
//    }
    val inputStr = "Lorem <(ipsum [dolor <sit] amet), consectetur adipiscing elit>. Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. Sed nisi. " +
            "Nulla quis sem at nibh elementum imperdiet>. " +
            "Duis sagittis ipsum. Praesent mauris. " +
            "Fusce nec tellus sed augue semper porta. " +
            "Mauris massa. Vestibulum lacinia arcu eget (nulla. " +
            "Class aptent <taciti [sociosqu ad] litora torquent per conubia> nostra), per inceptos himenaeos."
    var array: Array<String> = getResult(inputStr)
    for (i in array) {
        println(i)
    }


}

fun convertToHappy(sadArray: IntArray): IntArray {
    var happyArray = mutableListOf<Int>()
    for (i in sadArray) {
        happyArray.add(i)
    }
    if (happyArray.size != 0) {
        var isBad = true
        while (isBad) {
            for (i in 1 until happyArray.size) {
                if (i != happyArray.size - 1) {
                    if (happyArray[i] > (happyArray[i - 1] + happyArray[i + 1])) {
                        happyArray.removeAt(i)
                        break
                    }
                } else {
                    isBad = false;
                    break
                }
            }
        }
    }
    return happyArray.toIntArray()
}

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

fun getResult(inputString: String): Array<String> {
//        Круглые скобки
    val leftRoundBracket: Char = 40.toChar()
    val rightRoundBracket: Char = 41.toChar()
//        Квадратные скобки
    val leftSquareBracket: Char = 91.toChar()
    val rightSquareBracket: Char = 93.toChar()
//        Ромбовидные скобки
    val leftDiamondBracket: Char = 60.toChar()
    val rightDiamondBracket: Char = 62.toChar()
    val array = arrayListOf<String>()
    for ((index, i) in inputString.withIndex()) {
        if (leftRoundBracket == i) {
            var counter = 1
            val stringBuilder = StringBuilder()
            for (j in index + 1 until inputString.length) {
                if (inputString[j] == leftRoundBracket) {
                    stringBuilder.append(inputString[j])
                    counter++
                } else if (inputString[j] != rightRoundBracket) {
                    stringBuilder.append(inputString[j])
                } else if (inputString[j] == rightRoundBracket) {
                    if (counter == 1) {
                        array.add(stringBuilder.toString())
                        break
                    } else {
                        stringBuilder.append(inputString[j])
                        counter--
                    }
                }
            }
        } else if (leftSquareBracket == i) {
            var counter = 1
            val stringBuilder = StringBuilder()
            for (j in index + 1 until inputString.length) {
                if (inputString[j] == leftSquareBracket) {
                    stringBuilder.append(inputString[j])
                    counter++
                } else if (inputString[j] != rightSquareBracket) {
                    stringBuilder.append(inputString[j])
                } else if (inputString[j] == rightSquareBracket) {
                    if (counter == 1) {
                        array.add(stringBuilder.toString())
                        break
                    } else {
                        stringBuilder.append(inputString[j])
                        counter--
                    }
                }
            }
        } else if (leftDiamondBracket == i) {
            var counter = 1
            val stringBuilder = StringBuilder()
            for (j in index + 1 until inputString.length) {
                if (inputString[j] == leftDiamondBracket) {
                    stringBuilder.append(inputString[j])
                    counter++
                } else if (inputString[j] != rightDiamondBracket) {
                    stringBuilder.append(inputString[j])
                } else if (inputString[j] == rightDiamondBracket) {
                    if (counter == 1) {
                        array.add(stringBuilder.toString())
                        break
                    } else {
                        stringBuilder.append(inputString[j])
                        counter--
                    }
                }
            }
        }

    }
    return array.toTypedArray()
}

