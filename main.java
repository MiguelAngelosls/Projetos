import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12");
       
       System.out.print("Digite o numero do mes: ");
       int mes = scan.nextInt();

       switch (mes) {
        case 1: 
            System.out.println("Janeiro: possui 31 dias");
            break;
        case 2: 
            System.out.println("Fevereiro: possui 28 dias");
            break;
        case 3:
            System.out.println("Março: possui 31 dias"); 
            break;
        case 4: 
            System.out.println("Abril: possui 30 dias");
            break;
        case 5: 
            System.out.println("Maio: possui 31 dias");
            break;
        case 6: 
            System.out.println("Junho: possui 30 dias");
            break;
        case 7:
            System.out.println("Julho: possui 31 dias");
            break; 
        case 8: 
            System.out.println("Agosto: possui 31 dias");
        break;
        case 9:
            System.out.println("Setembro: possui 30 dias");
            break;
        case 10:
            System.out.println("Outubro: possui 31 dias");
            break;
        case 11:
            System.out.println("Novembro: possui 30 dias");
            break;
        case 12:
            System.out.println("Dezembro: possui 31 dias");
            break;
       
        default:
            System.out.println("Opção invalida, escolha outro mes");
            break;
       }

    }
}