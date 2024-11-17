package Questao4;

public class Eletronico extends Produto{
    private String marca;

    public Eletronico(String nome,double preco, int quantidade, String marca){
        super(nome, preco, quantidade);
        this.marca = marca;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Marca: " + marca);
    }
}