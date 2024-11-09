fun main(){

    println("Digite seu ano de nascismento: ")
    val ano = readln().toInt()

    if(ano <= 2006){
        println("Você poderá votar esse ano!")
    }else{
        println("Você não poderá votar esse ano!")
    }
}