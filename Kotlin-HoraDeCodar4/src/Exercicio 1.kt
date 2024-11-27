fun main() {
    var estudantes = 0
    val namepare = "pare"
    while(true){

        println("Digite o nome do estudante para o cadastro: ")
        val name: String = readln()
        estudantes = estudantes + 1

        if(name == namepare){
            println("Foram $estudantes estudantes cadastrados")
            break
        }

    }


    }
