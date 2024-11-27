fun main(){

    val planetas = listOf("mercúrio", "vênus", "terra","marte","júpiter","saturno","urano", "plutão")

    println("Digite o nome de um planeta: ")
    val planeta: String = readln()

    if(planetas.contains(planeta.lowercase())){
        println("Este planeta está na lista")
    }else{
        println("Este planeta não está na lista")
    }


}