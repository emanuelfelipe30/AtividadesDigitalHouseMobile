package exercicio5

fun main(){
    val concessionaria = Concessionaria("AG Veículos")

    val cliente1 = Cliente("Emanuel", "Tavares", "emanuelfelipe30@gmail.com")
    val veiculo1 = Veiculo("Audi", "A3", 2015, "branco", 30000.0)
    concessionaria.registrarVenda(veiculo1, cliente1, 70000.0)

    val cliente2 = Cliente("Eduarda", "Tavares", "eduarda.tavares@gmail.com")
    val veiculo2 = Veiculo("BMW", "135i", 2010, "azul", 72000.0)
    concessionaria.registrarVenda(veiculo2, cliente2, 94386.0)

    println("----------------------------------------------------------------------------")
    println("\nVendas realizadas pela concessionária ${concessionaria.nome}:\n\n")
    concessionaria.vendas.forEach {
        println("Veículo: ${it.veiculo.marca} ${it.veiculo.modelo} ${it.veiculo.cor} ano ${it.veiculo.anoFabricacao} com ${it.veiculo.quilometragem} km rodados")
        println("Cliente: ${it.cliente.nome} ${it.cliente.sobrenome}")
        println("Preço: R$ ${it.valorVenda}\n")
    }
}