fun main() {
    print("Digite o peso dos peixes: ")
    val pesoPeixes = readLine()!!.toDouble()

    val excessoPeso = pesoPeixes - 50
    val multa = excessoPeso * 4

    println("Excedeu $excessoPeso Kg")
    println("O valor a ser pago é de R$ $multa")
}