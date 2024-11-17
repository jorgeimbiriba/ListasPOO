package Questao4;

public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco,int quantidade, String autor){
        super(nome,preco,quantidade);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: " + autor);
    }
}