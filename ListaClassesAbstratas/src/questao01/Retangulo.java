package questao01;

public class Retangulo extends Forma {
    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }
    @Override
    public double calcularArea(){
        return largura*comprimento;
    }

    @Override
    public double calcularPerimetro(){
        return 2* (largura + comprimento);
    }
}
