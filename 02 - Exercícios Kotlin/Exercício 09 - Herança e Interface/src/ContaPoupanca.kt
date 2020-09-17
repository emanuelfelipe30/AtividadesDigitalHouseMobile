class ContaPoupanca(numeroConta: Int, saldo: Double, val limite: Double): ContaBancaria(numeroConta, saldo) {

    override fun depositar(valor: Double): Boolean {
        saldo += valor
        return true
    }

    override fun sacar(valor: Double): Boolean {
        if((saldo+limite) >= valor){
            saldo -= valor
            return true
        } else println("Não foi possível realizar o saque\n")
        return false
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite de crédito: R$ ${limite}\n")
    }

}