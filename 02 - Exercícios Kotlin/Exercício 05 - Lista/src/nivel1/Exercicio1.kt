package nivel1

fun main(){
    val numeros = IntArray(5)

    for(index in numeros.indices){
        print("Digite o ${index+1}º número: ")
        numeros[index] = readLine()!!.toInt()
    }

    for(numero in numeros) println(numero)
}