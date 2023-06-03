package Semana2;

import java.util.Scanner;

public class Ejercicio5 {
    // Que lea las coordenadas (x1, y1) y (x2, y2) de dos puntos y nos determine e imprima la distancia entre
    // ellos y el ángulo que forma la recta que los une con la horizontal

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, x2, y1, y2, dist, ang, m;

        System.out.println("Ingresar valor de x1");
        x1 = scanner.nextDouble();
        System.out.println("Ingresar valor de y1");
        y1 = scanner.nextDouble();
        System.out.println("Ingresar valor de x2");
        x2 = scanner.nextDouble();
        System.out.println("Ingresar valor de y2");
        y2 = scanner.nextDouble();

        dist = Math.pow(Math.pow((x2-x1),2)+Math.pow((y2-y1),2), 0.5);
        m = (y2-y1)/(x2-x1);
        ang = Math.atan(m);

        System.out.println("La distancia entre los punto (x1,y1) y (x2,y2) es: " + dist);
        System.out.println("El angulo con respecto a la horirzontal es: " + ang);
    }
}
