package exercicio1

import kotlin.random.Random

class Conta constructor(var titular: Cliente){
    var numeroConta: String = ""
    var saldo: Double = 0.0

    init{
        numeroConta = Random.nextInt(1000, 9999).toString()
    }

    fun depositar(valorDeposito: Double){
        saldo += valorDeposito
        println("Foi feita uma operação de depósito na conta do titular ${titular.nome} ${titular.sobrenome}, no valor de R$ $valorDeposito")
        println("O novo saldo da conta é R$ ${saldo}\n")
    }

    fun sacar(valorSaque: Double){
        if(saldo >= valorSaque){
            saldo -= valorSaque
            println("Foi feita uma operação de saque na conta do titular ${titular.nome} ${titular.sobrenome}, no valor de R\$ $valorSaque")
            println("O novo saldo da conta é R$ ${saldo}\n")
        } else println("Saldo insuficiente")
    }
}