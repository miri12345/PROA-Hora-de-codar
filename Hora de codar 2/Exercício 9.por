programa {
  funcao inicio() {
    inteiro ano_de_nascimento

    escreva("Escreva seu ano de nascimento: ")
    leia(ano_de_nascimento)

    se(ano_de_nascimento <= 2006){
      escreva("Voc� poder� votar esse ano")
    }senao{
      escreva("Voc� n�o poder� votar esse ano")
    }
  }
}
