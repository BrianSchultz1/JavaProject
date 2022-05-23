package packageunivers.introducao;

import java.util.Scanner;

/*Faça um programa que receba os dados coletados numa
pesquisa feita para saber o gosto dos frequentadores de um
cinema. Foi perguntado às pessoas:
- A idade
- O sexo
- A preferência entre os gêneros: Comédia, terror ou ação.
A entrada de dados termina quando for digitado -1 para a idade
da pessoa. Ao final o programa deve informar:
a) Qual a média de idade das pessoas que preferem filmes de terror
b) Qual o percentual de homens que prefere filmes de ação.
c) Mais homens ou mais mulheres preferem os filmes de comédia.
d) Em que faixa etária estão os frequentadores do referido cinema.*/

public class PesquisaCinema {
    public static void main(String[] args) {
        int idadePessoas, numeroDePessoas, mediaIdade;
        char sexo = 'M' ;
        int genero;
        int acao, comedia, terror;

        Scanner scanidade = new Scanner(System.in);
        Scanner scansexo = new Scanner(System.in);
        Scanner scangenero = new Scanner(System.in);
        Scanner scannumerodepessoas = new Scanner(System.in);

        System.out.println("Digiete o numero de pessoas: ");
        numeroDePessoas = scannumerodepessoas.nextInt();
        System.out.println("Digite idade das pessoas: ");
        idadePessoas = scanidade.nextInt();
        idadePessoas = scanidade.nextInt();
        idadePessoas = scanidade.nextInt();
        System.out.println("Digite sexo das pessoas: ");
        sexo = scansexo.next().charAt(0);
        sexo = scansexo.next().charAt(0);
        sexo = scansexo.next().charAt(0);
        System.out.println("Digite seu genero preferido: ");
        genero = scangenero.nextInt();
        genero = scangenero.nextInt();
        genero = scangenero.nextInt();

        mediaIdade = idadePessoas / numeroDePessoas;

        System.out.println("média de idade das pessoas que preferem filmes de terror é: " +idadePessoas);
        System.out.println("percentual de homens que prefere filmes de ação é: ");
        System.out.println("Mais homens ou mais mulheres preferem os filmes de comédia: ");
        System.out.println("faixa etária estão os frequentadores do referido cinema é: "+mediaIdade);

    }
}
