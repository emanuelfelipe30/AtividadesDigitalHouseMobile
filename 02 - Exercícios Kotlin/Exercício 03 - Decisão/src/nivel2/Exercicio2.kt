package nivel2

fun main(){
    print("Digite o valor do saque: ")
    var valorSaque = readLine()!!.toInt()

    if(valorSaque in 10..600){

        val notas100 = valorSaque / 100
        valorSaque %= 100
        if(notas100 > 0) println("$notas100 notas de 100")

        if(valorSaque != 0){
            val notas50 = valorSaque / 50
            valorSaque %= 50
            if(notas50 > 0) println("$notas50 notas de 50")
        }

        if(valorSaque != 0){
            val notas10 = valorSaque / 10
            valorSaque %= 10
            if(notas10 > 0) println("$notas10 notas de 10")
        }

        if(valorSaque != 0){
            val notas5 = valorSaque / 5
            valorSaque %= 5
            if(notas5 > 0) println("$notas5 notas de 5")
        }

        if(valorSaque != 0){
            val notas1 = valorSaque / 1
            if(notas1 > 0) println("$notas1 notas de 1")
        }

    } else println("Valor incorreto. O valor do saque deve ser entre 10 e 600 reais")
}