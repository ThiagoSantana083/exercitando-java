package classes.colecoesEordenacao.generics.CadastroVeiculos;

import java.util.Comparator;

public class TipoVeiculoComparator implements Comparator<Veiculo> {

    @Override
    public int compare(Veiculo o1, Veiculo o2) {
        return o1.getTipoDeVeiculo().compareTo(o2.getTipoDeVeiculo());
    }
}
