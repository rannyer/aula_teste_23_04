package org.example;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial){
        if(saldoInicial < 0){
            throw new IllegalArgumentException("Saldo inicial nao pode ser negativo");
        }
        this.saldo = saldoInicial;
    }

    public double getSaldo(){
        return saldo;
    }

    public void sacar(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Nao pode ser efetuado saque negativo");
        }
        if(valor > saldo){
            throw new IllegalArgumentException("Nao pode sacar valor maior que saldo");
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
    }

    public boolean sacar2(double valor){
        if(valor < 0){
            return false;
        }
        if(valor > saldo){
            return false;
        }

        saldo -= valor;
        return true;
    }
}
