package classes.relacionamentos.GerenciamentoBiblioteca;

public class BibliotecaMain {
    public static void main(String[] args) {
        // Instância de biblioteca
        Biblioteca biblioteca = new Biblioteca();
        // Autor e livro instãncia
        Autor aditya = new Autor("Aditya Y. Bhargava", 27);
        Autor robert = new Autor("Robert Cecil Martin", 45);
        Autor khaty = new Autor("Khaty Sierra", 34);

        Livro livro = new Livro("Entendendo Algoritmos", 2017, "Programação", aditya);
        Livro livro2 = new Livro("Entendendo Algoritmos", 2017, "Programação", aditya);
        Livro livro3 = new Livro("Código Limpo", 2016, "Programação", robert);
        Livro livro4 = new Livro("Use a Cabeça Java", 2024, "Programação", khaty);
        Livro livro5 = new Livro("Arquitetura Limpa", 2019, "Programação", robert);

        // Adicionando livros na biblioteca
        biblioteca.adicionarLivrosNaBiblioteca(livro);
        biblioteca.adicionarLivrosNaBiblioteca(livro2);
        biblioteca.adicionarLivrosNaBiblioteca(livro3);
        biblioteca.adicionarLivrosNaBiblioteca(livro4);
        biblioteca.adicionarLivrosNaBiblioteca(livro5);

        // Exibindo livros
        biblioteca.exibirLivrosOrdenadosPorAnoDePublicacao();
        System.out.println();
        biblioteca.exibirLivrosOrdenadosPorNomeAutor();
        System.out.println();
        biblioteca.exibirLivrosOrdenadosPorTitulo();
        System.out.println();
        biblioteca.exibirLivros();
    }
}
