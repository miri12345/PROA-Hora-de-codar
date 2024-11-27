fun main(){

    println("Digite o primeiro número: ")
    var n1 = readln().toInt()

    println("Digite o segundo número: ")
    var n2 = readln().toInt()

    println("Digite o terceiro número: ")
    var n3 = readln().toInt()

    if(n1 > n2 && n1 > n3){
        println("O número $n1 é o maior")
    }else if(n2 > n1 && n2 > n3){
        println("O número $n2 é maior")
    }else{
        println("O número $n3 é maior")
    }

}