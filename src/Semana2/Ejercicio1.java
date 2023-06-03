package Semana2;

import java.util.Scanner;

public class Ejercicio1 {
    //Dados dos números, que determine la suma, resta, multiplicación, división, potencia
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double var1, var2;
        double sum, res, mul, div, pot;

        System.out.println("Ingresar variable 1");
        var1 = scanner.nextInt(); //"2"<-Cadena de caracteres (string)
        System.out.println("Ingresar variable 2");
        var2 = scanner.nextInt();

        sum = var1 + var2;
        res = var1 - var2;
        mul = var1 * var2;
        div = var1 / var2;
        pot = Math.pow(var1, var2);

        System.out.println(sum);
        System.out.println(res);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(pot);
        System.out.println();
    }
}
