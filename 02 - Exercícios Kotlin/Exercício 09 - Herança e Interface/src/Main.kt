const val CRIAR_CONTA = 1
const val CRIAR_CONTA_CORRENTE = 1
const val CRIAR_CONTA_POUPANCA = 2
const val SLECIONAR_CONTA = 2
const val DEPOSITAR = 1
const val SACAR = 2
const val TRANSFERIR = 3
const val REMOVER_CONTA = 3
const val RELATORIO = 4
const val VOLTAR_MENU = 5
const val SAIR = 5
const val MSG_VOLTAR_MENU = "Voltando para o menu...\n\n\n"

fun main(){
    val banco = Banco()
    do{
        when(escolherOpcaoMenu()){

            CRIAR_CONTA -> {
                when(escolherTipoConta()){
                    CRIAR_CONTA_CORRENTE -> banco.inserirContaBancaria(ContaCorrente(entrarNumeroConta(), entrarSaldoConta(), entrarTaxaConta()))
                    CRIAR_CONTA_POUPANCA -> banco.inserirContaBancaria(ContaPoupanca(entrarNumeroConta(), entrarSaldoConta(), entrarLmiteCreditoConta()))
                    else -> println("Opção incorreta! $MSG_VOLTAR_MENU")
                }
            }

            SLECIONAR_CONTA -> {
                val contaBancaria = banco.procurarContaBancaria(entrarNumeroConta())
                if(!contaBancaria.equals(null)){
                    when(escolheropcaoMenuConta()){
                        DEPOSITAR -> contaBancaria.depositar(entrarValorDeposito())
                        SACAR -> contaBancaria.sacar(entrarValorSaque())

                        TRANSFERIR -> {
                            val contaBancariaDestino = banco.procurarContaBancaria(entrarNumeroContaDestino())
                            if(!contaBancaria.equals(null)){
                                contaBancaria.transferir(entrarValorTransaferencia(), contaBancariaDestino)
                            } else println("Conta inexistente! $MSG_VOLTAR_MENU")
                        }

                        RELATORIO -> {
                            val relatorio = Relatorio()
                            relatorio.gerarRelatorio(contaBancaria)
                        }

                        VOLTAR_MENU -> println(MSG_VOLTAR_MENU)
                        else -> println("Opção incorreta! $MSG_VOLTAR_MENU")
                    }
                } else println("Conta inexistente! $MSG_VOLTAR_MENU")
            }

            REMOVER_CONTA -> {
                val contaBancaria = banco.procurarContaBancaria(entrarNumeroConta())
                if(!contaBancaria.equals(null)){
                    banco.removerContaBancaria(contaBancaria)
                } else println("Conta inexistente! $MSG_VOLTAR_MENU")
            }

            RELATORIO -> {
                banco.mostrarDados()
            }

            SAIR -> break
            else -> println("Opção incorreta!")

        }

    }while(true)

    println("Finalizando o programa...")
}

fun escolherOpcaoMenu(): Int{
    println("O que você deseja fazer?")
    println("1- Criar conta")
    println("2- Selecionar conta")
    println("3- Remover conta")
    println("4- Gerar relatório")
    println("5- Finalizar")
    print("Digite a opção desejada [1-5]: ")
    return readLine()!!.toInt()
}

fun escolherTipoConta(): Int{
    println("\nQual tipo de conta você quer?")
    println("1- Conta corrente")
    println("2- Conta poupança")
    print("Digite a opção desejada [1-2]: ")
    return readLine()!!.toInt()
}

fun entrarNumeroConta(): Int{
    print("Digite o número da conta: ")
    return readLine()!!.toInt()
}

fun entrarSaldoConta(): Double{
    print("Digite o saldo inicial da conta: ")
    return readLine()!!.toDouble()
}

fun entrarTaxaConta(): Double{
    print("Digite a taxa da conta: ")
    return readLine()!!.toDouble()
}

fun entrarLmiteCreditoConta(): Double{
    print("Digite o limite de crédito da conta: ")
    return readLine()!!.toDouble()
}

fun escolheropcaoMenuConta(): Int{
    println("O que você deseja fazer?")
    println("1- Depositar")
    println("2- Sacar")
    println("3- Transferir")
    println("4- Gerar relatório")
    println("5- Voltar ao menu anterior")
    print("Digite a opção desejada [1-2]: ")
    return readLine()!!.toInt()
}

fun entrarValorDeposito(): Double{
    println("Digite o valor a ser depositado: ")
    return readLine()!!.toDouble()
}

fun entrarValorSaque(): Double{
    println("Digite o valor a ser sacado: ")
    return readLine()!!.toDouble()
}

fun entrarValorTransaferencia(): Double{
    println("Digite o valor a ser transferido: ")
    return readLine()!!.toDouble()
}

fun entrarNumeroContaDestino(): Int{
    print("Digite o número da conta a ser depositada: ")
    return readLine()!!.toInt()
}