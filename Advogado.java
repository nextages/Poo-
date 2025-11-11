public class Advogado extends PessoaFisica {
    private String oab;

    public Advogado(String nome, String endereco, String cpf, String oab) {
        super(nome, endereco, cpf);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    @Override
    public String toString() {
        return "Advogado -> " + super.toString() + ", OAB: " + oab;
    }
}
