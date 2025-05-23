package com.mycompany.p2p2;
import java.util.Scanner;
/**
 *
 * @author Jtole
 */

public class P2p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese su calificación: ");
        double calificacion = scanner.nextDouble();
        if (calificacion >= 0 && calificacion <= 10) {
            if (calificacion == 10) {
                System.out.println("Excelente estudiante, felicidades");
            } else if (calificacion >= 9 && calificacion < 10) {
                System.out.println("Muy bien, sigue esforzándote.");
            } else if (calificacion >= 8 && calificacion < 9) {
                System.out.println("Bien, puedes mejorar tu calificación.");
            } else if (calificacion >= 7 && calificacion < 8) {
                System.out.println("Regular, esfuérzate más por favor.");
            } else {
                System.out.println("Reprobatorio, acude a asesoría para solucionar tus dudas.");
            }
        } else {
            System.out.println("La calificación ingresada no es válida. Debe estar entre 0 y 10.");
        }
        scanner.close();
    }
}
