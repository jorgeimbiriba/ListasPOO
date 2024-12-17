package questao01;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void listarLivros(){
        for (Livro livro:livros){
            System.out.println("Título:"+ livro.getTitulo());
            System.out.println("Autor:"+ livro.getAutor());
            System.out.println();
        }
    }

}
