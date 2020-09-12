package nivel1

fun main(){
    for(count in 1..5){
        when(count){
            1 -> {
                print("Digite seu nome: ")
                if(readLine()!!.toString().length > 3) {
                    println("Nome válido\n")
                } else {
                    println("Nome inválido, o nome deve ter mais que 3 caracteres.\nSaindo do programa...")
                    break
                }
            }
            2 -> {
                print("Digite sua idade: ")
                if(readLine()!!.toInt() in 0..150) {
                    println("Idade válida\n")
                } else {
                    println("Idade inválida, a idade deve ser entre 0 e 150.\nSaindo do programa...")
                    break
                }
            }
            3 -> {
                print("Digite seu salário: ")
                if(readLine()!!.toDouble() > 0) {
                    println("Salário válido\n")
                } else {
                    println("Salário inválido, o salário deve ser maior que 0.\nSaindo do programa...")
                    break
                }
            }
            4 -> {
                print("Digite seu sexo: ")
                val sexo = readLine()!!.toString().toUpperCase()
                if(sexo == "M" || sexo == "F") {
                    println("Sexo válido\n")
                } else {
                    println("Sexo inválido, o sexo deve ser 'f' para feminino ou 'm' para masculino.\nSaindo do programa...")
                    break
                }
            }
            5 -> {
                print("Digite seu estado civil: ")
                val estadoCivil = readLine()!!.toString().toUpperCase()
                if(estadoCivil == "S" || estadoCivil == "C" || estadoCivil == "V" || estadoCivil == "D") {
                    println("Estado civil válido\n")
                } else {
                    println("Estado civil inválido, o estado civil deve ser 's', 'c', 'v' ou 'd'.\nSaindo do programa...")
                    break
                }
            }
        }
    }
}