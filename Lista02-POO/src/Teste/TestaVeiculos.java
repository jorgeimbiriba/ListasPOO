package Teste;
import Questao1.*;

public class TestaVeiculos {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Hyundai","HB20",2018,4);
        Moto moto1 = new Moto("Honda","Bros",2016,160);
        Caminhao caminhao1 = new Caminhao("Volkswagen","Meteor",2024,2000);

        System.out.println("Carro de Jorge");
        System.out.println("Marca: " +carro1.getMarca());
        System.out.println("Modelo: " +carro1.getModelo());
        System.out.println("Ano: " +carro1.getAno());
        System.out.println("Número de portas: " +carro1.getNumeroDePortas());
        System.out.println("**********************");

        System.out.println("Moto de Marcelo");
        System.out.println("Marca: " +moto1.getMarca());
        System.out.println("Modelo: " +moto1.getModelo());
        System.out.println("Ano: " +moto1.getAno());
        System.out.println("Número de cilindradas: " +moto1.getCilindradas());
        System.out.println("**********************");

        System.out.println("Caminhão de Cláudio");
        System.out.println("Marca: " +caminhao1.getMarca());
        System.out.println("Modelo: " +caminhao1.getModelo());
        System.out.println("Ano: " +caminhao1.getAno());
        System.out.println("Capacidade de Carga: " +caminhao1.getCapacidadeDeCarga()+" kg");
    }
}
