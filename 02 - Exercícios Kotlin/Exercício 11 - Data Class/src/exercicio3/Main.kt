package exercicio3

fun main(){
    val alunos = ArrayList<Aluno>()
    alunos.add(Aluno("Aluno 1", 1))
    alunos.add(Aluno("Aluno 2", 2))
    alunos.add(Aluno("Aluno 3", 3))
    alunos.add(Aluno("Aluno 4", 4))

    val alunoNovo = Aluno("Aluno novo", 2)

    println(alunos.contains(alunoNovo))
}