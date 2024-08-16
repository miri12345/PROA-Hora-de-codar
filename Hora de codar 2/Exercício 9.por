programa {
  funcao inicio() {
    inteiro ano_de_nascimento

    escreva("Escreva seu ano de nascimento: ")
    leia(ano_de_nascimento)

    se(ano_de_nascimento <= 2006){
      escreva("Você poderá votar esse ano")
    }senao{
      escreva("Você não poderá votar esse ano")
    }
  }
}
