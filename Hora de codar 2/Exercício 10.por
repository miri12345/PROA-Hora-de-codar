programa {
  funcao inicio() {
    inteiro sexo 
    real altura
    real peso_ideial

    escreva("Digite seu gênero biológico, sendo 1 para feminino e 2 para masculino: ")
    leia(sexo)
    escreva("Agora digite sua altura: ")
    leia(altura)

    se(sexo == 1){
      peso_ideial = (62.1 * altura) - 44.7
    } senao{
      peso_ideial = (72.7 * altura) - 58
    }
    escreva("Seu peso ideial é ",peso_ideial," kg")

  }
}
