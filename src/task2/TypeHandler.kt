package task2

import java.time.LocalDate

fun handleAny(obj: Any?) {
    when (obj) {
        is String -> println("Я получил тип String = '$obj', ее длина равна ${obj.length} символов")
        is Int -> println("Я получил Int = $obj, его квадрат равен ${obj * obj}")
        is Double -> {
            val rounded = String.format("%.2f", obj)
            println("Я получил Double = $obj, это число округляется до $rounded")
        }
        is LocalDate -> {
            val tinkoffDate = LocalDate.of(2006, 12, 24)
            val isBefore = obj.isBefore(tinkoffDate)
            println("Я получил LocalDate = $obj, эта дата ${if (isBefore) "меньше" else "больше или равна"} чем дата основания Tinkoff")
        }
        null -> println("Объект равен null")
        else -> println("Мне этот тип неизвестен")
    }
}