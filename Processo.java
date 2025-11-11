import java.io.Serializable;

public class Processo implements Serializable {
    private int numero;
    private Pessoa autor;
    private Pessoa reu;
    private Advogado advogado;
    private Juiz juiz;
    private Resolucao resolucao;

    public Processo(int numero, Pessoa autor, Pessoa reu, Advogado advogado, Juiz juiz) {
        this.numero = numero;
        this.autor = autor;
        this.reu = reu;
        this.advogado = advogado;
        this.juiz = juiz;
    }

    public void setResolucao(Resolucao resolucao) {
        this.resolucao = resolucao;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Processo nº " + numero +
               "\nAutor: " + autor.getNome() +
               "\nRéu: " + reu.getNome() +
               "\nAdvogado: " + advogado.getNome() +
               "\nJuiz: " + juiz.getNome() +
               (resolucao != null ? "\nResolução: " + resolucao : "\nSem resolução ainda.");
    }
}
