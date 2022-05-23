package packageunivers.introducao;
/*Faça um algoritmo em Java que receba a idade de uma pessoa e informe em qual das
categorias se enquadra em relação à obrigatoriedade do voto:*/

import java.util.Scanner;

public class AulaCondicional03 {
    public static void main(String[] args) {
        int idade;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();

        if (idade <= 15){
            System.out.println("Sem permissão para votar");
        } else if (idade >= 16 && idade <= 17) {
            System.out.println("voto facultativo");
        } else if (idade >= 65) {
            System.out.println("voto facultativo");
        } else if (idade >=18 && idade < 65){
            System.out.println("voto obrigatorio");
        }
    }
}
