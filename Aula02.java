package packageunivers.introducao;

/* Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o garçom. Faça um programa em Java que leia o valor gasto com despesas realizadas em um restaurante e mostre o valor total com a gorjeta. */

import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        int conta, comissao;
        Scanner scan = new Scanner(System.in);
        System.out.println("valor gasto: ");
        conta = scan.nextInt();
        comissao = conta / 10;
        System.out.println("valor comissao = "+comissao);
        System.out.println("valor total "+(conta + comissao));
    }
}
