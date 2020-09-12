package nivel2

fun main(){
    print("Digite a temperatura em graus Fahrenheit: ")
    val temperaturaFahrenheit = readLine()!!.toDouble()

    val temperaturaCelsius = 5 * ((temperaturaFahrenheit-32) / 9)
    println("a temperatura em graus celsius é $temperaturaCelsius ºC")
}