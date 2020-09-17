class ContaCorrente(numeroConta: Int, saldo: Double, val taxaOperacao: Double): ContaBancaria(numeroConta, saldo) {

    override fun depositar(valor: Double): Boolean {
        if((saldo+valor) >= taxaOperacao){
            saldo += (valor - taxaOperacao)
            return true
        } else println("Não foi possível realizar o depósito\n")
        return false
    }

    override fun sacar(valor: Double): Boolean {
        if(saldo >= (valor + taxaOperacao)){
            saldo -= (valor + taxaOperacao)
            return true
        } else println("Não foi possível realizar o saque\n")
        return false
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Taxa de operação: R$ ${taxaOperacao}\n")
    }

}