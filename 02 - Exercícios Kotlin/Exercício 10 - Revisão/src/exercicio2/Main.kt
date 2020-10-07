package exercicio2

fun main(){
    val fatura = Fatura()
    fatura.listaDeItens.add(Item(1, "mouse", 1, 15.0))
    fatura.listaDeItens.add(Item(1, "teclado", 1, 25.0))
    fatura.listaDeItens.add(Item(1, "headphone", 3, 37.50))

    println("Total da fatura: R$ ${fatura.getTotalFatura()}")
}