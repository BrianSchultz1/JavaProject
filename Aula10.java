package packageunivers.introducao;

import java.util.Scanner;

/*Faça um programa em Java que receba as horas de início e fim de uma atividade (expressas em horas,
minutos e segundos) e ao final informe o tempo de duração da atividade. Dica: transforme as horas de início
e fim em segundos, realize a subtração e em seguida volte a transformar em horas, minutos e segundos.
*/
public class Aula10 {
    public static void main(String[] args) {
        int horasInicio, horasFim, hora, minutos, segundos, tempoDeDuracao, horaTotal;
        Scanner scan = new Scanner(System.in);
        System.out.print("hora de inicio: ");
        horasInicio = scan.nextInt();
        System.out.print("hora fim: ");
        horasFim = scan.nextInt();

        tempoDeDuracao = (horasInicio - horasFim) * 3600;

        horaTotal = tempoDeDuracao / 3600;

        hora = horaTotal;
        minutos = hora / 60;
        segundos = minutos / 3600;

        System.out.println("o tempo de duração da atividade foi de "+hora+" horas "+ minutos+" minutos "+segundos+" segundos ");
    }
}
