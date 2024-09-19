package classes.colecoesEordenacao.GerenciamentoAlunos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaGerenciamento {
    private List<Aluno> alunos;

    public SistemaGerenciamento() {
        this.alunos = new ArrayList<>();
    }

    // Método para adicionar aluno
    public void adicionaAluno(Aluno aluno) {
        this.getAlunos().add(aluno);
    }

    // Métodos para ordenar e exibir lista de alunos com base na matricula
    public List<Aluno> ordenarPorMatricula() {
        List<Aluno> alunosOrdenadosPorMatricula = new ArrayList<>(this.getAlunos());
        Collections.sort(alunosOrdenadosPorMatricula);
        return alunosOrdenadosPorMatricula;
    }

    public void exibirAlunosPorMatricula() {
        List<Aluno> alunosOrdenados = this.ordenarPorMatricula();
        for (Aluno alunos : alunosOrdenados) {
            System.out.println(alunos);
        }
    }

    // Métodos para ordenar e exibir lista de alunos com base na idade
    public List<Aluno> ordenarPorIdade() {
        List<Aluno> alunosOrdenadosPorIdade = new ArrayList<>(this.getAlunos());
        alunosOrdenadosPorIdade.sort(new AlunoPorIdadeComparator());
        return alunosOrdenadosPorIdade;
    }

    public void exibirAlunosPorIdade() {
        List<Aluno> alunosOrdenados = this.ordenarPorIdade();
        for (Aluno alunos : alunosOrdenados) {
            System.out.println(alunos);
        }
    }

    // Métodos para ordenar e exibir lista de alunos com base na média de notas
    public List<Aluno> ordenarPorMediaNotas() {
        List<Aluno> alunosOrdenadosPorMediaNotas = new ArrayList<>(this.getAlunos());
        alunosOrdenadosPorMediaNotas.sort(new AlunoPorMediaNotasComparator());
        return alunosOrdenadosPorMediaNotas;
    }

    public void exibirAlunosPorMediaNotas() {
        List<Aluno> alunosOrdenados = this.ordenarPorMediaNotas();
        for (Aluno alunos : alunosOrdenados) {
            System.out.println(alunos);
        }
    }

    // Métodos para ordenar e exibir lista de alunos por nome em ordem alfabética
    public List<Aluno> ordenarPorNome() {
        List<Aluno> alunosOrdenadosPorNome = new ArrayList<>(this.getAlunos());
        alunosOrdenadosPorNome.sort(new AlunosPorNomeComparator());
        return alunosOrdenadosPorNome;
    }

    public void exibirAlunosPorNome() {
        List<Aluno> alunosOrdenados = this.ordenarPorNome();
        for (Aluno alunos : alunosOrdenados) {
            System.out.println(alunos);
        }
    }

    // Método para exibir alunos de forma natural
    public void exibirAlunosFormaNatural() {
        for (Aluno aluno : this.getAlunos()) {
            System.out.println(aluno);
        }
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
