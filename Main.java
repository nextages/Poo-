import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jara jara = new Jara();

        while (true) {
            System.out.println("\n=== Sistema Judicial JARA ===");
            System.out.println("1. Criar processo");
            System.out.println("2. Listar processos");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Número do processo: ");
                    int numero = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome do autor: ");
                    String nomeAutor = sc.nextLine();
                    PessoaFisica autor = new PessoaFisica(nomeAutor, "Endereço Autor", "111.111.111-11");

                    System.out.print("Nome do réu: ");
                    String nomeReu = sc.nextLine();
                    PessoaJuridica reu = new PessoaJuridica(nomeReu, "Endereço Réu", "22.222.222/0001-22");

                    Advogado adv = new Advogado("Dr. Silva", "Rua Central", "333.333.333-33", "OAB123");
                    Juiz juiz = new Juiz("Juiz Souza", "Rua da Justiça", "444.444.444-44", "JZ001");

                    Processo processo = new Processo(numero, autor, reu, adv, juiz);
                    jara.adicionarProcesso(processo);

                    System.out.println("✅ Processo criado e salvo com sucesso!");
                    break;

                case 2:
                    jara.listarProcessos();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
