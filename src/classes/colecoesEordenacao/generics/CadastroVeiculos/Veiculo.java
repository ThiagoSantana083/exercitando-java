package classes.colecoesEordenacao.generics.CadastroVeiculos;

import java.util.Objects;

public class Veiculo implements Comparable<Veiculo> {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;
    private double quilometragem;
    private String tipoDeVeiculo;

    public Veiculo(String marca, String modelo, int anoFabricacao, double preco, double quilometragem, String tipoDeVeiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
        this.quilometragem = quilometragem;
        this.tipoDeVeiculo = tipoDeVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", preco=" + preco +
                ", quilometragem=" + quilometragem +
                ", tipoDeVeiculo='" + tipoDeVeiculo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return anoFabricacao == veiculo.anoFabricacao && Objects.equals(marca, veiculo.marca) && Objects.equals(modelo, veiculo.modelo) && Objects.equals(tipoDeVeiculo, veiculo.tipoDeVeiculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anoFabricacao, tipoDeVeiculo);
    }

    public String getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }

    public void setTipoDeVeiculo(String tipoDeVeiculo) {
        this.tipoDeVeiculo = tipoDeVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public int compareTo(Veiculo o) {
        return Double.compare(this.getPreco(), o.getPreco());
    }
}
