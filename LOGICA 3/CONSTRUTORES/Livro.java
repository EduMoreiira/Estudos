package CONSTRUTORES;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    public Livro(String titulo){
        this.titulo = titulo;
    }

    public Livro(String titulo, String autor){
        this(titulo);
        this.autor = autor;
    }

    public Livro (String titulo, String autor, int paginas){
        this(titulo, autor);
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }

}
