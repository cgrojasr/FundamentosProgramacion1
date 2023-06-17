package Semana4;

import java.util.Scanner;

public class Ejercicio6 {
//    El Hospital “Mi Buen Jesús”, lo contrata para que implemente un programa informático, que permita al personal
//    médico calcular en cuantos días un paciente puede eliminar de su cuerpo la medicina ingerida.
//    El caso específico es el siguiente: Un paciente recibe una cantidad de una medicina. Cada día el 20% de la
//    cantidad de medicina presente en su cuerpo es eliminada. El programa debe calcular:
//    a.	Cuanta medicina queda en el cuerpo después del día D
//    b.	Cuantos días tardará el cuerpo en eliminar el X% o más de la cantidad original de la medicina que tenía en el cuerpo.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de medicina: ");
        double cantidad_medicina = scanner.nextDouble();
        System.out.println("Ingresar la cantidad de días que pasará");
        int cantidad_dias = scanner.nextInt();

        double resto_medicina = RestoMedicina(cantidad_medicina, cantidad_dias);
        System.out.println("En " + cantidad_dias + " días quedara " + resto_medicina + " unidades");

        System.out.println("Ingresar el % de medicina a eliminar");
        double porcentaje_esperado = scanner.nextDouble();

        double cantidad_dias_eliminado = EliminadoDias(porcentaje_esperado/100);
        System.out.println("El porcentaje de  " + porcentaje_esperado + " se cumplira en " + cantidad_dias_eliminado + " días");
    }

    static double RestoMedicina(double cantidad_medicina, int cantidad_dias){
        double porcentaje = 0.2;
        for(int i=0; i<cantidad_dias; i++){
            cantidad_medicina = cantidad_medicina * (1-porcentaje);
        }
        return  cantidad_medicina;
    }

    static int EliminadoDias(double porcentaje_esperado){
        double porcentaje = 1;
        int cantidad_dias = 0;
        while(porcentaje > porcentaje_esperado){
            porcentaje = porcentaje * 0.8;
            cantidad_dias++;
        }
        return cantidad_dias;
    }
}
