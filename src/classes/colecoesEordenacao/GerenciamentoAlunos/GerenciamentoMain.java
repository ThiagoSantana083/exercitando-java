package classes.colecoesEordenacao.GerenciamentoAlunos;

public class GerenciamentoMain {
    public static void main(String[] args) {
        // Gerenciamento Objeto
        SistemaGerenciamento gerenciamento = new SistemaGerenciamento();
        // Alunos
        Aluno thiago = new Aluno("Thiago", 18, 9.9F, 1);
        Aluno heloisa = new Aluno("Heloisa", 18, 9.7F, 4);
        Aluno daniel = new Aluno("Daniel", 13, 9.0F, 3);
        Aluno danielle = new Aluno("Danielle", 8, 9.3F, 2);
        Aluno joao = new Aluno("João", 10, 8.5F, 5);
        // Adicionando alunos do sistema de gerenciamento
        gerenciamento.adicionaAluno(thiago);
        gerenciamento.adicionaAluno(heloisa);
        gerenciamento.adicionaAluno(daniel);
        gerenciamento.adicionaAluno(danielle);
        gerenciamento.adicionaAluno(joao);
        // Ordenando e exibindo lista de alunos
        System.out.println("========== Ordenando e exibindo por número de matricula ===========");
        gerenciamento.ordenarPorMatricula();
        gerenciamento.exibirAlunosPorMatricula();
        System.out.println();
        System.out.println("======== Ordenando e exibindo por idade ==============");
        gerenciamento.ordenarPorIdade();
        gerenciamento.exibirAlunosPorIdade();
        System.out.println();
        System.out.println("======== Ordenando e exibindo por média notas ==============");
        gerenciamento.ordenarPorMediaNotas();
        gerenciamento.exibirAlunosPorMediaNotas();
        System.out.println();
        System.out.println("======== Ordenando e exibindo por nomes alfabético ==============");
        gerenciamento.ordenarPorNome();
        gerenciamento.exibirAlunosPorNome();
        System.out.println();
        System.out.println("======== Exibindo alunos de forma natural sem ordenar ==============");
        gerenciamento.exibirAlunosFormaNatural();

    }
}
