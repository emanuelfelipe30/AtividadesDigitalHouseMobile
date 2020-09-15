package exercicio3

fun main(){
    val atleta1 = Atleta("Elton", 3)
    val prova1Atleta1 = Prova(3,70)
    prova1Atleta1.realizarProva(atleta1)
    val prova2Atleta1 = Prova(5,20)
    prova2Atleta1.realizarProva(atleta1)
    val prova3Atleta1 = Prova(3,40)
    prova3Atleta1.realizarProva(atleta1)

    val atleta2 = Atleta("Iago Maidana", 3)
    val prova1Atleta2 = Prova(3,70)
    prova1Atleta2.realizarProva(atleta2)
    val prova2Atleta2 = Prova(2,20)
    prova2Atleta2.realizarProva(atleta2)
    val prova3Atleta2 = Prova(2,40)
    prova3Atleta2.realizarProva(atleta2)
}