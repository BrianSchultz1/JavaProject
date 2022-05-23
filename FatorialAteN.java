package packageunivers.introducao;
/*Faça um programa que receba um número n e mostre na tela o fatorial dos números
de 1 até n. Ou seja, se for digitado 3 o programa deve mostrar
o fatorial dos seguintes números: 1, 2, 3.*/

import java.util.Scanner;

public class FatorialAteN {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor para calcular seu fatorial: ");
        n = scan.nextInt();

        int fatorial = n;
        for (int i = n; i > 0; i--) {
                for (int j = i; j > 1; j--) {
                    fatorial *= j - 1;
                }
            System.out.println("fatorial de " + i + " : " + fatorial);
            fatorial = i - 1;
        }
        System.out.println("fatorial de 0 : " + 1);
    }
}
