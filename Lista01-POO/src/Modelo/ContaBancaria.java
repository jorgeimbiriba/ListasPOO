package Modelo;

public class ContaBancaria {
    private String numeroDaConta;
    private double saldo;

    public ContaBancaria(String numeroDaConta, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if (valor>0){
            saldo+=valor;
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Valor Inválido!");
        }
    }

    public void sacar(double valor){
        if(valor>0){
            saldo-=valor;
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Valor inválido!");
        }
    }
}
