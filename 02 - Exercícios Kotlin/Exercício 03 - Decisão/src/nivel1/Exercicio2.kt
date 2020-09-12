package nivel1

fun main(){
    print("Digite um número: ")
    if(readLine()!!.toInt()%2 == 0) println("par")
    else println("ímpar")
}