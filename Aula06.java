package packageunivers.introducao;
/*Faça um programa em Java que receba 3 notas de um aluno e seus respectivos pesos, calcule e informe a
média ponderada.*/

import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;
        int p1;
        int p2;
        int p3;
        float mediaPonderada;
        Scanner scan = new Scanner(System.in);
        System.out.println("nota1 = ");
        nota1 = scan.nextInt();
        System.out.println("nota2 = ");
        nota2 = scan.nextInt();
        System.out.println("nota3 = ");
        nota3 = scan.nextInt();
        p1 = scan.nextInt();
        p2 = scan.nextInt();
        p3 = scan.nextInt();
        mediaPonderada = ((nota1 * p1) + (nota2 * p2) + (nota3 * p3)/3);
        System.out.println("media ponderada = "+mediaPonderada);
        System.out.println("media ponderada = "+mediaPonderada);

    }
}
