package task3

abstract class Cat : Pet(), Runnable, Swimmable {
    override fun run() {
        println("I am a Cat, and I am running")
    }

    override fun swim() {
        println("I am a Cat, and I am swimming")
    }
}