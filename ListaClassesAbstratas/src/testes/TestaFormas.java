package testes;

import questao01.Circulo;
import questao01.Retangulo;

public class TestaFormas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(6);
        Retangulo retangulo = new Retangulo(3,8);

        System.out.println("Área do Círculo: "+ circulo.calcularArea());
        System.out.println("Área do Retângulo: "+ retangulo.calcularArea());
        System.out.println();

        System.out.println("Perímetro do Círculo: "+ circulo.calcularPerimetro());
        System.out.println("Perímetro de Retângulo: "+ retangulo.calcularPerimetro());
    }
}
