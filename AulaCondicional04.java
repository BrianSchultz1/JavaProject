package packageunivers.introducao;

/*As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se
forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs
compradas, calcule e escreva o valor total da compra.*/

import java.util.Scanner;

public class AulaCondicional04 {
    public static void main(String[] args) {
        double maca, valorTotal;
        Scanner scan = new Scanner(System.in);
        System.out.print("número de maça: ");
        maca = scan.nextInt();

        if (maca >= 12){
             valorTotal = maca * 0.25;
            System.out.println(valorTotal);
        } else if (maca < 12) {
            valorTotal = maca * 0.30;
            System.out.println(valorTotal);
        }
    }
}
