public class Juiz extends PessoaFisica {
    private String matricula;

    public Juiz(String nome, String endereco, String cpf, String matricula) {
        super(nome, endereco, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Juiz -> " + super.toString() + ", Matrícula: " + matricula;
    }
}
