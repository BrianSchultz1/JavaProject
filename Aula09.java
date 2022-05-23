package packageunivers.introducao;

import java.util.Scanner;
/*Faça um programa em Java que leia a quantidade de fitas que uma locadora de vídeo possui e o valor que
ela cobra por cada aluguel, mostrando as informações pedidas a seguir:
- Sabendo que um terço das fitas são alugadas por mês, exiba o faturamento anual da
locadora;
- Quando o cliente atrasa a entrega, é cobrada multa de 10% sobre o valor do aluguel.
- Sabendo que um décimo das fitas alugadas no mês são devolvidas com atraso, calcule o
valor ganho com multas por mês;
-Sabendo que ainda 2% de fitas se estragam ao longo do ano, e um décimo do total é
comprado para reposição, exiba a quantidade de fitas que a locadora terá no final do ano.
*/
public class Aula09 {
    public static void main(String[] args) {
        int quantidadeDeFitasTotal;
        int quantidadeDeFitasLocadas;
        int quantidadeDeFitasMulta;
        int valorAluguel;
        int faturamento;
        double multa;
        int quantidadeDeFitasEstragam;
        int quantidadeDefitasFinal;


        Scanner scan = new Scanner(System.in);
        System.out.print("quantidades de fitas: ");
        quantidadeDeFitasTotal = scan.nextInt();
        System.out.print("valor do aluguel: ");
        valorAluguel = scan.nextInt();
        faturamento = (valorAluguel * 12) * valorAluguel;
        quantidadeDeFitasLocadas = quantidadeDeFitasTotal /3;
        quantidadeDeFitasMulta = quantidadeDeFitasLocadas/10;
        multa = (valorAluguel * 0.10) * quantidadeDeFitasMulta;
        quantidadeDeFitasEstragam = (int) (quantidadeDeFitasTotal * 0.02);
        quantidadeDefitasFinal = quantidadeDeFitasTotal - (quantidadeDeFitasEstragam + (quantidadeDeFitasTotal / 10));
        System.out.println("valor anual é: "+faturamento);
        System.out.println("o ganho com multas por mês é: "+multa);
        System.out.println("a quantidade de fitas no final do ano é  "+quantidadeDefitasFinal);
    }
}
