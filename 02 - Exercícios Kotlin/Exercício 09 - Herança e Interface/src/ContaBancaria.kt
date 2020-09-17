abstract class ContaBancaria(val numeroConta: Int, protected var saldo: Double): IImprimivel{

    abstract fun depositar(valor: Double): Boolean
    abstract fun sacar(valor: Double): Boolean

    override fun mostrarDados() {
        println("Dados da conta")
        println("-----------------------------")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: R$ $saldo")
    }

    fun transferir(valor: Double, contaDestino: ContaBancaria){
        val saldoContaOrigem = saldo
        if(!sacar(valor) || !contaDestino.depositar(valor)){
            saldo = saldoContaOrigem
            println("Não foi possível realizar a transferêcia\n")
        }
    }

    fun obterSaldo(): Double{
        return saldo
    }

}