package packageunivers.introducao;

/*Faça um programa que receba um número n, calcule e informe o fatorial de n.*/

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int fatorial, n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor para calcular seu fatorial: ");
        n = scan.nextInt();

        for (fatorial = 1; n >= 1; n--) {
            fatorial = fatorial * n;
        }
        System.out.println(fatorial);
    }
}