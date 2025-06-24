import task1.printCharacterCount
import task2.handleAny
import task3.*

fun main() {
    // Задача 1
    printCharacterCount("Молоко", 'о')
    printCharacterCount("Молоко", 'а')

    // Задача 2
    handleAny("Молоко")
    handleAny(5)
    handleAny(2.356)
    handleAny(java.time.LocalDate.of(2005, 1, 1))
    handleAny(null)
    handleAny(listOf(1, 2, 3))

    // Задача 3
    val tiger = Tiger()
    tiger.run()
    tiger.swim()
    println("Tiger total speed: ${tiger.totalSpeed}")

    val salmon = Salmon()
    salmon.swim()
    println("Salmon total speed: ${salmon.totalSpeed}")
}