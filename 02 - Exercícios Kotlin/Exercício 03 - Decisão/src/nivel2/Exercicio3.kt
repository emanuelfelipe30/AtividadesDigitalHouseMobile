package nivel2

fun main(){
    print("Telefonou para a vítima? ")
    val telefonouParaVitima = readLine()!!.toString().toUpperCase() == "S"

    print("Esteve no local do crime? ")
    val esteveNoLocalDoCrime = readLine()!!.toString().toUpperCase() == "S"

    print("Mora perto da vítima? ")
    val moraPertoDaVitima = readLine()!!.toString().toUpperCase() == "S"

    print("Devia para a vítima? ")
    val deviaParaVitima = readLine()!!.toString().toUpperCase() == "S"

    print("Já trabalhou com a vítima? ")
    val trabalhouComVitima = readLine()!!.toString().toUpperCase() == "S"

    var countRespostasSim = 0
    if(telefonouParaVitima) countRespostasSim++
    if(esteveNoLocalDoCrime) countRespostasSim++
    if(moraPertoDaVitima) countRespostasSim++
    if(deviaParaVitima) countRespostasSim++
    if(trabalhouComVitima) countRespostasSim++

    when (countRespostasSim) {
        2 -> println("Suspeito")
        in 3..4 -> println("Cúmplice")
        5 -> println("Assasino")
        else -> println("Inocente")
    }
}