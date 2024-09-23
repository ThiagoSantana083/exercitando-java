package classes.colecoesEordenacao.generics.CadastroVeiculos;

public class Caminhao extends Veiculo{

    private boolean temCarga;

    public Caminhao(String marca, String modelo, int anoFabricacao, double preco, double quilometragem, String tipoDeVeiculo, boolean temCarga) {
        super(marca, modelo, anoFabricacao, preco, quilometragem, tipoDeVeiculo);
        this.temCarga = temCarga;
    }

    public boolean isTemCarga() {
        return temCarga;
    }

    public void setTemCarga(boolean temCarga) {
        this.temCarga = temCarga;
    }
}
