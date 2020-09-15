package exercicio3

class Prova constructor(private val dificuldade: Int, private val energiaNecessaria: Int){
    fun realizarProva(atleta: Atleta){
        println("Prova do atleta ${atleta.nome} iniciada")
        if(atleta.nivel < dificuldade){
            println("O alteta não poderá realizar a prova pois não possui nível suficiente\n")
        } else if(atleta.energia < energiaNecessaria){
            println("O alteta não poderá realizar a prova pois não possui energia suficiente\n")
        } else {
            println("energia inicial do atleta: ${atleta.energia}")
            atleta.energia -= energiaNecessaria
            println("energia final do atleta: ${atleta.energia}")
            println("Prova finalizada\n")
        }
    }
}