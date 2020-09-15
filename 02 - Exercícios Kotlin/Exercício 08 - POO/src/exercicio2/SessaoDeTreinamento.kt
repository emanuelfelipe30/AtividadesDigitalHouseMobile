package exercicio2

class SessaoDeTreinamento constructor(private val experiencia: Int) {

    fun treinarA(jogadorDeFutebol: JogadorDeFutebol){
        println("Treinamento do jogador ${jogadorDeFutebol.nome} iniciado")
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()

        println("Treino concluído")
        println("Experiência inicial: ${jogadorDeFutebol.experiencia}")
        jogadorDeFutebol.experiencia += experiencia
        println("Nova experiência: ${jogadorDeFutebol.experiencia}\n")
    }
}