package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray: MutableList<Int> =
            sadArray.toMutableList() // преобразуем в MutableList для возможности удаления плохих элементов
        var i = 1
        while (i < happyArray.size - 1) {
            if (happyArray[i] >= happyArray[i - 1] + happyArray[i + 1]) {
                happyArray.removeAt(i)  //удаляем элемент не соответствующий условию
                if (i != 1) {
                    i--     //уменьшаем счетчик, т.к. удалили один элемент при условии что он не второй (индекс 1)
                }
            } else {
                i++  // переходим к следующему элементу
            }
        }
        return happyArray.toIntArray()
    }
}
