
var mana: Int = 100
open class Human (var name: String) {
    open fun attack() {
//        mana -= 50
        println("$name use fist attack")
    }
}

class Mage(name: String) : Human(name) {
    override fun attack() {
        mana-=60
        println("$name use Fireball!")
    }
}

fun main(args: Array<String>){
    val patrick = Human("Patrick")
        patrick.attack()

    val lucy = Mage("Lucy")
        lucy.attack()

    if (mana > 0) {
        println("Status: Alive")
    }else {
        println("Status: Dead")
    }
    
 }