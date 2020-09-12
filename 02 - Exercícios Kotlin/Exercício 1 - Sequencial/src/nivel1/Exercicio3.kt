package nivel1

fun main(){
    print("Digite um valor em metros: ")
    val valorMetros = readLine()!!.toInt()

    val valorCentimetros = valorMetros * 100
    println("$valorMetros metros é igual a $valorCentimetros centímetros")
}