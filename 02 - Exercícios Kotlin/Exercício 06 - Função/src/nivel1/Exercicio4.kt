package nivel1

import kotlin.random.Random

const val NATURAL = "natural"
const val CRAPS = "craps"
const val PONTO = "ponto"
const val GANHOU = "ganhou"
const val PERDEU = "perdeu"
const val JOGAR_NOVAMENTE = "jogar novamente"

fun main(){
    var ehPrimeiraRodada = true
    var valorJogadaInicial = 0

    do{
        print("Lançar dados [s/n]? ")
        if(readLine()!!.toString().toUpperCase() == "S"){
            val valorDados = lancarDados()
            println("\nVocê tirou $valorDados pontos")

            when(retornarTipoJogadorPrimeiraRodada(valorDados, ehPrimeiraRodada, valorJogadaInicial)){
                NATURAL -> {
                    println("Você é natural. Você ganhou o jogo!")
                    break
                }
                CRAPS -> {
                    println("Você é craps. Você perdeu o jogo!")
                    break
                }
                PONTO -> println("Você é ponto. Jogue novamente!\n")
                GANHOU -> {
                    println("Você retirou o mesmo valor da rodada inicial. Você ganhou o jogo!")
                    break
                }
                PERDEU -> {
                    println("Você retirou o valor 7. Você perdeu o jogo!")
                    break
                }
                else -> println("Jogue novamente!\n")
            }

            if(ehPrimeiraRodada){
                valorJogadaInicial = valorDados
                ehPrimeiraRodada = false
            }

        } else {
            println("Saindo do jogo...")
            break
        }
    } while(true)
}

fun lancarDados() = Random.nextInt(2,12)

fun retornarTipoJogadorPrimeiraRodada(valorDados: Int, ehPrimeiraRodada: Boolean, valorJogadaInicial: Int): String{
    if(ehPrimeiraRodada){
        return when(valorDados){
            7,11 -> NATURAL
            2,3,12 -> CRAPS
            else -> PONTO
        }
    } else {
        return when(valorDados){
            valorJogadaInicial -> GANHOU
            7 -> PERDEU
            else -> JOGAR_NOVAMENTE
        }
    }
}