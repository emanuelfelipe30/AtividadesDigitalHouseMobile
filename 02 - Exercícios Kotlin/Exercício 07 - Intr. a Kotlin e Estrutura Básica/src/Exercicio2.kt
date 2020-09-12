fun main(){
    val textos = arrayOf<String>("","")

    for(index in textos.indices){
        print("Digite o ${index+1}º texto: ")
        textos[index] = readLine()!!
    }

    println("Os textos são iguais? ${textos[0] == textos[1]}")
}