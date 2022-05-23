package packagehome;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        byte dia = 9;
        switch (dia) {
            case 1:
                System.out.println("domingo, sunday, domingo ");
                break;
            case 2:
                System.out.println("segunda, monday, lunes ");
                break;
            case 3:
                System.out.println("terça, tuesday, martes");
                break;
            case 4:
                System.out.println("quarta, wednesday, miercoles");
                break;
            case 5:
                System.out.println("quinta, thursday, jueves");
                break;
            case 6:
                System.out.println("sexta, friday, viernes");
                break;
            case 7:
                System.out.println("sábado, saturday, sabado");
                break;
            default:
                System.out.println("opção inválida");

                String sexo = "F";
                switch (sexo) {
                    case "M":
                        System.out.println("Masculino");
                        break;
                    case "F":
                        System.out.println("Feminio");
                        break;
                    default:
                        System.out.println("inválido");
                        break;
                }
        }
    }
}



/*
    byte dia = 5;
        if ( dia == 1){
                System.out.println("domingo");
                } else if (dia == 2){
                System.out.println("segunda");
                } else if (dia == 3){
                System.out.println("terça");
                } else if (dia == 4){
                System.out.println("quarta");
                } else if(dia == 5){
                System.out.println("quinta");
                } else if (dia == 6){
                System.out.println("sexta");
                } else if (dia == 7){
                System.out.println("sabado");
                }
 */