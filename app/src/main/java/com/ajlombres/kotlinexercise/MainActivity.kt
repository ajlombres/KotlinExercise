package com.ajlombres.kotlinexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}fun main(args: Array<String>) {

    println("Enter Name: ")
    val name = readLine()
    println("Enter Age: ")
    val age: Int = Integer.valueOf(readLine())
    var petnames = ""
    if (name == "Jhim" || name == "Ethan") {
        if (age >= 5 && age <= 10)
            petnames = "Hamster, Dog"
        if (age > -11 && age <= 15)
            petnames = "Spider, Dog"
        if (age >= 16 && age <= 20)
            petnames = "Dog, Snake"
        if (age == 21)
            petnames = "No pets, Not Interested"
    }
    if (name == "Sally" || name == "Joy") {
        if (age >= 5 && age <= 10)
            petnames = "Hamster, Cat"
        if (age >= 11 && age <= 15)
            petnames = "Cat, Rabbit"
        if (age >= 16 && age <= 20)
            petnames = "Cat"
        if (age >= 21)
            petnames = "No pets, Not interested"
    }
    println("The pet names are: $petnames")
}