package Semana4;

import java.util.Scanner;

public class Ejercicio3 {
    //Un banco establece que la clave secreta para acceso a sus cajeros automáticos debe ser un número de cuatro o más
    // dígitos y que la suma de los dos dígitos que se encuentran en la 3 y 4 posición (posición de centena y millar)
    // sea par. Determinar si una clave cumple con la condición.
    public static void main(String[] args) {
        String clave_secreta = "";
        Scanner scanner = new Scanner(System.in);
        while (clave_secreta.length() < 4){
            System.out.println("Ingrese una clave de 4 digitos");
            clave_secreta = scanner.next();
        }

        System.out.println("La validación de la clave es: " + validar_clave(clave_secreta));

    }

    static boolean validar_clave(String clave_secreta){
        int digito_3 = 0;
        int digito_4 = 0;

        digito_3 = clave_secreta.charAt(2);
        digito_4 = clave_secreta.charAt(3);

        if((digito_3+digito_4)%2 == 0)
            return  true;
        else
            return false;
    }
}
