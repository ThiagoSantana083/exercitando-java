package classes.relacionamentos.SistemaGestaoEscolar;

import java.util.Comparator;

public class AlunoPorIdadeComparator implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getIdade() - o2.getIdade();
    }
}
