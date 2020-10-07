package exercicio1

abstract class Pessoa() {

    open val podeDarAula get() = false
    open val podeFazerChamada get() = false
    open val podeAssistirAula get() = false
    open val podeFazerLicao get() = false

}