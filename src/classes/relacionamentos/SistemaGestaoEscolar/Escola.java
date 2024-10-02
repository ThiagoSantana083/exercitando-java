package classes.relacionamentos.SistemaGestaoEscolar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Escola {
    String nomeEscola;
    List<Turma> listaDeTurmasDaEscola;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        this.listaDeTurmasDaEscola = new ArrayList<>();
    }

    // Método para adicionar turma na escola
    public void adicionaTurma(Turma turma) {
        this.getListaDeTurmasDaEscola().add(turma);
    }

    // Método para remover alguma turma da escola
    public void removerTurmaDaEscola(Turma turma) {
        List<Turma> turmasParaSeremRemovidas = new ArrayList<>();
        if (!this.getListaDeTurmasDaEscola().isEmpty()) {
            for (Turma turmasRemover : getListaDeTurmasDaEscola()) {
                if (turmasRemover.equals(turma)) {
                    turmasParaSeremRemovidas.add(turmasRemover);
                }
            }
            this.getListaDeTurmasDaEscola().removeAll(turmasParaSeremRemovidas);
        } else {
            System.out.println("Não é possível remover a turma porque não tem nenhuma turma cadastrada na escola");
        }
    }

    // Método para ordenar as turmas pelo nome em ordem alfabética
    public List<Turma> ordenarTurmasPorNome() {
        List<Turma> listaDeTurmasOrdenados = new ArrayList<>(this.getListaDeTurmasDaEscola());
        Collections.sort(listaDeTurmasOrdenados);
        return listaDeTurmasOrdenados;
    }

    // Método para exibir as turmas da escola criados em ordem alfabética e mostrando os alunos com base no nome
    public void exibirTurmasDaEscolaEAlunosOrdenadosPorNome() {
        List<Turma> turmasOrdenadas = this.ordenarTurmasPorNome();
        for (Turma turmas : turmasOrdenadas) {
            List<Aluno> alunosDeCadaTurma = turmas.getListaDeAlunos();
            alunosDeCadaTurma.sort(new AlunoPorNomeComparator());

            System.out.println("Turma: " + turmas.getNomeDaTurma());

            for (Aluno aluno : alunosDeCadaTurma) {
                System.out.println("Nome do Aluno(a): " + aluno.getNome()
                        + ", idade do aluno(a): " + aluno.getIdade() + " e nota final do aluno(a): " + aluno.getNotaFinal());
            }
            System.out.println();
        }
    }

    // Método para exibir as turmas da escola criados em ordem alfabética e mostrando os alunos com base na idade
    public void exibirTurmasDaEscolaEAlunosOrdenadosPorIdade() {
        List<Turma> turmasOrdenadas = this.ordenarTurmasPorNome();
        for (Turma turmas : turmasOrdenadas) {
            List<Aluno> alunosDeCadaTurma = turmas.getListaDeAlunos();
            alunosDeCadaTurma.sort(new AlunoPorIdadeComparator());

            System.out.println("Turma: " + turmas.getNomeDaTurma());

            for (Aluno aluno : alunosDeCadaTurma) {
                System.out.println("Nome do Aluno(a): " + aluno.getNome()
                        + ", idade do aluno(a): " + aluno.getIdade() + " e nota final do aluno(a): " + aluno.getNotaFinal());
            }
            System.out.println();
        }
    }

    // Método para exibir as turmas da escola criados em ordem alfabética e mostrando os alunos com base na idade
    public void exibirTurmasDaEscolaEAlunosOrdenadosPorNotaFinal() {
        List<Turma> turmasOrdenadas = this.ordenarTurmasPorNome();
        for (Turma turmas : turmasOrdenadas) {
            List<Aluno> alunosDeCadaTurma = turmas.getListaDeAlunos();
            Collections.sort(alunosDeCadaTurma);

            System.out.println("Turma: " + turmas.getNomeDaTurma());

            for (Aluno aluno : alunosDeCadaTurma) {
                System.out.println("Nome do Aluno(a): " + aluno.getNome()
                        + ", idade do aluno(a): " + aluno.getIdade() + " e nota final do aluno(a): " + aluno.getNotaFinal());
            }
            System.out.println();
        }
    }

    // Método para buscar um aluno específico na escola e exibir seus dados
    public void mostrarDadosAlunoComBaseNoNome(String nomeDoAluno) {
        if (!this.getListaDeTurmasDaEscola().isEmpty()) {
            for (Turma turmasDisponiveis : this.getListaDeTurmasDaEscola()) {
                for (Aluno aluno : turmasDisponiveis.getListaDeAlunos()) {
                    if (aluno.getNome().equalsIgnoreCase(nomeDoAluno)) {
                        System.out.println("Aluno(a) encontrado! : " + " Nome do aluno(a): " + aluno.getNome() + ", " +
                                "idade " +
                                "do aluno(a): " + aluno.getIdade() + ", nota final do aluno(a): " + aluno.getNotaFinal());
                    }
                }
            }
        } else {
            System.out.println("Não existe turma cadastrada na escola no momento...");
        }
    }


    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public List<Turma> getListaDeTurmasDaEscola() {
        return listaDeTurmasDaEscola;
    }

    public void setListaDeTurmasDaEscola(List<Turma> listaDeTurmasDaEscola) {
        this.listaDeTurmasDaEscola = listaDeTurmasDaEscola;
    }
}
