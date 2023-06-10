package Semana4;

import java.util.Scanner;

public class Ejercicio4 {
//    Una reconocida empresa de venta de gas natural desea una aplicación que permita calcular el total a pagar por una
//    persona u empresa dependiendo de los metros cúbicos (m3) consumidos y su tipo de contrato.
//    Existen dos tipos de contrato:
//    El contrato "residencial" (r) permite que los 28 primeros m3 sean gratis, los siguientes 122 se paguen a tarifa de
//    2.1 soles y a partir del m3 123 en adelante se paguen a 1.5 soles.
//    Por otro lado, el contrato "comercial" (c) permite que los 400 primeros m3 se paguen a 1.8 soles y a partir del
//    401 se pague a 2.5 soles.
//    a.	Desarrollar un subprograma que permita a un usuario con contrato residencial calcular el total a pagar
//    b.	Desarrollar un subprograma que permita a un usuario con contrato comercial calcular el total a pagar
//    c.	Desarrollar un subprograma que, recibiendo la cantidad de m3 y el tipo de contrato pueda retornar el total a pagar.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que tipo de contrato tiene? (R)esidencial o (C)omercial");
        String tipo_contrado = scanner.next();
        System.out.println("¿Cuantos m3 de gas consumio?: ");
        double volumen = scanner.nextDouble();

        System.out.println("El monto a pagar es: " + calcula_monto_pagar(tipo_contrado, volumen));
    }

    static double calcula_monto_pagar(String tipo_contrato, double volumen){
        double monto_pagar = 0;
        if(tipo_contrato.equals("R")){
            if(volumen <= 28)
                monto_pagar = 0;
            else {
                if(volumen <= 122)
                    monto_pagar = (volumen-28)*2.1;
                else {
                    monto_pagar = (volumen-122)*1.5+(122-28)*2.1;
                }
            }
        }

        if(tipo_contrato.equals("C")){
            if(volumen <= 400)
                monto_pagar = volumen*1.8;
            else
                monto_pagar = (volumen-400)*2.5+400*1.8;
        }

        return monto_pagar;
    }
}
