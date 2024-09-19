package classes.colecoesEordenacao.Agenda;

public class AgendaMain {
    public static void main(String[] args) {
        // Manipulações de teste para coleções e ordenação (projeto de contato feito)
        Contato thiago = new Contato("Thiago", 83989567489L, 18, "example1@gmail");
        Contato heloisa = new Contato("Heloisa", 83946736489L, 17, "example2@gmail");
        Contato mirian = new Contato("Mirian", 83957969789L, 56, "example3@gmail");
        Contato danielle = new Contato("Danielle", 83957452571L, 8, "example4@gmail");
        Contato bolt = new Contato("Bolt", 83957452533L, 9, "example5@gmail");

        // Criando agenda e métodos de adicionar, ordenar e exibir
        Agenda agenda = new Agenda();
        agenda.adicionaContato(thiago);
        agenda.adicionaContato(heloisa);
        agenda.adicionaContato(mirian);
        agenda.adicionaContato(danielle);
        agenda.adicionaContato(bolt);
        System.out.println("=========== Ordenado por Nome Alfabético =============");
        System.out.println();
        agenda.exibirContatosPorNome();
        System.out.println();
        System.out.println("============= Ordenado por Idade ==============");
        System.out.println();
        agenda.exibirContatosPorIdade();

    }
}