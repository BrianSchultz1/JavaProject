package packageunivers.introducao;

import java.util.Scanner;
public class Aula03 {
    public static void main(String[] args) {
        int soma1, soma2, result;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        soma1 = ler.nextInt();
        System.out.print("Digite um número: ");
        soma2 = ler.nextInt();
        result = soma1 + soma2;
        System.out.println("Soma = " +result);
    }
}

/* Outros métodos para realizar entrada de dados:
nextByte()
nextShort()
nextInt()
nextLong()
nextFloat()
nextDouble()
nextBoolean()
nextLine()
next()
next().charAt(0)
*/