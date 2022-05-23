package packageunivers.introducao;
/* Faça um programa em Java que receba a idade de uma pessoa em anos, meses e dias e informe quantos
dias aproximadamente ele já viveu.*/

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anos;
        int meses;
        int dias;
        int diasVivido;
        System.out.println("Digite seu ano ");
        anos = scan.nextInt();
        System.out.println("Digite seu mes ");
        meses = scan.nextInt();
        System.out.println("Digite swu dia ");
        dias = scan.nextInt();
        diasVivido = (anos * 360 + meses * 30) + dias;
        System.out.println("você viveu quantos "+diasVivido);
    }
}
