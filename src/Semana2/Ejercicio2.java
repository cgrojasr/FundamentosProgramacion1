package Semana2;

import java.util.Scanner;

public class Ejercicio2 {
    //Que determine el Área de un circulo
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double rad;
        double pi = Math.PI;
        double area;

        System.out.println("Ingresa el radio de la circunferencia");
        rad=scanner.nextDouble();
        area = Math.pow(rad, 2)*pi;
        System.out.println("El área de la circunferencia es: " + area);
    }
}
