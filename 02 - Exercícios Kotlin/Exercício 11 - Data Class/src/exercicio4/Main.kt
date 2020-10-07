package exercicio4

fun main(){
    val funcionarios = ArrayList<Funcionario>()
    funcionarios.add(Funcionario("Funcionário 1", 1))
    funcionarios.add(Funcionario("Funcionário 2", 2))
    funcionarios.add(Funcionario("Funcionário 3", 3))
    funcionarios.add(Funcionario("Funcionário 4", 4))

    val funcionarioNovo = Funcionario("Funcionário novo", 1)

    println(funcionarios.contains(funcionarioNovo))
}