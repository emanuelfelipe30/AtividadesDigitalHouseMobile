package exercicio2

fun main(){
    var animais: ArrayList<String>? = null
    animais?.add("Pato")
    animais?.add("Cachorro")
    animais?.add("Gato")

    try{
        println(animais?.get(2))
    } catch(e: Exception){
        println(e.message)
        println(e.printStackTrace())
    }

    animais = null

    try{
        println(animais?.get(5))
    } catch(e: Exception){
        println(e.message)
        println(e.printStackTrace())
    }
}