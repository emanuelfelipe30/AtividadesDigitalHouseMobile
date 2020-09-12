package nivel1

fun main(){
    val numeros = IntArray(3)
    for(index in numeros.indices){
        print("Digite o ${index+1}º número: ")
        numeros[index] = readLine()!!.toInt()
    }
    println("\nA soma dos números é ${somarNumeros(numeros[0], numeros[1], numeros[2])}")
}

fun somarNumeros(numero1: Int, numero2: Int, numero3: Int) = numero1 + numero2 + numero3