package exercicio5

class Concessionaria constructor(val nome: String){

    var vendas = ArrayList<Venda>()

    init{
        println("Concessionária $nome iniciada\n")
    }

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valorVenda: Double){
        vendas.add(Venda(cliente, veiculo, valorVenda))
        println("Concessionária $nome realizou uma venda\n")
    }
}