/***********************************************************************
 * Simulando Uma Conta Bancária Através Do Terminal/Console
 * 
 */

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Entre com os dados se sua conta:");
    
        // Solicita o número da conta'
        System.out.println("Digite o número da conta [NNNN]:");
        int nNmrConta = myObj.nextInt();

        // Limpa o buffer do teclado
         myObj.nextLine(); 

        // String input
        System.out.printf("\nDigite o nome do cliente:\n");
        String sNameCrtsta = myObj.nextLine();

        // Limpa o buffer do teclado
        // myObj.nextLine(); 

        System.out.printf("\nDigite o Código da Agência [NNN-N]:\n");
        String sAgencia = myObj.nextLine();


        System.out.println("\nDigite o Saldo da conta [NN,NN]:");
        double dbSaldo = myObj.nextDouble();
    

        // Finaliza com saudação de um cadastro bem sucedido.
        System.out.printf("\n\n\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n\n\n", sNameCrtsta, sAgencia, nNmrConta, dbSaldo);

        myObj.close();
    }
}
