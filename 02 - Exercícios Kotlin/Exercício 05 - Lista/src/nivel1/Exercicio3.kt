package nivel1

fun main(){
    val alturaPessoas = DoubleArray(5)

    for(index in alturaPessoas.indices){
        print("Digite a altura da ${index+1}ª pessoa: ")
        alturaPessoas[index] = readLine()!!.toDouble()
    }

    alturaPessoas.reverse()
    for(altura in alturaPessoas) println(altura)
}