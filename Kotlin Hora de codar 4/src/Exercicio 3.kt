
fun main() {
    val listaDeFrutas = mutableListOf("banana", "melancia", "uva", "pessego", "mertilo")
    
    while (listaDeFrutas.isNotEmpty()) {
        println("Lista de compras: $listaDeFrutas")
        println("Digite o nome de uma fruta para removê-la da lista: ")
        val fruta = readln()
        
        if (fruta in listaDeFrutas) {
            listaDeFrutas.remove(fruta)
            println("Fruta foi retirada da lista.")
        } else {
            println("Fruta indisponível no nosso mercado.")
        }
    }
    
    println("Lista de compras finalizada.")
}

