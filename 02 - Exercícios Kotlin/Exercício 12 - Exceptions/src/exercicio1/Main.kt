package exercicio1

fun main(){
    val animais = arrayOf("Pato", "Cachorro", "Gato")

    try{
        println(animais[3])
    } catch(e: Exception){
        println(e.message)
        println(e.printStackTrace())
    }
}