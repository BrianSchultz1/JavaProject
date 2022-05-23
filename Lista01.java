package packageunivers.introducao;
/*Faça um programa que leia um número e mostre uma mensagem indicando se este número
é par ou ímpar e se é positivo ou negativo.*/

import java.util.Scanner;

public class Lista01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número");
        numero = scan.nextInt();
        if (numero % 2== 0) {
            System.out.println("o número é par");
        } else {
            System.out.println("número impar");
        }
        if (numero >= 0) {
            System.out.println("o número é positivo");
        } else {
            System.out.println("o número é negativo");
        }
    }
}