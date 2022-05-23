package packageunivers.introducao;
/* Faça um programa em Java que leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcular
e imprimir quantos salários mínimos ela ganha. */

import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        int valorSalarioMinimo = 1200;
        int valorSalarioPessoa;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salario ");
        valorSalarioPessoa = scan.nextInt();
        valorSalarioMinimo = valorSalarioPessoa/1200;
        System.out.println("Você ganha "+valorSalarioMinimo+" salario minimo");


    }
}
