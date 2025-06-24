package task1

fun printCharacterCount(str: String, char: Char) {
    val count = str.count { it == char }
    if (count > 0) {
        println("Количество символов '$char' в строке \"$str\" == $count")
    } else {
        println("Символ '$char' в строке \"$str\" не найден")
    }
}