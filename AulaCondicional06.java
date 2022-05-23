package packageunivers.introducao;
/*Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino
2:masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal,
utilizando as seguintes fórmulas:
– para homens : (72.7 * h) – 58
– para mulheres : (62.1 * h) – 44.7
Observação: Altura = h (na fórmula acima).*/
import java.util.Scanner;

public class AulaCondicional06 {
    public static void main(String[] args) {
        Float altura;
        Float peso;
        double resultado = 0;
        char sexo;
        Scanner den = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        altura = den.nextFloat();
        System.out.println("Digite o seu peso: ");
        peso = den.nextFloat();
        System.out.println("Digite o seu sexo[M] ou [F]: ");
        sexo = den.next().charAt(0);


        if (sexo == 'M') {
            resultado = ((72.7*altura) - 58);
        } else if (sexo == 'F'){
            resultado = ((62.1*altura) - 44.7);
        }
        System.out.println("o seu peso ideal é :"+resultado);

    }

}
