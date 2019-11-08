//Luis Pazos

import java.util.Scanner;


public class Prueba2 {
    public static void main(String[] args) {

        String nombreApellido="Luis Pazos";
        int modulos=0;
        int horas=0;

        Scanner reader =new Scanner(System.in);
        System.out.println("Introduce el nombre");
        nombreApellido=reader.nextLine();
        System.out.println("Estudiante " + nombreApellido);

        System.out.println("Introduce nº de módulos");
        modulos=reader.nextInt();
        System.out.println("Tienes " + modulos + " módulos");

        System.out.println("Introduce nº de horas");
        horas=reader.nextInt();
       System.out.println("Estudias " + horas + " horas");

        System.out.println(veredicto(Integer.toString(modulos),Integer.toString(horas)));
    }

    private static String veredicto(String valor1, String valor2) {

        if(valor1.equals(valor2)) {

            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }

        if(Integer.valueOf(valor1)<Integer.valueOf(valor2)) {

            return "Poco tiempo de estudio. Debes dedicar más tiempo.";

        }

        return "Ideal. Trabajs los contenidos en casa.";

    }

}
