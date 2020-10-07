package exercicio4

class Funcionario(
    private val nome: String,
    private val numeroDeRegistro: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Funcionario

        /*if (nome != other.nome) return false*/
        if (numeroDeRegistro != other.numeroDeRegistro) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + numeroDeRegistro
        return result
    }
}