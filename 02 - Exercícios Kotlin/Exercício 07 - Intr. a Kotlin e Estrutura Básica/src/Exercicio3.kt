fun main(){
    print("Digite um número: ")
    val numero = readLine()!!.toInt()
    println("O número é par? ${numero%2 == 0}")
}