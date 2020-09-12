package nivel2

fun main() {
    val votos = IntArray(6)
    val sistemas = arrayOf("Windows Server", "Unix", "Linux", "Netware", "Mac OS", " Outro")
    var total = 0

    do {
        print("Qual o melhor Sistema Operacional para uso em servidores?")
        println("As possíveis respostas são:")
        for(index in sistemas.indices){
            println("${index+1}- ${sistemas[index]}")
        }
        val voto = readLine()!!.toInt()

        if (voto in 1..6) {
            votos[voto-1] = votos[voto-1] + 1
            total++
        }else if(voto != 0) println("Voto inválido! Tente novamente...\n")
        else break
    } while (true)

    val indiceMaisVotado = votos.indexOf(votos.maxOrNull()!!)

    println("Sistema Operacional\tVotos\t%")
    println("-------------------\t-----\t------")
    for (i in votos.indices) println("${sistemas[i]}\t${votos[i]}\t${(votos[i].toDouble() / total.toDouble()) * 100}")
    println("-------------------\t-----")
    println("indice mais votado $indiceMaisVotado")
    println("O Sistema Operacional mais votado foi o ${sistemas[indiceMaisVotado]}, com  " +
            "${votos[indiceMaisVotado]} votos, correspondendo a ${(votos[indiceMaisVotado].toDouble() / total.toDouble()) * 100}% dos votos")
}