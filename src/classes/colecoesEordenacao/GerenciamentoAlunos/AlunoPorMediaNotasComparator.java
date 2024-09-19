package classes.colecoesEordenacao.GerenciamentoAlunos;

import java.util.Comparator;

public class AlunoPorMediaNotasComparator implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Float.compare(o1.getMediaNotas(), o2.getMediaNotas());
    }
}
