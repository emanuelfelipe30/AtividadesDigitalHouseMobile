package exercicio2

import java.lang.Exception

fun main(){

    val numeros1 = mutableListOf<Int>()

    numeros1.add(1)
    numeros1.add(5)
    numeros1.add(5)
    numeros1.add(6)
    numeros1.add(7)
    numeros1.add(8)
    numeros1.add(8)
    numeros1.add(8)

    println(numeros1)

    val numeros2 = mutableSetOf<Int>()

    numeros2.add(1)
    numeros2.add(5)
    numeros2.add(5)
    numeros2.add(6)
    numeros2.add(7)
    numeros2.add(8)
    numeros2.add(8)
    numeros2.add(8)

    println(numeros2)
}