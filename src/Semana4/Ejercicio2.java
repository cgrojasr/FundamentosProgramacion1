package Semana4;

import java.util.Scanner;

public class Ejercicio2 {
//    Una empresa tiene como reglamento dar aumento de sueldo a sus trabajadores todos los años, el porcentaje de aumento
//    está dado de acuerdo con el tipo de trabajador: Gerente (g) o empleado (e). Los gerentes reciben un aumento del 14% anual
//    y los empleados reciben el 8% anual. Cada 4 años en vez de 14% reciben 18% y en vez de 8% reciben 12% (dependiendo del tipo de trabajador).
//    Desarrollar los módulos que determinen el sueldo que tendrá un trabajador después de N años y el porcentaje de aumento de sueldo que ha
//    obtenido comparando su sueldo original y su sueldo después de N años. Tenga en cuenta que los aumentos obtenidos van a su sueldo.
//    Se le solicita lo siguiente:
//    a.	Cálculo del sueldo después de N años
//    b.	Calcular el porcentaje de aumento después de N años.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que tipo de trabajador es? (G)erente o (E)mpleado");
        String tipo_empleado = scanner.next();
        System.out.println("¿Cuantos años quiere proyectar?: ");
        int años = scanner.nextInt();

        calcula_sueldo_n_años(tipo_empleado, años);
    }

    static void calcula_sueldo_n_años(String tipo_empleado, int años){
        double sueldo = 0;
        double porcentaje_acumulado = 1;

        if(tipo_empleado.equals("G"))
            sueldo = 15000;
        else
            sueldo = 5000;

        for(int i = 0;i<años; i++){
            porcentaje_acumulado = calcula_porcente_anual(porcentaje_acumulado, i+1, tipo_empleado);
            System.out.println("El incremento acumulado en % es " + porcentaje_acumulado);
            System.out.println("El sueldo para el año "+(i+1)+" es de " + sueldo * porcentaje_acumulado);
        }
    }

    static  double calcula_porcente_anual(double porcentaje_acumulado, int años_transcurridos, String tipo_empleado){
        if(años_transcurridos % 4 == 0){
            if(tipo_empleado.equals("G"))
                porcentaje_acumulado = porcentaje_acumulado*1.18;

            if(tipo_empleado.equals("E"))
                porcentaje_acumulado = porcentaje_acumulado*1.12;
        }
        else {
            if(tipo_empleado.equals("G"))
                porcentaje_acumulado = porcentaje_acumulado*1.14;

            if(tipo_empleado.equals("E"))
                porcentaje_acumulado = porcentaje_acumulado*1.08;
        }

        return porcentaje_acumulado;
    }
}
