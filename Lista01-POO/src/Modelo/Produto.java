package Modelo;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidadeEmEstoque(){
        return quantidadeEmEstoque;
    }

    public Produto(String nome,double preco,int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double valorTotal(){
        return this.preco*this.quantidadeEmEstoque;
    }

    public void atualizar(int quantidade){
        this.quantidadeEmEstoque+=quantidade;
    }
}
