package model

abstract class Choice {

    var choiceName: String? = null

    abstract fun result(): String
}