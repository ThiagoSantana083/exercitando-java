package classes.relacionamentos.SistemaGestaoEscolar;

public class Professor extends Pessoa {

    private double salario;
    private String materia;

    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade);
        this.salario = salario;
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + this.getNome() + '\'' +
                ", idade=" + this.getIdade() +
                ", salario=" + salario +
                ", materia='" + materia + '\'' +
                '}';
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
