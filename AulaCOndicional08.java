package packageunivers.introducao;
/*Escreva um programa para ler 2 valores inteiros e uma das seguintes operações a serem
executadas (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
Calcular e escrever o resultado dessa operação sobre os dois valores lidos.
Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4.*/

import java.util.Scanner;

public class AulaCOndicional08 {
    public static void main(String[] args) {
        int valor1, valor2 = 0, resposta, operacao;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois valores  e depois siga a opcao");
        System.out.println("valor 1: ");
        valor1 = scan.nextInt();
        System.out.println("valor 2: ");
        valor2 = scan.nextInt();
        System.out.println("digite [1] para adicao, [2] subtracao, [3] mutiplicacao,[4] divisao");
        operacao = scan.nextInt();

        if (operacao == 1){
            resposta = valor1+valor2;
            System.out.println("soma entre valor1 e valor2 = "+resposta);
        } else if (operacao == 2){
            resposta = valor1-valor2;
            System.out.println("subtracao entre valor1 e valor2 = "+resposta);
        } else if (operacao == 3 ){
            resposta = valor1*valor2;
            System.out.println("multiplicacao entre valor1 e valor2 = "+resposta);
        } else if (operacao == 4){
            resposta = valor1/valor2;
            System.out.println("multiplicacao entre valor1 e valor2 = "+resposta);
        }

    }
}
