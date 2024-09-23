package classes.colecoesEordenacao.generics.CadastroVeiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaCadastro {

    private List<Veiculo> veiculos;

    public SistemaCadastro() {
        this.veiculos = new ArrayList<>();
    }

    // Método para adicionar algum tipo de veiculo
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    // Método para ordenar com base no tipo de veiculo
    public List<? extends Veiculo> ordenarPorTipoDeVeiculo () {
        List<? extends Veiculo> veiculosOrdenadosPorTipo = new ArrayList<>(this.veiculos);
        veiculosOrdenadosPorTipo.sort(new TipoVeiculoComparator());
        return veiculosOrdenadosPorTipo;
    }

    public void exibirPorTipo() {
        List<? extends Veiculo> veiculosOrdenados = ordenarPorTipoDeVeiculo();
        for (Veiculo veiculos : veiculosOrdenados) {
            System.out.println(veiculos);
        }
    }

    // Método para ordenar com base no nome em ordem alfabética
    public List<? extends Veiculo> ordenarVeiculosPorModelo () {
        List<? extends Veiculo> veiculosOrdenadosPorModelo = new ArrayList<>(this.veiculos);
        veiculosOrdenadosPorModelo.sort(new ModeloVeiculoComparator());
        return veiculosOrdenadosPorModelo;
    }

    public void exibirPorModelo() {
        List<? extends Veiculo> veiculosOrdenados = ordenarVeiculosPorModelo();
        for (Veiculo veiculos : veiculosOrdenados) {
            System.out.println(veiculos);
        }
    }

    // Método para ordenar e exibir com base no preço (modelo padrão)
    public List<? extends Veiculo> ordenarVeiculosPorPreco() {
        List<? extends Veiculo> veiculosOrdenadosPorPreco = new ArrayList<>(this.veiculos);
        Collections.sort(veiculosOrdenadosPorPreco);
        return veiculosOrdenadosPorPreco;
    }

    public void exibirPorPreco() {
        List<? extends Veiculo> veiculosOrdenadosPorPreco = ordenarVeiculosPorPreco();
        for (Veiculo veiculos : veiculosOrdenadosPorPreco) {
            System.out.println(veiculos);
        }
    }


}
