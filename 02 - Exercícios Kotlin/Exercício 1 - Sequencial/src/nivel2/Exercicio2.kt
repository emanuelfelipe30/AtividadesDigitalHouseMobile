package nivel2

fun main(){
    print("Quanto você ganha por hora? ")
    val valorHora = readLine()!!.toDouble()

    print("Quantas horas você trabalhou no mês? ")
    val horasTrabalhadas = readLine()!!.toDouble()

    val salarioBruto = valorHora * horasTrabalhadas
    val ir = salarioBruto * 11 * 0.01
    val inss = salarioBruto * 8 * 0.01
    val sindicato = salarioBruto * 5 * 0.01
    val salarioLiquido = salarioBruto - ir - inss - sindicato

    println("Salário bruto: R$ $salarioBruto")
    println("Valor pago ao INSS: R$ $inss")
    println("Valor pago ao sindicato: R$ $sindicato")
    println("Salário líquido: R$ $salarioLiquido")
}