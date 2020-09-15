package exercicio4

class Carro constructor(val consumo: Double){
    var quantidadeCombustivelDisponivel: Double = 0.0

    fun andar(distancia: Double){
        quantidadeCombustivelDisponivel -= (distancia/consumo)
        println("Andou $distancia KM\n")
    }

    fun obterGasolina() = quantidadeCombustivelDisponivel

    fun adicionarGasolina(quantidadeGasolina: Double){
        quantidadeCombustivelDisponivel += quantidadeGasolina
        println("Adicionado ${quantidadeGasolina}L de gasolina\n")
    }
}