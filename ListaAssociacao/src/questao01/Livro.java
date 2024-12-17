package questao01;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }
}
