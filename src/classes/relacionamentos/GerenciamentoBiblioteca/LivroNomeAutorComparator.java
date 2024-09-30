package classes.relacionamentos.GerenciamentoBiblioteca;

import java.util.Comparator;

public class LivroNomeAutorComparator implements Comparator<Livro> {

    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getAutorDoLivro().getNome().compareTo(o2.getAutorDoLivro().getNome());
    }
}
