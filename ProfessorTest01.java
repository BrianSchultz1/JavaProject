package packageunivers.javacore.Aintroducaoclasses.test;

import packageunivers.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Mestre Kami";
        prof.idade = 27;
        prof.sexo = 'M';

        System.out.println(prof.nome + " idade: " + prof.idade + " sexo: " + prof.sexo);
    }
}
