package com.mycompany.caixaeletronico;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Conta user1 = new Conta();

        Scanner input = new Scanner(System.in);
        
        int op = 0;

        while (op != 4) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Verificar Saldo");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Realizar Saque");
            System.out.println("4 - Sair");
            op = input.nextInt();

            double valor = 0;

            switch (op) {
                case 1:
                    System.out.printf("Saldo atual: %.2f", user1.verificarSaldo());
                    break;
                case 2:
                    System.out.println("Digite o valor de Deposito");
                    valor = input.nextDouble();
                    user1.realizarDeposito(valor);
                    System.out.printf("\nSaldo Atual: %.2f", user1.verificarSaldo());
                    break;
                case 3:
                    System.out.println("Digite o valor de Saque: ");
                    valor = input.nextDouble();
                    user1.realizarSaque(valor);
                    System.out.printf("\nSaldo atual: %.2f", user1.verificarSaldo());
                    break;
                case 4:
                    System.out.println("Encerrando o Sistema...");
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
    
}
