package packagehome;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro devdojo";
        String mensagemNaoDoar = "Eu não tenho condições, mas vou ter";
        String resultado;
        if (salario > 5000){
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}


// criando um if e else para guardar um valor de uma variável