fun main(){

    println("Digite um valor: ")
    val valor = readln().toInt()

    if(valor > 0){
       var i = 1

        while(i <= valor){

            println(i)
            i = i + 1
        }

    }

    else{
        println("Digite um valor maior que 0.")

    }
}