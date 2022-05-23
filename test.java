package packagehome;

public class test {
    public static void main(String[] args) {
        double janeiro = 15.000;
        double fevereiro = 23.000;
        double marco = 17.000;

        double gastoTotal = janeiro + fevereiro + marco;

        System.out.println(gastoTotal);

        double mediaTrimestral = gastoTotal/3;
        System.out.println(mediaTrimestral);
    }
}
