fun main(){

    var dentroIntervalo = 0
    var foraIntervalo = 0
    var i = 1

     while(i <= 10) {
        println("Digite o valor $i")
        val valor = readln().toInt()

        if(valor >= 24 && valor <= 42) {
            dentroIntervalo = dentroIntervalo + 1
        }else{
            foraIntervalo = foraIntervalo + 1
        }

        i = i + 1
    }

    println("Quantidade de valores entre 24 e 42: $dentroIntervalo")
    println("Quantidade de valores fora do intervalo 24 e 42: $foraIntervalo")
}