package packageunivers.introducao;
/*A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa
em Java que receba o enquadramento do professor e a quantidade de horas trabalhadas, calcule
e exiba o salário do professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:*/

import java.util.Scanner;

public class Lista02 {
    public static void main(String[] args) {
        int enquadramento, horasTrabalhadas, nivel1 = 1, nivel2 = 2, nivel3 = 3;
        double salario;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu enquadramento: ");
        enquadramento = scan.nextInt();
        System.out.println("horas trabalhadas: ");
        horasTrabalhadas = scan.nextInt();


        if (enquadramento == nivel1) {
            salario = horasTrabalhadas * 12;
            System.out.println("seu salário é "+salario);
        } else if (enquadramento == nivel2) {
            salario = horasTrabalhadas * 17;
            System.out.println("seu salário é "+salario);
        } else if (enquadramento == nivel3){
            salario = horasTrabalhadas * 25;
            System.out.println(("seu salário é "+salario));
        }
    }
}
