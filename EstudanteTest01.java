package packageunivers.javacore.Aintroducaoclasses.test;

import packageunivers.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante student = new Estudante();
        student.nome = "Brian";
        student.idade = 18;
        student.sexo = 'M';

        System.out.println(student.nome);
        System.out.println(student.idade);
        System.out.println(student.sexo);
    }
}
