package packagehome;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero02+ numero01);

        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;

        System.out.println("isDezMaiorVinte "+isDezMaiorVinte);
        System.out.println("isDezMenorVinte "+isDezMenorVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " +isPlaystationCincoCompravel);


        double bonus = 1800;
        /* bonus = bonus+ 1000; */
        bonus += 1000;
        bonus++;
        System.out.println(bonus);



    }

}
