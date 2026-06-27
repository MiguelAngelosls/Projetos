import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opc;
        double saldo = 0;

        do {

            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            System.out.print("Digite qual opção deseja proseguir: ");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    if (saldo == 0) {
                        System.out.println("Seu saldo é de " + saldo);
                    } else if (saldo > 0) {
                        System.out.println("Seu saldo é de " + saldo);
                    }
                    break;

                case 2:
                    System.out.print("Digite a quantia que deseja depositar: ");
                    saldo += scan.nextDouble();
                    System.out.println("Quantia depositada com sucesso! saldo atualizado.");
                    break;

                case 3:

                    System.out.print("Digite quanto voce quer retirar: ");
                    double qtd = scan.nextDouble();

                    if (saldo == 0) {
                        System.out.println("Nao existe quantia para retirar!");
                    } else if (saldo < qtd) {
                        System.out.println("saldo insuficiente!");
                    } else if (saldo >= qtd) {
                        System.out.println("Saldo sacado com sucesso!");
                        saldo -= qtd;
                    }
                    break;
                case 4:
                    System.out.println("Saindo do banco");
                    break;

                default:
                    System.out.println("Opcao invalida! Tente novamente");
                    
            }
        } while (opc != 4);

    }
}