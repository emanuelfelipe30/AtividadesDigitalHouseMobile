package exercicio1

fun main(){
    val numerosLoteria = mapOf(
        0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo"
    )

    numerosLoteria.forEach { (t, u) -> println("chave: ${t}\nvalor: ${u}\n")  }

    val apelidos = mapOf(
        "João" to listOf(
            "Juan",
            "Fissura",
            "Maromba"
        ),
        "Miguel" to listOf(
            "Night Watch",
            "Bruce Wayne",
            "Tampinha"
        ),
        "Maria" to listOf(
            "Wonder",
            "Woman",
            "Mary",
            "Marilene"
        ),
        "Lucas" to listOf(
            "Lukinha",
            "Jorge",
            "George"
        ),
    )

    apelidos.forEach { (t, u) -> println("chave: ${t}\nvalor: ${u}\n")  }
}