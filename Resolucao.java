import java.io.Serializable;

public class Resolucao implements Serializable {
    private String descricao;
    private boolean procedente;

    public Resolucao(String descricao, boolean procedente) {
        this.descricao = descricao;
        this.procedente = procedente;
    }

    @Override
    public String toString() {
        return descricao + " (Resultado: " + (procedente ? "Procedente" : "Improcedente") + ")";
    }
}
