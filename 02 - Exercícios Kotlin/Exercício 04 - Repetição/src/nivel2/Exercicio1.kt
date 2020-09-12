package nivel2

fun main(){
    print("Você quer calcular a média aritmética de quantas notas? ")
    val qtdNotas = readLine()!!.toInt()
    var totalNotas = 0.00

    if(qtdNotas > 0){
        for(index in 1..qtdNotas){
            print("Digite o valor da ${index}ª nota: ")
            val valorNota = readLine()!!.toDouble()
            totalNotas += valorNota
        }
        println("\nA média das notas é ${totalNotas/qtdNotas}")
    } else println("A quantidade de notas deve ser maior que 0. Encerrando o programa...")
}