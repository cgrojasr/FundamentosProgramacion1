package Semana2;

import java.util.Scanner;

public class Ejercicio4 {
//    Desarrollar un programa que permita crear el texto
//  "Soy <<nombre>> y mi nota es <<nota>>"
//    Por ejemplo si el nombre es Carlos y la nota es 17 el mensaje será
//  "Soy Carlos y mi nota es 17"
//    Tener en cuenta que el texto debe ser exacto para que el test pase

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int nota;

        System.out.println("Ingresar nombre del alumno");
        nombre=scanner.nextLine();
        System.out.println("Ingresar nota del alumno");
        nota=scanner.nextInt();

        System.out.println("Soy "+ nombre + " y mi nota es "+nota);
    }
}
