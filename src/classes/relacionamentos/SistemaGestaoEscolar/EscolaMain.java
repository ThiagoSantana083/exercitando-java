package classes.relacionamentos.SistemaGestaoEscolar;

public class EscolaMain {
    public static void main(String[] args) {
        // Instâncias de professores
        Professor danilo = new Professor("Danilo", 38, 1678.78, "Matemática");
        Professor fernanda = new Professor("Fernanda", 28, 1878.50, "Programação");
        Professor aline = new Professor("Aline", 40, 1728.28, "Português");
        // Instâncias de alunos
        Aluno matheus = new Aluno("Matheus", 17, 6768, 9.4);
        Aluno josy = new Aluno("Josy", 19, 5692, 9.3);
        Aluno maria = new Aluno("Maria", 18, 3428, 9.0);
        Aluno kleber = new Aluno("Kléber", 20, 1271, 8.4);
        Aluno guilherme = new Aluno("Guilherme", 25, 4793, 9.8);
        Aluno henrique = new Aluno("Henrique", 21, 1413, 9.6);
        Aluno jose = new Aluno("José", 15, 1890, 9.2);
        Aluno davi = new Aluno("Davi", 16, 1391, 9.0);
        Aluno vitoria = new Aluno("Vitória", 17, 7689, 8.7);
        // Instâncias de turmas
        Turma quartoAno = new Turma("Turma do 4º ano", fernanda);
        Turma segundoAno = new Turma("Turma do 2º ano", danilo);
        Turma primeiroAno = new Turma("Turma do 1º ano", aline);
        // Adicionando alunos nas turmas respectivas
        quartoAno.adicionarAlunoNaTurma(henrique);
        quartoAno.adicionarAlunoNaTurma(kleber);
        quartoAno.adicionarAlunoNaTurma(guilherme);

        segundoAno.adicionarAlunoNaTurma(josy);
        segundoAno.adicionarAlunoNaTurma(matheus);
        segundoAno.adicionarAlunoNaTurma(maria);

        primeiroAno.adicionarAlunoNaTurma(davi);
        primeiroAno.adicionarAlunoNaTurma(vitoria);
        primeiroAno.adicionarAlunoNaTurma(jose);

        // Instância de Escola e adicionando turmas para a escola
        Escola escola = new Escola("Escola de Programação para Todos");
        escola.adicionaTurma(quartoAno);
        escola.adicionaTurma(primeiroAno);
        escola.adicionaTurma(segundoAno);

        System.out.println("================ Exibindo as turmas em ordem crescente e seus alunos ordenados pelo nome " +
                "em ordem" +
                " " +
                "alfabética ================");
        escola.exibirTurmasDaEscolaEAlunosOrdenadosPorNome();
        System.out.println();
        System.out.println("============= Exibindo as turmas em ordem crescente e seus alunos ordenados pela sua " +
                "idade " +
                "=============");
        escola.exibirTurmasDaEscolaEAlunosOrdenadosPorIdade();
        System.out.println();
        System.out.println("============= Exibindo as turmas em ordem crescente e seus alunos ordenados pela sua " +
                "nota final " +
                "=============");
        escola.exibirTurmasDaEscolaEAlunosOrdenadosPorNotaFinal();

        System.out.println();
        System.out.println("======== Procurando aluno(a) com base no nome dele(a) ==========");
        escola.mostrarDadosAlunoComBaseNoNome("Davi");


    }
}
