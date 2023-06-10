package Semana4;

import java.util.Scanner;

public class Ejercicio5 {
//    El supermercado UNO está premiando a sus clientes que compran por un monto mayor a 800 soles, el premio consiste
//    en un juego, donde el cliente, extrae de una urna un papel que tiene un numero de varias cifras (el número de
//    cifras es variado), como máximo tiene 9 dígitos.
//    El cliente va a recibir un premio de acuerdo a la cantidad de unos que aparece en el papel.
//            •	Si no hay ningún digito uno, no recibe ningún premio.
//            •	Si hay un digito uno va a recibir el 10% de descuento de la compra realizada.
//            •	Si hay dos dígitos uno va a recibir el 20% de descuento de la compra realizada.
//            •	Si hay tres dígitos uno va a recibir el 30% de descuento de la compra realizada.
//            •	Si hay cuatro dígitos uno va a recibir el 40% de descuento de la compra realizada.
//            •	Y así sucesivamente hasta llegar a los 9 dígitos uno.
//            •	Si la cantidad de dígitos uno es 2 o múltiplo de 2 recibe un descuento adicional de 50 soles.
//    a.	Calcular el descuento total que recibe un cliente
//    b.	Calcular el importe a pagar.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto de compra: ");
        double monto_compra = scanner.nextDouble();
        if(monto_compra >= 800){
            System.out.println("El número generado es: ");
            String numero_generado = generar_numero();
            System.out.println(numero_generado);
            double porcentaje_descuento = calcular_porcentaje_descuento(numero_generado);
            System.out.println("El porcentaje de descuento ganado es: " + porcentaje_descuento);
            System.out.println("El monto a pagar es: " + (monto_compra*(1-porcentaje_descuento)));
        }
        else
            System.out.println("El monto mínimo para la promoción es de 800");
    }

    static String generar_numero(){
        char digito;
        String numero_generado = "";
        for(int i=0; i<9;i++){
            digito = Double.toString(Math.random()*10%10).charAt(0) ; //0.923*10=9.23%10=9
            numero_generado = numero_generado + digito;
        }
        return  numero_generado;
    }

    static double calcular_porcentaje_descuento(String numero_generado){
        double contar = 0;
        while (!numero_generado.equals("")){
            if(numero_generado.charAt(0) == '1'){
                contar++;
            }
            numero_generado = numero_generado.substring(1);
        }
        double descuento = contar/10;
        return descuento;
    }
}
