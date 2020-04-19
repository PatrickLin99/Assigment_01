

open class Human (var name: String) {
    open var hasMana : Boolean = false
    open fun attack() {
        println("$name use fist attack")
    }
}

class Mage(name: String) : Human(name) {
    override var hasMana: Boolean = true
    override fun attack() {
        println("$name use Fireball!")
        val abc = hasMana
    }
}

fun main(args: Array<String>){
    val patrick = Human("Patrick")
        patrick.attack()

    val lucy = Mage("Lucy")
        lucy.attack()

    if (lucy.hasMana){
        println("${lucy.name} has Mana")
    } else {
        println("${lucy.name} is a Human!")
    }

    if (patrick.hasMana){
        println("${patrick.name} has Mana")
    } else {
        println("${patrick.name} is a human!")
    }
 }