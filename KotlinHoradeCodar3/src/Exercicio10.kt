fun main(){
    var i = 0
    var j = 0

    println("Digite o valor de N: ")
    val n = readln().toInt()


    i = 1


    while(i <= n) {
        println("Tabuada do $i :")


        j = 1

        while(j <= 10) {
            println("$i x $j = ${i * j}")
            j = j + 1
        }

        println("\n")
        i = i + 1
    }
}