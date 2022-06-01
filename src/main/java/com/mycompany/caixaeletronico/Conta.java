package com.mycompany.caixaeletronico;

public class Conta {
    private String conta = "1234-5678";
    private String agencia = "ag-123";
    private double saldo = 10000;
    
    /* Declaração Métodos de get */
    // Método getAgencia
    public String getAgencia(){
        return agencia;
    }
    
    // Método getConta
    public String getConta(){
        return conta;
    }
    
    // Método getSaldo
    public double getSaldo(){
        return saldo;
    }
    
    /* Declaração Métodos de set */
    // Método setAgencia
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    // Método setConta
    public void setConta(String conta){
        this.conta = conta;
    }
    
    // Método setSaldo
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double verificarSaldo(){
        return this.saldo;
    }

    public void realizarDeposito(double valor){
        this.saldo += valor;
    }

    public void realizarSaque(double saldo){
        this.saldo -= saldo;
    }
}
