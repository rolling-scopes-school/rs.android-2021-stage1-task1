package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val result = mutableListOf<String>()
        for (i in inputString.withIndex()) {        // перебираем символы строки
            if (i.value == '[' || i.value == '<' || i.value == '(') {   // находим индекс нужного нам символа
                val endSymbol =
                    when (i.value) {        // находим необходимый тип закрывающихся скобок
                        '<' -> '>'
                        '[' -> ']'
                        '(' -> ')'
                        else -> ' '
                    }
                var count = 0 //счетчик наличия вложенных однотипных скобок
                for (j in i.index + 1 until inputString.length) {   //ищем индекс необходимых закрывающихся скобок в диапазоне от i+1 до конца строки
                    if (inputString[j] == i.value) {   // проверяем наличие таких же открывающихся скобок
                        count++                         // если нашли, увеличивем значение счетчка
                    }
                    if (inputString[j] == endSymbol) {
                        if (count == 0) {           //если вторых открыающих скобок небыло выделяем подстроку
                            result.add(inputString.substring(i.index + 1 until j))
                            break
                        } else count--  //если вторые открывающие скобки были, уменьшаем счетчик и ищем следующие скобки закрытия
                    }
                }
            }
        }
        return result.toTypedArray()
    }
}