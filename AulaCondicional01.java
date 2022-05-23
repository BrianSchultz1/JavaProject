package packageunivers.introducao;
/*Escreva um algoritmo em Java para ler o ano de nascimento de uma pessoa e escrever uma
mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês
em que ela nasceu).*/

import java.util.Scanner;

public class AulaCondicional01 {
    public static void main(String[] args) {
        int anoNascimento;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        anoNascimento = scan.nextInt();


        if (anoNascimento <= 2003){
            System.out.println("você pode votar");
        } else{
            System.out.println("você não pode votar");
        }
    }
}
