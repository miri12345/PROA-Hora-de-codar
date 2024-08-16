programa {
  funcao inicio() {
    inteiro n1,n2
    cadeia operacao
    real resultado

    escreva("Digite dois valores: ")
    leia(n1,n2)
    escreva("Qual operação você deseja? Sendo adição (1), subtração (2), divisão (3) e multiplicação (4): ")
    leia(operacao)

    se(operacao == 1){
      resultado= n1+n2
      escreva("O valor da adição é ",resultado,"")
    }
    se(operacao == 2){
      resultado = n1-n2
      escreva("O valor da subtração é ",resultado,"")
    }
    se(operacao == 3){
      resultado = n1/n2
      escreva("O valor da divisão é ",resultado,"")
    }
    se(operacao == 4){
      resultado = n1*n2
      escreva("O valor da multiplicação é ",resultado,"")
    }

    
  }
}
