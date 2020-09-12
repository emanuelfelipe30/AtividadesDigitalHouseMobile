package nivel1

fun main(){
    print("Digite a letra referente ao seu sexo: ")

    when (readLine()!!.toUpperCase()) {
        "M" -> println("Masculino")
        "F" -> println("Feminino")
        else -> println("Sexo inválido")
    }
}