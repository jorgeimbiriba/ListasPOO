package Testes;
import Modelo.ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args){
        ContaBancaria contaBancaria1 = new ContaBancaria("123457-3",3000);
        System.out.printf("Jorge o número de sua conta é:");
        System.out.println(contaBancaria1.getNumeroDaConta());
        System.out.printf("Seu saldo é de: ");
        System.out.println(contaBancaria1.getSaldo());
        contaBancaria1.depositar(500);

        System.out.println("Saldo atual: "+contaBancaria1.getSaldo());

        System.out.println("*****************************");
        ContaBancaria contaBancaria2 = new ContaBancaria("215578-5",5200);
        System.out.printf("Henrique o número de sua conta é:");
        System.out.println(contaBancaria2.getNumeroDaConta());
        System.out.printf("Seu saldo é de: ");
        System.out.println(contaBancaria2.getSaldo());
        contaBancaria2.sacar(700);

        System.out.println("Saldo atual: "+contaBancaria2.getSaldo());
    }
}
