package exercicio1

class Curso(val nome: String, val professorResponsavel: Professor) {

    val listaDeAlunos  get() = ArrayList<Aluno>()
    val listaDeAulas get() = ArrayList<Aula>()

}