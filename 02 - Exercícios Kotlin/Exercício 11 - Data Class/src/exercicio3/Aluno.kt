package exercicio3

class Aluno(
    private val nome: String,
    private val numeroDeAluno: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        /*if (nome != other.nome) return false*/
        if (numeroDeAluno != other.numeroDeAluno) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + numeroDeAluno
        return result
    }
}