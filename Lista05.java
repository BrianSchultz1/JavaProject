package packageunivers.introducao;

/*Faça um programa que receba um número e informe se
é ou não um número primo.*/

import java.util.Scanner;

public class Lista05 {
    public static void main(String[] args) {
        int numero;
        int cont = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número válido: ");
        numero = scan.nextInt();


        for (int i = 1; i <= numero; i++) {
            cont++;

        }
        if (cont == 2) {
            System.out.println("o numero " + numero + " é primo");

        }   else {
            System.out.println("não é primo");
        }
    }
}
