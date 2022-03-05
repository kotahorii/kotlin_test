fun main() {
    val dog = Dog("Takashi")
    dog.cries()
    println(dog.name)
}

open class Animal(val name: String) {
    fun showName() = println("name is $name")
    open fun cries() = println("")
}

class Dog(name: String) : Animal(name) {
    override fun cries() = println("bowwow")
}