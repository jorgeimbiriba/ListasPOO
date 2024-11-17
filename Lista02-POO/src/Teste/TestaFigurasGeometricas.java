package Teste;
import Questao3.*;
public class TestaFigurasGeometricas {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(3,8);
        Circulo circulo = new Circulo(3);

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}
