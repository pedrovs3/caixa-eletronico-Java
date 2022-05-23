package com.mycompany.caixaeletronico;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta user = new Conta();  
        
        user.setConta("8765-4321");
        user.setAgencia("ag-456");
        user.setSaldo(15000);
        
        System.out.printf("Numero da Agencia: %s\n", user.getAgencia());
        System.out.printf("Numero da Conta: %s\n", user.getConta());
        System.out.printf("Saldo Disponível: %.2f\n", user.getSaldo());
        
        
    }
    
}
