package Modelo;

public class Circulo {
    private double raio;

    //Construtor sem parâmetros
    public Circulo(){
        this.raio =0 ;
    }

    //Construtor com parâmetros
    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(raio,2);
    }
}