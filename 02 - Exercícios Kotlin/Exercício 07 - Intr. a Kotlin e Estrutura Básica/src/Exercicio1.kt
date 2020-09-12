fun main(){
    val numeros = IntArray(3)

    for(index in numeros.indices){
        print("Digite o ${index+1}º número: ")
        numeros[index] = readLine()!!.toInt()
    }

    println("O maior número é o ${numeros.maxOrNull()!!}")
}