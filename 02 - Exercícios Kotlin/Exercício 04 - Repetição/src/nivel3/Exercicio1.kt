package nivel3

import kotlin.math.max

fun main(){
    var codigoClienteMaisAlto = 0
    var valorClienteMaisAlto = Double.MIN_VALUE

    var codigoClienteMaisBaixo = 0
    var valorClienteMaisBaixo = Double.MAX_VALUE

    var codigoClienteMaisGordo = 0
    var valorClienteMaisGordo = Double.MIN_VALUE

    var codigoClienteMaisMagro = 0
    var valorClienteMaisMagro = Double.MAX_VALUE

    var mediaAltura = 0.0
    var mediaPeso = 0.0
    var totalClientes = 0

    do{
        print("\nDigite seu código de cliente: ")
        val codigoCliente = readLine()!!.toInt()

        if(codigoCliente != 0){

            print("Cliente ${codigoCliente}, Digite sua altura em metros: ")
            val alturaClienteAtual = readLine()!!.toDouble()
            if(alturaClienteAtual >= valorClienteMaisAlto){
                codigoClienteMaisAlto = codigoCliente
                valorClienteMaisAlto = alturaClienteAtual
            }
            if(alturaClienteAtual <= valorClienteMaisBaixo){
                codigoClienteMaisBaixo = codigoCliente
                valorClienteMaisBaixo = alturaClienteAtual
            }

            print("Cliente ${codigoCliente}, Digite seu peso em quilos: ")
            val pesoClienteAtual = readLine()!!.toDouble()
            if(pesoClienteAtual >= valorClienteMaisGordo){
                codigoClienteMaisGordo = codigoCliente
                valorClienteMaisGordo = pesoClienteAtual
            }
            if(pesoClienteAtual <= valorClienteMaisMagro){
                codigoClienteMaisMagro = codigoCliente
                valorClienteMaisMagro = pesoClienteAtual
            }

            mediaAltura += alturaClienteAtual
            mediaPeso += pesoClienteAtual
            totalClientes++

        } else break
    } while(true)

    if(totalClientes > 0){
        mediaAltura /= totalClientes
        mediaPeso /= totalClientes

        println("\nO cliente $codigoClienteMaisAlto é o mais alto, medindo $valorClienteMaisAlto metros")
        println("O cliente $codigoClienteMaisBaixo é o mais baixo, medindo $valorClienteMaisBaixo metros")
        println("O cliente $codigoClienteMaisGordo é o mais gordo, medindo $valorClienteMaisGordo quilos")
        println("O cliente $codigoClienteMaisMagro é o mais magro, medindo $valorClienteMaisMagro quilos")
        println("\nA média de altura dos clientes é de $mediaAltura metros")
        println("\nA média de peso dos clientes é de $mediaPeso quilos")
    } else println("Encerrando o programa...")
}