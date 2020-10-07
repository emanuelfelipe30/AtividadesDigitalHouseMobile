package exercicio1

class Professor(val nome: String, val rd: Int): Pessoa() {
    override val podeDarAula get() = true
    override val podeFazerChamada get() = true
}