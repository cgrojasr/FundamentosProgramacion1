package Semana3;

import java.util.Scanner;

public class Ejercicio1 {
//    Definir el subprograma que tenga como datos de entrada el sueldo bruto mensual y la utilidad que recibe una persona durante un año,
//    se conoce que la persona percibe 14 sueldos al año. El programa debe determinar el impuesto a la renta que debe pagar por concepto de quinta categoría.
//    Para este problema considerar como dato el monto de la Unidad Impositiva Tributaria (UIT) de S/. 3,600.00 para el ejercicio fiscal 2015.
//    El monto del impuesto se calcula de la siguiente forma:
//    El sueldo bruto mensual se multiplica por la cantidad de sueldos que percibe la persona al año.
//    A este cálculo se le debe añadir el monto percibido por concepto de utilidades. Al resultado obtenido previamente se le debe restar la
//    denominada deducción legal que consiste de siete (7) UIT, el impuesto es el 21% del resultado obtenido.
//    Debe tener en cuenta que el resultado no puede ser negativo. Por lo que si la persona gana menos que el deducible, el impuesto será cero.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el sueldo mensual: ");
        double sueldo_mensual = scanner.nextDouble();
        System.out.println("Ingresa la utilidad anual: ");
        double utilidad = scanner.nextDouble();

        double ingreso_anual = calcular_ingresos(sueldo_mensual, utilidad);
        double impuesto = calcular_impuesto(ingreso_anual);

        System.out.println("El impuesto a pagar es: " + impuesto);
    }

    static double calcular_ingresos(double sueldo_mensual, double utilidad){
        double ingreso_anual = sueldo_mensual*14+utilidad;
        return ingreso_anual;
    }

    static  double calcular_impuesto(double ingreso_anual){
        double UIT = 3600;
        double impuesto = (ingreso_anual - 7*UIT) * 0.21;
        if(impuesto<=0) {
            impuesto = 0;
        }
        return  impuesto;
    }
}
