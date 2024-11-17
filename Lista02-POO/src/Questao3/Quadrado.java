package Questao3;

public class Quadrado extends FiguraGeometrica{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override //Garante que o metodo está sendo sobrescrito
    public double calcularArea(){
        return lado*lado;
    }
}
