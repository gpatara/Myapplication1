// Interface
    internal interface Animal {
        fun animalSound()  // interface method (does not have a body)
        fun sleep()  // interface method (does not have a body)
    }

    // Pig "implements" the Animal interface
    internal class Pig : Animal {
        override fun animalSound() {
            // The body of animalSound() is provided here
            println("The pig says: wee wee")
        }

        override fun sleep() {
            // The body of sleep() is provided here
            println("Zzz")
        }
    }

    internal object MyMainClass {
        @JvmStatic
        fun main(args: Array<String>) {
            val myPig = Pig()  // Create a Pig object
            myPig.animalSound()
            myPig.sleep()
        }
}