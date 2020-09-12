package nivel1

fun main(){
    print("Digite o valor de custo: ")
    val valorCusto = readLine()!!.toDouble()

    print("Digite a porcentagem do imposto: ")
    val porcentagemImposto = readLine()!!.toDouble()

    println("\nO valor do produto com o imposto incluído é R$ ${adicionarImposto(porcentagemImposto, valorCusto)}")
}

fun adicionarImposto(taxaImposto: Double, valorCusto: Double) = valorCusto + (valorCusto * taxaImposto * 0.01)