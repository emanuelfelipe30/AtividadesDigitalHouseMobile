package exercicio2

class Fatura() {

    val listaDeItens = ArrayList<Item>()

    fun getTotalFatura(): Double{
        var totalFatura = 0.0
        listaDeItens.forEach { totalFatura += (it.quantidade * it.preco) }
        return totalFatura
    }

}