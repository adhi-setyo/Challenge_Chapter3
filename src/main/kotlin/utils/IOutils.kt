package utils

object IOutils {
    fun readString(defautl: String = ""): String {
        return readLine()?:defautl
    }
}