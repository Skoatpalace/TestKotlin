package com.example.skoatpalace.testkotlin

class User(val name:String, age:Int){
    init {
        println("Initialisation avec l'attribut name=$name et le paramètre age=$age")
    }
    override fun toString() = "Mon nom est $name" // age est inaccessible ici
}

fun main(args:Array<String>){
    println(User("John Doe", 40))
}