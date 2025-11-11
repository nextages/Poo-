import java.io.Serializable;

public abstract class Pessoa implements Serializable {
    protected String nome;
    protected String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Endereço: " + endereco;
    }
}
