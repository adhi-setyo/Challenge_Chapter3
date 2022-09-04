package model

class Scissors(
    private val input1: String?,
    private val input2: String?
): Choice() {

    init{
        choiceName = "gunting"
    }

    private fun initGameScissors(){
        when{
            input1.orEmpty().lowercase() == "gunting" && input2.orEmpty().lowercase() == "gunting" -> {
                println("Draw")
            }

            input1.orEmpty().lowercase() == "gunting" && input2.orEmpty().lowercase() == "kertas" -> {
                println("Pemain 1 Menang")
            }

            input1.orEmpty().lowercase() == "gunting" && input2.orEmpty().lowercase() == "batu" -> {
                println("Pemain 2 Menang")
            }
        }
    }

    override fun result(): String {
        return initGameScissors().toString()
    }
}