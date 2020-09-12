package nivel1

fun main(){
    print("Digite um número: ")
    val numero = readLine()!!.toInt()
    println("\nO número digitado é ${if(validarNumeroPositivo(numero) == 'P') "positivo" else "negativo"}")
}

fun validarNumeroPositivo(numero: Int) = if(numero >= 0) 'P' else 'N'