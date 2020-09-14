package exercicio1

fun main(){
    val cliente1 = Cliente("Emanuel", "Tavares")
    val contaCliente1 = Conta(cliente1)
    contaCliente1.depositar(2000.0)
    contaCliente1.sacar(600.0)

    val cliente2 = Cliente("Eduarda", "Tavares")
    val contaCliente2 = Conta(cliente2)
    contaCliente2.depositar(1500.0)
    contaCliente2.sacar(800.0)
}