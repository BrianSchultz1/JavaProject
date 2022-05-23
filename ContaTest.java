package packageunivers.javacore.Bintroducaoclasses.dominio.test;

import packageunivers.javacore.Bintroducaoclasses.dominio.dominio.Conta;

public class ContaTest {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.dono = "Duke";
        minhaConta.saldo = 1000;

        if (minhaConta.saca1(550)) {
            System.out.println("consegui sacar");
        } else {
            System.out.println("não consegui sacar");
        }

        minhaConta.saca(200);

        minhaConta.deposita(500);




        System.out.println("Saldo atual: " + minhaConta.saldo);
    }
}

