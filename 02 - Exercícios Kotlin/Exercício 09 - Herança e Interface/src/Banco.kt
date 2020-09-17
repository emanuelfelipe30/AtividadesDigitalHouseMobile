class Banco: IImprimivel {
    var contasBancarias = ArrayList<ContaBancaria>()

    fun inserirContaBancaria(contaBancaria: ContaBancaria){
        contasBancarias.add(contaBancaria)
    }

    fun removerContaBancaria(contaBancaria: ContaBancaria){
        contasBancarias.remove(contaBancaria)
    }

    fun procurarContaBancaria(numeroConta: Int): ContaBancaria{
        val pesquisaConta = contasBancarias.filter { it.numeroConta == numeroConta }
        if(pesquisaConta.isEmpty()) return null!!
        return pesquisaConta[0]
    }

    override fun mostrarDados() {
        contasBancarias.forEach {
            println(it.mostrarDados())
        }
    }
}