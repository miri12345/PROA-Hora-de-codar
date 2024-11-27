fun main(){
  println("Digite um número: ")
  var n1 = readln().toInt()

  if(n1 > 0){
      println("O número $n1 é positivo")
  } else if(n1 < 0){
      println("O número $n1 é negativo")
    }else{
        println("Este número é 0")
    }

}