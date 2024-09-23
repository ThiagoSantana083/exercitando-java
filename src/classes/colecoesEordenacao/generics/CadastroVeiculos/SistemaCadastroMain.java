package classes.colecoesEordenacao.generics.CadastroVeiculos;

public class SistemaCadastroMain {
    public static void main(String[] args) {
        SistemaCadastro sistemaCadastro = new SistemaCadastro();
        Carro prisma = new Carro("Chevrolet", "Prisma", 2016, 130000, 40,
                "Carro", 4);
        Moto suzuki = new Moto("Yamaha", "Suzuki", 2017, 13000, 0,
                "Moto", "Cruiser");
        Moto fan = new Moto("Honda", "Fan 160", 2017, 13000, 0,
                "Moto", "Cruiser");
        Carro camaro = new Carro("Chevrolet", "Camaro", 2024, 500000, 20,
                "Carro", 4);
        Caminhao accelo = new Caminhao("Mercedez-Benz", "Accelo 1016", 2017, 129000,
                20, "Caminhão", true);

        sistemaCadastro.adicionarVeiculo(prisma);
        sistemaCadastro.adicionarVeiculo(suzuki);
        sistemaCadastro.adicionarVeiculo(fan);
        sistemaCadastro.adicionarVeiculo(camaro);
        sistemaCadastro.adicionarVeiculo(accelo);
        // Exibindo por tipo de veiculo
        System.out.println("=========== Exibindo por Tipo de Veículo ==========");
        sistemaCadastro.exibirPorTipo();
        System.out.println();
        // Exibindo por modelo do veiculo de forma alfabética
        System.out.println("============ Exibindo por Modelo em Ordem Alfabética ============");
        sistemaCadastro.exibirPorModelo();
        System.out.println();
        System.out.println("================= Exibindo por preço ==================");
        sistemaCadastro.exibirPorPreco();
    }
}
