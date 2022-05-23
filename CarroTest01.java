package packageunivers.javacore.Aintroducaoclasses.test;

import packageunivers.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();

        car1.nome = "Gol";
        car1.modelo = "sport";
        car1.ano = 2022;

        car1 = car2;

        car2.nome = "Mustang";
        car2.modelo = "GT 500";
        car2.ano = 2022;


        System.out.println(car1.nome + " modelo: " + car1.modelo + " ano " + car1.ano);
        System.out.println(car2.nome + " modelo: " + car2.modelo + " ano " + car2.ano);
    }
}
