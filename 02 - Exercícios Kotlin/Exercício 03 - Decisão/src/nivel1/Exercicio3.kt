package nivel1

fun main(){
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    val media = (nota1 + nota2) / 2
    when {
        media == 10.00 -> println("Aprovado com dinstinção")
        media >= 7.00 -> println("Aprovado")
        else -> println("Reprovado")
    }
}