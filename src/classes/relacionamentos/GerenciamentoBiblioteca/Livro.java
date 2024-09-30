package classes.relacionamentos.GerenciamentoBiblioteca;

import java.util.Comparator;
import java.util.Objects;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private int anoPublicacao;
    private String genero;
    private Autor autorDoLivro;

    public Livro(String titulo, int anoPublicacao, String genero, Autor autorDoLivro) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.autorDoLivro = autorDoLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutorDoLivro() {
        return autorDoLivro;
    }

    public void setAutorDoLivro(Autor autorDoLivro) {
        this.autorDoLivro = autorDoLivro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo) && Objects.equals(autorDoLivro, livro.autorDoLivro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autorDoLivro);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", genero='" + genero + '\'' +
                ", autorDoLivro=" + autorDoLivro +
                '}';
    }

    // Ordenação com base no ano de publicação do livro
    @Override
    public int compareTo(Livro o) {
        return this.getAnoPublicacao() - o.getAnoPublicacao();
    }
}

