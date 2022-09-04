import model.Choice
import model.Paper
import model.Rock
import model.Scissors
import utils.IOutils

class App {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }

    private fun run() {
        printHeader()
        input()
    }

    private fun printHeader(){
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
        println("Pilihlah (Batu, Gunting, atau Kertas)")
    }

    private fun input(){
        do{
            println("Masukan Pemain 1: ")
            val input1 = IOutils.readString().lowercase()
            when{
                input1.lowercase() == "gunting" || input1.lowercase() == "batu" || input1.lowercase() == "kertas"->{
                    do{
                        println("Masukan Pemain 2: ")
                        val input2 = IOutils.readString().lowercase()
                        when{
                            input2.lowercase() == "gunting" || input2.lowercase() == "batu" || input2.lowercase() == "kertas"-> {
                                printChoice(Scissors(input1, input2))
                                printChoice(Rock(input1, input2))
                                printChoice(Paper(input1, input2))
                            }
                            input2.lowercase() != "gunting" || input2.lowercase() != "batu" || input2.lowercase() != "kertas"->{
                                println("=====================================")
                                println("Pilihlah (Batu, Gunting, atau Kertas)")
                                println("=====================================")
                                println("Pemain 1 memilih:")
                                println("$input1")
                            }
                        }
                    }while(input2.lowercase() != "gunting" && input2.lowercase() != "batu" && input2.lowercase() != "kertas")
                }
                input1.lowercase() != "gunting" || input1.lowercase() != "batu" || input1.lowercase() != "kertas"-> {
                    println("=====================================")
                    println("Pilihlah (Batu, Gunting, atau Kertas)")
                    println("=====================================")
                }
            }
        }while(input1.lowercase() != "gunting" && input1.lowercase() != "batu" && input1.lowercase() != "kertas")
    }

    private fun printChoice(choice: Choice){
        choice.result()
    }
}