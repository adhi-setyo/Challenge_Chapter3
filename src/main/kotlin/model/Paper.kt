package model

class Paper(
    private val input1:String?,
    private val input2:String?,
): Choice() {

    init {
        choiceName = "kertas"
    }

    private fun initGamePaper() {
        when {
            input1.orEmpty().lowercase() == "kertas" && input2.orEmpty().lowercase() == "kertas" -> {
                println("Draw")
            }

            input1.orEmpty().lowercase() == "kertas" && input2.orEmpty().lowercase() == "batu" -> {
                println("Pemain 1 Menang")
            }

            input1.orEmpty().lowercase() == "kertas" && input2.orEmpty().lowercase() == "gunting" -> {
                println("Pemain 2 Menang")
            }
        }
    }

    override fun result(): String {
        return initGamePaper().toString()
    }
}