package classes.relacionamentos.SistemaGestaoEscolar;

import java.util.Objects;

public class Aluno extends Pessoa implements Comparable<Aluno>{

    private int numeroDeMatricula;
    private double notaFinal;


    public Aluno(String nome, int idade, int numeroDeMatricula, double notaFinal) {
        super(nome, idade);
        this.numeroDeMatricula = numeroDeMatricula;
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + this.getNome() + '\'' +
                ", idade=" + this.getIdade() +
                ", numeroDeMatricula=" + numeroDeMatricula +
                ", notaFinal=" + notaFinal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aluno aluno = (Aluno) o;
        return numeroDeMatricula == aluno.numeroDeMatricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroDeMatricula);
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public int compareTo(Aluno o) {
        return Double.compare(this.getNotaFinal(), o.getNotaFinal());
    }
}
