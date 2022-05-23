package packageunivers.introducao;
/*Faça um programa em Java que receba um número inteiro e mostre na tela seus divisores.*/

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        int numeroInteiro;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        numeroInteiro = scan.nextInt();

        for (int i = 1; i < numeroInteiro; i++) {
            if (numeroInteiro % i == 0) {
                System.out.println(i + " é um divisor de " + numeroInteiro);
            }
        }
    }
}