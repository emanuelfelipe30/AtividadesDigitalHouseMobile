package exercicio3

fun main(){
    val estoque = Estoque("teclado teste", 15, 10)

    estoque.mudarNome("teclado")
    estoque.mudarQtdMinima(5)
    estoque.darBaixa(3)
    if(estoque.precisaRepor()) estoque.repor(4)
    estoque.darBaixa(12)
    if(estoque.precisaRepor()) estoque.repor(6)
    estoque.darBaixa(10)
    println(estoque.mostrar())
}