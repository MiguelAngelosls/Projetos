import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas que voce quer convidar: ");
        int nLista = scan.nextInt();

        String[] nomes = new String[nLista];

        int opc;

        do {
            mostrarMenu();
            System.out.print("Digite a opção que deseja prossguir: ");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    addNome(nomes, scan);
                    break;

                case 2:
                    verLista(nomes);
                    break;

                case 3:
                    System.out.println("Saindo do sistema");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (opc != 3);
    }

    public static void mostrarMenu() {

        System.out.println("Escolha uma opção abaixo: ");
        System.out.println("1: adicioar convidaddo!");
        System.out.println("2: Ver lista de convidados");
        System.out.println("3: Sair");

    }

    public static void addNome(String[] nomes, Scanner scan) {

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] == null) {
                System.out.println("Digite o nome do convidado: ");
                scan.nextLine();
                nomes[i] = scan.nextLine();
                System.out.println("Nome adicionado com sucesso!");
                return;
            }
        }
        System.out.println("A lista esta chei!");
    }

    public static void verLista(String[] nomes) {

        System.out.println("Lista de convidados");

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] == null) {
                System.out.println("Posição " + i + " vazia");
            } else {
                System.out.println("Posição " + i + ": " + nomes[i]);
            }
        }

    }
}