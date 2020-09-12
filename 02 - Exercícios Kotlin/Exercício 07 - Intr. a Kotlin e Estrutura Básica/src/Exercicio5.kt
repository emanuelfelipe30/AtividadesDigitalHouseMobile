fun main(){
    val numeros = IntArray(4)

    for(index in numeros.indices){
        print("Digite o ${index+1}º número: ")
        numeros[index] = readLine()!!.toInt()
    }

    println("\nCondição válida? ${(numeros[0] > numeros[2] && numeros[0] > numeros[3]) || (numeros[1] > numeros[2] && numeros[1] > numeros[3])}")
}