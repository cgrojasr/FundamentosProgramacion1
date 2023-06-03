package Semana3;

import java.util.Scanner;

public class Ejercicio3 {
//    La universidad está organizando 10 de Talleres de programación. Para incentivar a los alumnos a matricularse, está otorgando descuentos por
//    cantidad de talleres a matricularse por alumno, además descuento por llevar a referidos (son alumnos que dan el nombre del alumno que les recomendó
//    llevar el taller). Hay un descuento por referidos de acuerdo a la tabla, además si lleva 9 o 10 referidos, le hacen un descuento adicional de 20 soles,
//    sobre el importe descontado. Determinar el importe a pagar por la matricula a uno o más talleres. El precio de cada taller es único.
//    El cuadro de descuento por cantidad de talleres y de referidos es la siguiente:
//    Cantidad de
//    Talleres          Descuento
//    2 a 4             5 %
//    5 a 7             10 %
//    8 a 10            15 %
//
//    Cantidad      Descuento
//    de referidos
//    2 a 5         7 %
//    6 a 8         10 %
//    9 a 10        12 % (+20 soles)
//    Todos los descuentos se aplican al precio original.
//    Se le solicita lo siguiente:
//    a. Calculo del descuento por talleres matriculados
//    b. Calculo por descuento por cantidad de referidos.
//    c. Calculo del costo por talleres matriculados
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar la cantidad de talleres a llevar: ");
        int cantidad_talleres = scanner.nextInt();
        System.out.println("Ingresar la cantidad de referidos: ");
        int cantidad_referidos = scanner.nextInt();

        double descuento_talleres = calculo_descuento_talleres(cantidad_talleres);
        double descuento_referidos = calculo_descuento_referidos(cantidad_referidos);

        double precio_taller = 200;

        double descuento_adicional = 0;
        if(cantidad_referidos >= 9 && cantidad_referidos <= 10){
            descuento_adicional = 20;
        }

        double monto_pagar = precio_taller * cantidad_talleres * (1-descuento_talleres) * (1-descuento_referidos) - descuento_adicional;

        System.out.println("El monto a pagar es: " + monto_pagar);

    }

    static double calculo_descuento_talleres(int cantidad_talleres){
        double descuento;
        switch ((cantidad_talleres >= 2 && cantidad_talleres <= 4) ? 1 : (cantidad_talleres >= 5 && cantidad_talleres <= 7) ? 2 : (cantidad_talleres >= 8 && cantidad_talleres <= 10) ? 3 : 0){
            case 1 : descuento = 0.05; break;
            case 2 : descuento = 0.1; break;
            case 3 : descuento = 0.15; break;
            default: descuento = 0; break;
        }
        return descuento;
    }

    static double calculo_descuento_referidos(int cantidad_referidos){
        double descuento;
        switch ((cantidad_referidos >= 2 && cantidad_referidos <= 5) ? 1 : (cantidad_referidos >= 6 && cantidad_referidos <= 8) ? 2 : (cantidad_referidos >= 9 && cantidad_referidos <= 10) ? 3 : 0){
            case 1 : descuento = 0.07; break;
            case 2 : descuento = 0.1; break;
            case 3 : descuento = 0.12; break;
            default: descuento = 0; break;
        }
        return descuento;
    }
}
