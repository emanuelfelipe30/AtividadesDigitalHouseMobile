package exercicio4

class Pertence(private val marca: String, private val modelo: String): Peca(marca, modelo) {

    override fun retirada() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Pertence(marca='$marca', modelo='$modelo')"
    }


}