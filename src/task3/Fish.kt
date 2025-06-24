package task3

abstract class Fish : Pet(), Swimmable {
    override val totalSpeed: Double
        get() = swimSpeed
}