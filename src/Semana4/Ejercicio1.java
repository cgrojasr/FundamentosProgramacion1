package Semana4;

import java.util.Scanner;

public class Ejercicio1 {
//    Una empresa desea una aplicación para contabilizar la cantidad de dígitos repetidos dentro de una cadena de números ingresados.
//    Por ejemplo, si tengo el siguiente número 45776574367321367112 y pido que el número a contabilizar sea el 7 entonces debo
//    obtener 5 como valor resultante. La cifra indicada puede tener diferente longitud.
//    Desarrollar un subprograma que permita contar la cantidad total de dígitos.
//    Desarrollar un subprograma que permita contar la cantidad de números repetidos de acuerdo al digito indicado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar una cadena de dígitos numéricos: ");
        String cadena_digitos = scanner.next();
        System.out.println("¿Que dígito deseas contabilizar?: ");
        String digito = scanner.next();

        if(digito.length() == 1)
        {
            System.out.println(contar_digitos(cadena_digitos));
            System.out.println(contar_repetidos(cadena_digitos, digito.charAt(0)));
        }
        else {
            System.out.println("Se debe ingresar un solo digito para contabilizar");
        }

    }

    static int contar_digitos(String cadena_digitos){
        //return cadena_digitos.length();
        int contar = 0;
        while (!cadena_digitos.equals("")){
            contar++;
            //pepito
            //012345
            cadena_digitos = cadena_digitos.substring(1);
//            System.out.println(cadena_digitos);
//            System.out.println(contar);
        }
        return contar;
    }

    static int contar_repetidos(String cadena_digitos, char digito){
        int contar = 0;
        int longitud = contar_digitos(cadena_digitos);
        for(int i = 0; i<longitud; i++){
            if(cadena_digitos.charAt(i) == digito){
                contar++;
            }
        }
        return contar;
    }
}
