package exercicio4

fun main(){
    val guardaVolumes = GuardaVolumes()

    val volume1 = guardaVolumes.guardarPecas(mutableListOf(
        Pertence("adidas","camisa preta"),
        Pertence("diesel","Calça"),
        Pertence("nike","tênis air max")
    ))

    guardaVolumes.mostrarPecas(volume1)

    val volume2 = guardaVolumes.guardarPecas(mutableListOf(
        Pertence("kenner","sandália"),
        Pertence("seaway","bermuda")
    ))

    guardaVolumes.mostrarPecas(volume2)

    guardaVolumes.mostrarPecas()

    guardaVolumes.devolverPecas(volume1)
    guardaVolumes.devolverPecas(volume2)

    guardaVolumes.mostrarPecas()
}