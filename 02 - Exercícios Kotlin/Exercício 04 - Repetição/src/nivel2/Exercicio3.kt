package nivel2

fun main(){
    print("Digite o número que você quer calcular a tabuada: ")
    val numero = readLine()!!.toInt()
    println("\nTabuada de ${numero}:")
    for(count in 1..10) println("$numero x $count = ${numero * count}")
}