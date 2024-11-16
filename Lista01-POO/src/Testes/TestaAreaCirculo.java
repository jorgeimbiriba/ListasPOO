package Testes;

import Modelo.Circulo;

public class TestaAreaCirculo {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        double area = circulo1.calcularArea();
        System.out.println("Área do círculo 1: "+area);

        Circulo circulo2 = new Circulo();
        circulo2.setRaio(3);
        System.out.println("Raio do círculo 2: "+circulo2.getRaio());
    }

}
