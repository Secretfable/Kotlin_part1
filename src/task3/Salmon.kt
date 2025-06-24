package task3

class Salmon : Fish() {
    override val swimSpeed: Double = 12.0

    override fun swim() {
        println("I am a Salmon, and I am swimming")
    }
}