package classes.relacionamentos.SistemaGestaoEscolar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Turma implements Comparable<Turma> {
    private String nomeDaTurma;
    private List<Aluno> listaDeAlunos;
    private Professor professor;

    public Turma(String nomeDaTurma, String nomeProfessor, int idadeProfessor, double salarioProfessor,
                 String materiaProfessor) {
        this.nomeDaTurma = nomeDaTurma;
        this.listaDeAlunos = new ArrayList<>();
        this.professor = new Professor(nomeProfessor, idadeProfessor, salarioProfessor, materiaProfessor);
    }
    // Sobrescrita de construtor
    public Turma(String nomeDaTurma, Professor professor) {
        this.nomeDaTurma = nomeDaTurma;
        this.listaDeAlunos = new ArrayList<>();
        this.professor = professor;
    }

    // Método para adicionar aluno na turma
    public void adicionarAlunoNaTurma(Aluno aluno) {
        this.getListaDeAlunos().add(aluno);
    }

    // Método para remover aluno da turma
    public void removerAlunoDaTurma(Aluno aluno) {
        List<Aluno> alunosRemover = new ArrayList<>();
        if (!this.getListaDeAlunos().isEmpty()) {
            for (Aluno alunoParaRemover : this.getListaDeAlunos()) {
                if (alunoParaRemover.equals(aluno)) {
                    alunosRemover.add(alunoParaRemover);
                }
            }
            this.getListaDeAlunos().removeAll(alunosRemover);
        } else {
            System.out.println("Não é possível remover aluno já que não tem alunos nessa turma");
        }
    }

    public void exibirAlunos() {
        for (Aluno aluno : getListaDeAlunos()) {
            System.out.println(aluno);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return Objects.equals(nomeDaTurma, turma.nomeDaTurma) && Objects.equals(listaDeAlunos, turma.listaDeAlunos) && Objects.equals(professor, turma.professor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDaTurma, listaDeAlunos, professor);
    }

    public String getNomeDaTurma() {
        return nomeDaTurma;
    }

    public void setNomeDaTurma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nomeDaTurma='" + nomeDaTurma + '\'' +
                ", listaDeAlunos=" + listaDeAlunos +
                ", professor=" + professor +
                '}';
    }

    @Override
    public int compareTo(Turma o) {
        return this.getNomeDaTurma().compareToIgnoreCase(o.getNomeDaTurma());
    }
}
