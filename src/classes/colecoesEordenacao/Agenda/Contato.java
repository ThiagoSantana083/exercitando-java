package classes.colecoesEordenacao.Agenda;

import java.util.Objects;

public class Contato implements Comparable<Contato>{
    private String nome;
    private long telefone;
    private int idade;
    private String email;

    public Contato(String nome, long telefone, int idade, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return telefone == contato.telefone && Objects.equals(email, contato.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefone, email);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Contato o) {
        return this.nome.compareTo(o.getNome());
    }
}
