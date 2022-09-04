package model

class Rock(
    private val input1:String?,
    private val input2:String?,
): Choice() {

    init{
        choiceName = "batu"
    }

    private fun initGameRock(){
        when{
            input1.orEmpty().lowercase() == "batu" && input2.orEmpty().lowercase() == "batu"  -> {
                println("Draw")
            }
            input1.orEmpty().lowercase() == "batu" && input2.orEmpty().lowercase() == "gunting" -> {
                println("Pemain 1 Menang")
            }
            input1.orEmpty().lowercase() == "batu" && input2.orEmpty().lowercase() == "kertas" -> {
                println("Pemain 2 Menang")
            }
        }
    }

    override fun result(): String {
        return initGameRock().toString()
    }
}