package classes.colecoesEordenacao.generics.CadastroVeiculos;

public class Carro extends Veiculo{

    private int quantidadePortas;

    public Carro(String marca, String modelo, int anoFabricacao, double preco, double quilometragem, String tipoDeVeiculo, int quantidadePortas) {
        super(marca, modelo, anoFabricacao, preco, quilometragem, tipoDeVeiculo);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

}
