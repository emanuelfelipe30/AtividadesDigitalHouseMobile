package nivel1

import kotlin.math.max

fun main(){
    var count = 0
    var maiorNumero = Int.MIN_VALUE
    do {
        count++
        print("digite ${count}º valor: ")
        val numero = readLine()!!.toInt()
        maiorNumero = max(maiorNumero, numero)
    } while (count < 5)
    println("O maior número é $maiorNumero")
}