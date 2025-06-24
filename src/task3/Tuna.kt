package task3

class Tuna : Fish() {
    override val swimSpeed: Double = 15.0

    override fun swim() {
        println("I am a Tuna, and I am swimming")
    }
}