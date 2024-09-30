package classes.relacionamentos.GerenciamentoBiblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Método getter para pegar a lista de livros que tem
    public List<Livro> getLivros() {
        return livros;
    }

    // Método para adicionar livros
    public void adicionarLivrosNaBiblioteca(Livro livro){
        this.getLivros().add(livro);
    }

    // Método para remover algum livro da biblioteca com base no título (list pode ter mais de um)
    public void removerLivroPorTitulo(String titulo) {
        List<Livro> livroParaSerRemovido = new ArrayList<>();
        if (!this.livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroParaSerRemovido.add(livro);
                }
            }
            System.out.println("Removendo livro: " + titulo + "...");
            this.livros.removeAll(livroParaSerRemovido);
            System.out.println("Livro removido...");
        } else {
            System.out.println("Lista de livros da biblioteca está vazia e não pode ser removido o livro que pediu!");
        }
    }

    // Método para remover algum livro da biblioteca com base no titulo e nome do autor
    public void removerLivroPorTituloEAutor(String titulo, Autor autor) {
        List<Livro> livrosParaSeremRemovidos = new ArrayList<>();
        if (!this.getLivros().isEmpty()) {
            for (Livro livro : this.getLivros()) {
                if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getAutorDoLivro().getNome().equalsIgnoreCase(autor.getNome())) {
                    livrosParaSeremRemovidos.add(livro);
                }
            }
            System.out.println("Removendo livro: " + titulo + "...");
            this.getLivros().removeAll(livrosParaSeremRemovidos);
            System.out.println("Livro removido...");
        } else {
            System.out.println("Lista de livros da biblioteca está vazia e não pode ser removido o livro que pediu!");
        }
    }

    // Métodos para ordenação dos livros
    public List<Livro> ordenarLivrosPorAnoDePublicacao() {
        List<Livro> livrosOrdenados = new ArrayList<>(this.getLivros());
        Collections.sort(livrosOrdenados);
        return livrosOrdenados;
    }

    public List<Livro> ordenarLivrosPorNomeDoAutor() {
        List<Livro> livrosOrdenados = new ArrayList<>(this.getLivros());
        livrosOrdenados.sort(new LivroNomeAutorComparator());
        return livrosOrdenados;
    }

    public List<Livro> ordenarLivrosPorTitulo() {
        List<Livro> livrosOrdenados = new ArrayList<>(this.getLivros());
        livrosOrdenados.sort(new LivroPorTituloComparator());
        return livrosOrdenados;
    }

    // Métodos para exibir os livros
    public void exibirLivros() {
        if (!this.getLivros().isEmpty()) {
            System.out.println(" ===== Livros que tem na biblioteca disponíveis sem ordenação: ======");
            for (Livro livro : this.getLivros()) {
                System.out.println("Livro: " + livro.getTitulo() + ", do Autor: " + livro.getAutorDoLivro().getNome());
            }
        } else {
            System.out.println("======= Não tem livros na biblioteca disponíveis! ========");
        }
    }

    public void exibirLivrosOrdenadosPorAnoDePublicacao() {
        if (!this.getLivros().isEmpty()) {
            List<Livro> livrosOrdenados = this.ordenarLivrosPorAnoDePublicacao();
            System.out.println(" ===== Livros que tem na biblioteca disponíveis ordenados por ano de publicação: " +
                    "======");
            for (Livro livro : livrosOrdenados) {
                System.out.println("Livro: " + livro.getTitulo() + ", do Autor: " + livro.getAutorDoLivro().getNome() +
                        ", ano de publicação: " + livro.getAnoPublicacao());
            }
        } else {
            System.out.println("======= Não tem livros na biblioteca disponíveis! ========");
        }
    }

    public void exibirLivrosOrdenadosPorNomeAutor() {
        if (!this.getLivros().isEmpty()) {
            List<Livro> livrosOrdenados = this.ordenarLivrosPorNomeDoAutor();
            System.out.println(" ===== Livros que tem na biblioteca disponíveis ordenados pelo nome do autor: " +
                    "======");
            for (Livro livro : livrosOrdenados) {
                System.out.println("Livro: " + livro.getTitulo() + ", do Autor: " + livro.getAutorDoLivro().getNome() +
                        ", ano de publicação: " + livro.getAnoPublicacao());
            }
        } else {
            System.out.println("======= Não tem livros na biblioteca disponíveis! ========");
        }
    }

    public void exibirLivrosOrdenadosPorTitulo() {
        if (!this.getLivros().isEmpty()) {
            List<Livro> livrosOrdenados = this.ordenarLivrosPorTitulo();
            System.out.println(" ===== Livros que tem na biblioteca disponíveis ordenados pelo seu título: " +
                    "======");
            for (Livro livro : livrosOrdenados) {
                System.out.println("Livro: " + livro.getTitulo() + ", do Autor: " + livro.getAutorDoLivro().getNome() +
                        ", ano de publicação: " + livro.getAnoPublicacao());
            }
        } else {
            System.out.println("======= Não tem livros na biblioteca disponíveis! ========");
        }
    }


}
