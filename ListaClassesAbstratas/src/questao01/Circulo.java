package questao01;

public class Circulo extends Forma{
    private double raio;

    public Circulo (double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (raio * raio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }
}