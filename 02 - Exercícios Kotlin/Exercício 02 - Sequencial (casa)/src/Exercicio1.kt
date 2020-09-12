fun main() {
    print("Digite a nota 1: ")
    val nota1 = readLine()!!.toDouble()

    print("Digite a nota 2: ")
    val nota2 = readLine()!!.toDouble()

    print("Digite a nota 3: ")
    val nota3 = readLine()!!.toDouble()

    print("Digite a nota 4: ")
    val nota4 = readLine()!!.toDouble()

    val media = (nota1 + nota2 + nota3 + nota4) / 4
    println("A média é %.2f".format(media))
}