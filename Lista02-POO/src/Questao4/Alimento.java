package Questao4;

public class Alimento extends Produto {
    private String validade;

    public Alimento(String nome,double preco,int quantidade,String validade){
        super(nome, preco, quantidade);
        this.validade = validade;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Validade: "+validade);
    }
}