package packageunivers.introducao;

import java.util.Scanner;

//Faça um programa em Java que solicite a hora atual (expressa em horas, minutos e segundos) ao usuário e informe quantos segundos do dia já passaram.

public class Aula01 {
    public static void main(String[] args){
        int horas, minutos, segundos, totalSegundos;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as horas ");
        horas = scan.nextInt();
        System.out.println("Digite os minutos");
        minutos = scan.nextInt();
        System.out.println("Digite os segundos ");
        segundos = scan.nextInt();
        totalSegundos = (horas * 3600) + (minutos * 60) +segundos;
        System.out.println("total de segundos igual a "+totalSegundos);
    }
}
