package com.ugo.kotlin.main

fun main() {
    println("Pow!")
    var name = "Ade"
//    println(name)
//    var x = 1
//    while (x < 15) {
//      x += 1
//      println("x is now $x.")
//    }

//    for (i in 1..10) {
//        x += 1
//        println("x is now $x.")
//    }

//    var x = 12
//    var y =38
//    print(if (x > y) "x is greater than y" else "x is not greater than y")
    //Assign a variable to another of different type
//    var x = 209
//    var y : Long = x.toLong()
//    print(y)

    //Create an array
    var myArray = arrayOf(1,2,3)
//    print(myArray[1])

    /*
    Arrays
     */
//    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
//    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
//    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")
//
//    val arraySize1 = wordArray1.size
//    val arraySize2 = wordArray2.size
//    val arraySize3 = wordArray3.size
//
//    val rand1 = (Math.random() * arraySize1).toInt()
//    val rand2 = (Math.random() * arraySize2).toInt()
//    val rand3 = (Math.random() * arraySize3).toInt()
//
//    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
//    println(phrase)

    //Implementing String template
//    val result = "my array is ${if (wordArray1.size > 5) "large" else "small"}"
//    println(result)

    //Update value of an item in an array
//    myArray[1] = 27
//    print(myArray[1])

    //Updating a variable to refer to another array
    var thisArray = arrayOf(10,20,30)
    thisArray = arrayOf(3,9,17)
    println(thisArray[2])
}