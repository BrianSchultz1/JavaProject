package packageunivers.javacore.Bintroducaoclasses.dominio.test;

import packageunivers.javacore.Bintroducaoclasses.dominio.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calcu = new Calculadora();
        double result = calcu.divideDoisNumeros(20, 2);

        System.out.println(result);
    }
}
