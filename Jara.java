import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Jara implements Serializable {
    private static final String FILE_NAME = "dados.dat";
    private List<Processo> processos;

    public Jara() {
        this.processos = carregarDados();
    }

    public void adicionarProcesso(Processo processo) {
        processos.add(processo);
        salvarDados();
    }

    public void listarProcessos() {
        if (processos.isEmpty()) {
            System.out.println("Nenhum processo cadastrado.");
        } else {
            for (Processo p : processos) {
                System.out.println("----------------------------");
                System.out.println(p);
            }
        }
    }

    private void salvarDados() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(processos);
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private List<Processo> carregarDados() {
        File arquivo = new File(FILE_NAME);
        if (!arquivo.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Processo>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
