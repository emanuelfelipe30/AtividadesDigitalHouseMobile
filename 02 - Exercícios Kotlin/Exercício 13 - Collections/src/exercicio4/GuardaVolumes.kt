package exercicio4

class GuardaVolumes {

    var count = 0
    val volumes = mutableMapOf<Int, MutableList<Pertence>>()

    fun guardarPecas(listaDePeca: MutableList<Pertence>): Int {
        volumes[++count] = listaDePeca
        return count
    }

    fun mostrarPecas(): Int {

        volumes.forEach { (t, u) -> println("Identificador: ${t}\nPeças: ${u}\n") }
        return 0
    }

    fun mostrarPecas(identificador: Int) {
        println("Peças do identificador ${identificador}: ${volumes[identificador]}")
    }

    fun devolverPecas(identificador: Int) {
        volumes.remove(identificador)
    }

}