programa {
  funcao inicio() {
    
   // area do trapézio

   real bmaior
   real bmenor
   real altura
   real area

   escreva("Qual é o valor da base maior? ")
   leia(bmaior)
   escreva("Qual é valor da base menor? ")
   leia(bmenor)
   escreva("Qual é valor da altura? ")
   leia(altura)

   area = (bmaior + bmenor) * altura / 2

   escreva("A área do trapézio é ", area)


  }
}
