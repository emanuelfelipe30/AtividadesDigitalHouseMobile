package exercicio2

fun main(){
    val jogador1 = JogadorDeFutebol("Hernane Brocador")
    val treinoJogador1 = SessaoDeTreinamento(5)
    treinoJogador1.treinarA(jogador1)

    val jogador2 = JogadorDeFutebol("Sander")
    val treinoJogador2 = SessaoDeTreinamento(7)
    treinoJogador2.treinarA(jogador2)
}