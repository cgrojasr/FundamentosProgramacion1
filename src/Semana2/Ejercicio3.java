package Semana2;

import java.util.Scanner;

public class Ejercicio3 {
//    Se requiere un programa que calcule la cantidad de billetes de
//    20 soles que se necesitan para entregar una cantidad de dinero
//    en billetes de esa denominación
//
//    Por ejemplo si envío 350 soles me dirá que se necesitan 17
//    billetes (la parte decimal se ignora)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monto, cant_billetes;

        System.out.println("Ingrese el monto a disponer");
        monto = scanner.nextInt();
        cant_billetes = monto / 20;
        System.out.println("La cantidad de billetes de 20 son: " + cant_billetes);
    }
}
