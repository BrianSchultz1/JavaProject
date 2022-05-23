package packageunivers.javacore.Bintroducaoclasses.dominio.dominio;

public class Conta {
    double salario;

    public int numero;
    public String dono;
    public double saldo;
    public double lmite;

    public void saca(double quantidade) {

        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    public void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    public boolean saca1 (double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

}
