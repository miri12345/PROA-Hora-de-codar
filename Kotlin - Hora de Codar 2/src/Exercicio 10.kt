fun main(){
    var pesoIdeal = 0.0

    println("Informe sua altura em metros: ")
    var altura = readln().toDouble()

    println("Qual é seu gênero biológico: Feminino (1) ou masculino (2)")
    var genero = readln().toInt()

    if(genero == 1){
       pesoIdeal = (62.1 * altura) - 44.7
    }else{
       pesoIdeal = (72.7 * altura) - 58
    }

    println("Seu peso ideial é: $pesoIdeal kg")
}