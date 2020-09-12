fun main() {
    print("Quanto vale sua hora? ")
    val valorHora = readLine()!!.toDouble()

    print("Quantas horas você trabalhou? ")
    val horasTrabalhadas = readLine()!!.toDouble()

    val valorTotal = valorHora * horasTrabalhadas
    println("Você receberá R$ $valorTotal")
}