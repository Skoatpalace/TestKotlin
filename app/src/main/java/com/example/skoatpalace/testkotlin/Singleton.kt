package com.example.skoatpalace.testkotlin

object Singleton{
    var value:Int = 42
}

fun main(vararg args:String) {
    println(Singleton.value)
    Singleton.value = 999
    println(Singleton.value)
}