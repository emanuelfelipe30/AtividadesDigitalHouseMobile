package exercicio3

class Prova {

    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>){
        var valorTotal = 0
        conjuntoDeInteiros.forEach { valorTotal += it }
        println("Valor total: $valorTotal")
    }

}