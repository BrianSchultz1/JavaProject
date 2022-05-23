package packageunivers.introducao;
/*Escreva um algoritmo em Java para determinar se um número A é divisível por um outro
número B. Esses valores devem ser fornecidos pelo usuário.*/
import java.util.Scanner;

public class AulaCondicional02 {
    public static void main(String[] args) {
        int numeroA, numeroB, resto;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número A: ");
        numeroA = scan.nextInt();
        System.out.println("Digite o número B: ");
        numeroB = scan.nextInt();

        resto = numeroA % numeroB;

        if (resto == 0){
            System.out.println("é divisível");
        } else {
            System.out.println("não é divisível");
        }
    }
}
