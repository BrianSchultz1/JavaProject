package packageunivers.introducao;
/*faça um programa em Java que simule um caixa eletrônico para saque. O algoritmo deve receber um valor
monetário (o valor deve ser recebido como um valor inteiro) e informar quantas notas de R$50,00, R$10,00,
R$5,00 e R$1,00 devem ser entregues ao usuário usando o mínimo de notas possível.*/

import java.util.Scanner;

public class Aula08 {
    public static void main(String[] args) {
        int nota1 = 1;
        int nota2 = 5;
        int nota3 = 10;
        int nota4 = 50;
        int caixaEletronico;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        caixaEletronico = scan.nextInt();

        caixaEletronico = (nota1+nota2+nota3+nota4/caixaEletronico);
        System.out.println("entregus "+caixaEletronico);


    }
}
