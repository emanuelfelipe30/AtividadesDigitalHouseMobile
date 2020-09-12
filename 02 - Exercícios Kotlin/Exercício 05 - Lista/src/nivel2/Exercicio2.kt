package nivel2

fun main(){
    val notasDisponiveis = intArrayOf(100, 50, 10, 5, 1)

    print("Informe o valor do saque: ")
    var valorSaque = readLine()!!.toInt()

    if(valorSaque in 10..600) {
        for(nota in notasDisponiveis) {
            val qtdNotas = valorSaque / nota
            valorSaque %= nota

            if(qtdNotas > 0)
                if(qtdNotas == 1) println("$qtdNotas nota de $nota")
                else println("$qtdNotas notas de $nota")

            if(valorSaque == 0) break
        }
    } else {
        println("O valor do saque deve estar entre 10 e 600. Finalizando o programa...\n")
    }
}