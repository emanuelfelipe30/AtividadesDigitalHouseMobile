package exercicio4

fun main(){
    val celta = Carro(12.0)
    celta.adicionarGasolina(20.0)
    celta.andar(120.0)
    println("Gasolina restante no tanque: ${celta.quantidadeCombustivelDisponivel}L")
}