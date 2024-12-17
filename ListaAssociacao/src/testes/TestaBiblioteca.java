package testes;

import questao01.*;

public class TestaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criar livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");


        // Adiciona livros
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

       biblioteca.listarLivros();
    }
}
