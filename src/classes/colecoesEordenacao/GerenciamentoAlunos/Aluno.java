package classes.colecoesEordenacao.GerenciamentoAlunos;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private int idade;
    private float mediaNotas;
    private int numeroMatricula;


    public Aluno(String nome, int idade, float mediaNotas, int numeroMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.mediaNotas = mediaNotas;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(float mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", mediaNotas=" + mediaNotas +
                ", numeroMatricula=" + numeroMatricula +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return numeroMatricula == aluno.numeroMatricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroMatricula);
    }

    @Override
    public int compareTo(Aluno o) {
        return this.getNumeroMatricula() - o.getNumeroMatricula();
    }
}
