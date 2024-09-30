package classes.relacionamentos.GerenciamentoBiblioteca;

import java.util.Comparator;

public class LivroPorTituloComparator implements Comparator<Livro> {
    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
