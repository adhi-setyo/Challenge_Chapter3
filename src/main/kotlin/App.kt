class App {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }

    private fun run() {
        printHeader()
    }

    private fun printHeader(){
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
        println("Pilihlah (Batu, Gunting, atau Kertas)")
    }
}