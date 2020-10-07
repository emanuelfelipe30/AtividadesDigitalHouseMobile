package exercicio2

import kotlin.math.max

class Item(
    val numero: Int,
    val descricao: String,
    _quantidade: Int,
    _preco: Double
) {

    val quantidade = max(_quantidade, 0)
    val preco = max(_preco, 0.0)

}