package packageunivers.introducao;
/*Faça um programa que receba um valor n e em seguida informe o valor de s.
Sabe-se que s=1+1/2+1/3+...+1/n*/

import java.util.Scanner;

public class InformeValor {
    public static void main(String[] args) {
        double n;
        float s = 0;

        Scanner scan = new Scanner(System.in);


        System.out.print("Digite um valor: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            s+= 1.0/i;
        }



        System.out.println("O valor de s é igual a " + s);
    }
}
