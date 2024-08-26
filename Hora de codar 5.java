import java.util.Scanner;

public class Main {
    static double saldo = 150.00;
    static int senhaCorreta = 3589;
    static int contaBancariaValida = 12345;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Olá, nos informe o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + " é um prazer ter você por aqui");

        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Ver saldo");
            System.out.println("2. Ver extrato");
            System.out.println("3. Fazer saque");
            System.out.println("4. Fazer depósito"); 
            System.out.println("5. Fazer transferência");
            System.out.println("6. Sair\n");
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    verSaldo();
                    break;
                case 2:
                    verExtrato();
                    break;
                case 3:
                    fazerSaque();
                    break;
                case 4:
                    fazerDeposito();
                    break;
                case 5: fazerTransferencia();
                    break;
                case 6:
                    sair(nome);
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void verSaldo() {
        System.out.println("Para ver seu saldo, digite sua senha: ");
        int senha = scanner.nextInt();

        if (senha == senhaCorreta) {
            System.out.println("Seu saldo atual é: " + saldo);
        } else {
            System.out.println("Senha inválida");
            verSaldo();
        }
    }
    
    public static void verExtrato(){
        System.out.println("Para ver seu extrato, digite sua senha: ");
        int senha = scanner.nextInt();

        if (senha != senhaCorreta){
          System.out.println("Senha inválida! ");
          verExtrato();
        }else{
          System.out.println("Seu extrato é: ");
          System.out.println("Depósito de R$ 219,99 ");
          System.out.println("Mercado Atacadista R$ 518,99 ");
          System.out.println("Saque de R$ 200,00 ");
        }
    }
    
    public static void fazerSaque(){
        
      System.out.println("Para fazer o saque, digite sua senha: ");
      int senha = scanner.nextInt();

        if(senha == senhaCorreta){
          System.out.println("Qual o valor para saque? ");
          double saque = scanner.nextDouble();
   
          if(saque <= 0) {
            System.out.println("Por favor, informe um número válido.");
            fazerSaque();
          }else if(saque > saldo){
           System.out.println("Operação não autorizada");
          }else {
           saldo = saldo - saque;
           verSaldo();
          }
          
        }else{
          System.out.println("Senha inválida!");
          fazerSaque();
        }
    }
    
    public static void fazerDeposito(){

      System.out.println("Para fazer o depósito, digite sua senha: ");
      int senha = scanner.nextInt();

        if (senha == senhaCorreta){
          System.out.println("Qual o valor para depósito? ");
          double deposito = scanner.nextDouble();
     
         if (deposito <= 0){
           System.out.println("Operação não autorizada");
           fazerDeposito();
          } else {
          saldo = saldo + deposito;
          verSaldo();
         }
          
        }else{
          System.out.println("Senha inválida! ");
          fazerDeposito();
        }
    }
    
    public static void fazerTransferencia(){
        
        

         System.out.println("Para fazer a transferência, digite sua senha: ");
         int senha = scanner.nextInt();

           if(senha == senhaCorreta){
          
            System.out.println("Informe o número da conta bancária (apenas números): ");
            int contaDoBanco = scanner.nextInt();
             
             if(contaDoBanco == contaBancariaValida){
                System.out.println("Informe o valor da transferência: ");
                double transferencia = scanner.nextDouble();

                if(transferencia <= 0){
                   System.out.println("Informe um valor válido \n");
                }else if(transferencia > saldo){
                   System.out.println("Saldo insuficiente!");
                   fazerTransferencia();
                }else{
                 saldo = saldo - transferencia;
                 System.out.println("Seu saldo atual é: " + saldo);
                 
                }
               
               }else{
                 System.out.println("Valor de conta inválido!");
                 fazerTransferencia();
             }
             }else{
               System.out.println("Senha inválida!");
               fazerTransferencia();
        }
      
    }
    
    public static void sair(String nome){
    System.out.println("Foi um prazer ter você por aqui, " + nome);
    
}
    
}

