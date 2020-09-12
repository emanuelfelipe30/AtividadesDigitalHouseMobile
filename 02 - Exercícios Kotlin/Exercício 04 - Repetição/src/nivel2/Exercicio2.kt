package nivel2

fun main(){
    print("Você possui quantos cd's em sua coleção? ")
    val qtdCds = readLine()!!.toInt()

    if(qtdCds > 0){
        var valorTotalGasto = 0.0
        for(index in 1..qtdCds){
            print("Digite o valor do ${index}º cd: ")
            val valorCd = readLine()!!.toDouble()
            valorTotalGasto += valorCd
        }
        println("\nO valor total gasto em cd's foi R$ $valorTotalGasto")
        println("A média de valor gasto por cd foi R$ ${valorTotalGasto/qtdCds}")
    } else println("A quantidade de cd's deve ser maior que 0. Encerrando o programa...")
}