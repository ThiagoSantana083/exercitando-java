package classes.colecoesEordenacao.Agenda;

import java.util.Comparator;

public class ContatoPorIdadeComparator implements Comparator<Contato> {

    @Override
    public int compare(Contato o1, Contato o2) {
        return o1.getIdade() - o2.getIdade();
    }
}
