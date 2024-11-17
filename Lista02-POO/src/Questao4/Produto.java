package Questao4;

public class Produto {
    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto(String nome,double preco,int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
