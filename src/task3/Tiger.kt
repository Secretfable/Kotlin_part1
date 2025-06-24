package task3

class Tiger : Cat() {
    override val runSpeed: Double = 48.0
    override val swimSpeed: Double = 10.0

    override fun run() {
        println("I am a Tiger, and I am running")
    }

    override fun swim() {
        println("I am a Tiger, and I am swimming")
    }

    override val totalSpeed: Double
        get() = runSpeed + swimSpeed
}