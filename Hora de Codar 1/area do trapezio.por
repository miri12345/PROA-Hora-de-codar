programa {
  funcao inicio() {
    
   // area do trap�zio

   real bmaior
   real bmenor
   real altura
   real area

   escreva("Qual � o valor da base maior? ")
   leia(bmaior)
   escreva("Qual � valor da base menor? ")
   leia(bmenor)
   escreva("Qual � valor da altura? ")
   leia(altura)

   area = (bmaior + bmenor) * altura / 2

   escreva("A �rea do trap�zio � ", area)


  }
}
