package Questao1;

public class Caminhao extends Veiculo {
    private double capacidadeDeCarga;

    public Caminhao(String marca,String modelo,int ano, double capacidadeDeCarga){
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public double getCapacidadeDeCarga(){
        return capacidadeDeCarga;
    }

}
