package packageunivers.introducao;
/*A prefeitura de Contagem abriu uma linha de crédito para os funcionários estatutários. O
valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um programa
que permita entrar com o salário bruto e o valor da prestação, e informar se o empréstimo
pode ou não ser concedido.*/

import java.util.Scanner;

public class AulaCondicional05 {
    public static void main(String[] args) {
        int prestacao, salarioBruto, porcento;
        Scanner scan = new Scanner(System.in);
        System.out.println("Salario bruto: ");
        salarioBruto = scan.nextInt();
        System.out.println("prestação: ");
        prestacao = scan.nextInt();

        porcento = salarioBruto * (30/100);

        if (prestacao <= porcento){
            System.out.println("emprestimo concedio");
        } else {
            System.out.println("nao concedido");
        }
    }
}
