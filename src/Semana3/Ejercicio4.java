package Semana3;

import java.util.Scanner;

public class Ejercicio4 {
//    Una reconocida empresa de transporte terrestre necesita incrementar sus ventas, motivo por el cual ha decidido establecer un esquema de
//    premios basado en puntos que el cliente obtiene de acuerdo a los kilómetros que ha recorrido en sus viajes. El plan se llama “Viajero Frecuente”.
//    Según este plan, se otorgará una bonificación de puntos sobre los puntos ya obtenidos hasta antes de la fecha de inicio del lanzamiento de la campaña.
//    La bonificación se calcula en base a un factor que se determina de acuerdo a los kilómetros que el cliente tiene acumulados en su estado de cuenta y
//    de acuerdo a si la bonificación será por viajes nacionales o internacionales. Considere la siguiente tabla:

//    Viaje                                 % de bonificación
//    Tipo          Km. recorridos
//    Nacional (N)  Hasta 10000             10.61
//                  Entre 10001 y 16000     20.52
//                  Entre 16001 y 18000     30.43
//                  Mayor a 18000           40.11
//
//    Internacional Hasta 25000             45.34
//    (I)           Entre 25001 y 30000     55.25
//                  Entre 30001 y 45000     65.16
//                  Mayor a 45000           75.13

//    Adicionalmente, se aplica otra bonificación especial. Se aplica de acuerdo al tipo de cliente según lo siguiente:
//            - Cliente normal 10%
//            - Cliente preferencial 12%
//            - Cliente VIP 20%
//
//    Existe un tercer tipo de bonificación que se aplica de acuerdo al día en que el cliente decide viajar, así tenemos lo siguiente:
//            - Lunes a Miércoles 20%
//            - Jueves y Viernes 15%
//            - Sábados y Domingos 10%
//
//    Todas las bonificaciones se aplican sobre el total de kilómetros acumulados del cliente.
//    Se le solicita lo siguiente:
//    a) Desarrollar un subprograma para determinar el porcentaje de bonificación.
//    b) Desarrollar un subprograma para determinar el porcentaje de bonificación especial.
//    c) Desarrollar un subprograma para determinar el porcentaje de bonificación de acuerdo al día.
//    Desarrollar un subprograma para determinar el total de kilómetros con las tres bonificaciones.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cantidad de KM acumulados: ");
        int km_acumulados = scanner.nextInt();
        System.out.println("Tipo de cliente Normal(N), Preferente(P) y VIP: ");
        String tipo_cliente = scanner.next();
        System.out.println("Tipo de viaje Nacional(N) o Internacional(I): ");
        String tipo_viaje = scanner.next();
        System.out.println("Dia en el que viaja L-M-X-J-V-S-D: ");
        String dia_semana = scanner.next();

        int km = 1000;
        if(tipo_viaje == "I"){
            km = 5000;
        }

        System.out.println(tipo_cliente);
        System.out.println(tipo_viaje);
        System.out.println(dia_semana);
        double bonificacion_tipoviaje = calcular_bonificacion_tipoviaje(tipo_viaje, km_acumulados);
        System.out.println(bonificacion_tipoviaje);
        double bonificacion_tipocliente = calcular_bonificacion_tipocliente(tipo_cliente);
        System.out.println(bonificacion_tipocliente);
        double bonificacion_diasemana = calcular_bonificacion_diasemana(dia_semana);
        System.out.println(bonificacion_diasemana);

        double km_ganados = km * (1 + bonificacion_tipoviaje) * (1 + bonificacion_tipocliente) * (1 + bonificacion_diasemana);

        System.out.println("Cantidad de km ganados en este viaje son: " + km_ganados);
        System.out.println("Cantidad de km acumulados a la fecha: " + (km_ganados + km_acumulados));
    }

    static double calcular_bonificacion_tipoviaje(String tipo_viaje, int km_acumlados){
        double bonificacion;
        switch ((tipo_viaje.equals("N")  && km_acumlados<=10000)?1 : (tipo_viaje.equals("N") && (km_acumlados>=10001 && km_acumlados <= 16000))?2 :
                (tipo_viaje.equals("N") && km_acumlados>=16001 && km_acumlados <= 18000)?3 : (tipo_viaje.equals("N") && km_acumlados>=18001)?4 :
                        (tipo_viaje.equals("I") && km_acumlados <= 25000)?5 : (tipo_viaje.equals("I") && km_acumlados>=25001 && km_acumlados <= 30000)?6 :
                                (tipo_viaje.equals("I") && km_acumlados>=30001 && km_acumlados <= 45000)?7 : (tipo_viaje.equals("I") && km_acumlados>=45001)?8 : 0){
            case 1: bonificacion = 0.1061; break;
            case 2: bonificacion = 0.2052; break;
            case 3: bonificacion = 0.3043; break;
            case 4: bonificacion = 0.4011; break;
            case 5: bonificacion = 0.4534; break;
            case 6: bonificacion = 0.5525; break;
            case 7: bonificacion = 0.6516; break;
            case 8: bonificacion = 0.7513; break;
            default: bonificacion = 0; break;
        }

        return bonificacion;
    }

    static double calcular_bonificacion_tipocliente(String tipo_cliente){
        double bonificacion;
        switch ((tipo_cliente.equals("N"))?1 : (tipo_cliente.equals("P"))?2 : (tipo_cliente.equals("VIP"))?3 : 0){
            case 1: bonificacion = 0.1; break;
            case 2: bonificacion = 0.12; break;
            case 3: bonificacion = 0.20; break;
            default: bonificacion = 0; break;
        }

        return bonificacion;
    }

    //Lunes (L) Martes (M) Miercoles (X) Jueves (J) Viernes (V) Sabado (S) Domingo (D)
    static double calcular_bonificacion_diasemana(String dia){
        double bonificacion;
        switch ((dia.equals("L") || dia.equals("M") || dia.equals("X") )?1 : (dia.equals("J")  || dia.equals("V") )?2 : (dia.equals("S")  || dia.equals("D") )?3 : 0){
            case 1: bonificacion = 0.2; break;
            case 2: bonificacion = 0.15; break;
            case 3: bonificacion = 0.10; break;
            default: bonificacion = 0; break;
        }

        return bonificacion;
    }
}
