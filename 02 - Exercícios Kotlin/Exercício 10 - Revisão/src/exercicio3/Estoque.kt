package exercicio3

class Estoque(private var nome: String, private var qtdAtual: Int, private var qtdMinima: Int) {

    init {
        qtdAtual = maxOf(0, qtdAtual)
        qtdMinima = maxOf(0, qtdMinima)
    }

    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int) {
        this.qtdMinima = maxOf(0, qtdMinima)
    }

    fun repor(qtd: Int) {
        qtdAtual += qtd
    }

    fun darBaixa(qtd: Int) {
        if((qtdAtual-qtd) < 0){
            throw Exception("Quantidade não pode ser negativa")
        }
        qtdAtual = maxOf(0, qtdAtual - qtd)
    }

    fun mostrar(): String = "Nome: ${nome}\nQuantidade atual: ${qtdAtual}\nQuantidade mínima: $qtdMinima"

    fun precisaRepor(): Boolean = qtdAtual <= qtdMinima

}