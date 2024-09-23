package classes.colecoesEordenacao.generics.CadastroVeiculos;

public class Moto extends Veiculo{

    private String tipoDeGuidao;

    public Moto(String marca, String modelo, int anoFabricacao, double preco, double quilometragem, String tipoDeVeiculo, String tipoDeGuidao) {
        super(marca, modelo, anoFabricacao, preco, quilometragem, tipoDeVeiculo);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    public void setTipoDeGuidao(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
    }
}
