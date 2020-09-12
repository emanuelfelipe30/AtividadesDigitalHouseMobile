package nivel1

import kotlin.math.min
import kotlin.math.max

fun main(){
    print("Digite o primeiro número: ")
    val numero1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val numero2 = readLine()!!.toInt()

    for(numero in min(numero1, numero2)+1 until max(numero1, numero2)) println(numero)
}