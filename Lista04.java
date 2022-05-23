package packageunivers.introducao;
/*Faça um programa que receba um número inteiro e
mostre todos os valores inteiros de 0 até o número
digitado.*/

import java.util.Scanner;

public class Lista04 {
    public static void main(String[] args) {
        int valor;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor");
        valor = scan.nextInt();
        for (int i = 0; i <= valor ; i++) {
            System.out.println(i);
        }
    }
}
