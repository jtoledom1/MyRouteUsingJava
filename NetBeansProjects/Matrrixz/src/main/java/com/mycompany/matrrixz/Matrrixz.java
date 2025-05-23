package com.mycompany.matrrixz;
import java.util.Scanner;
/**
 *
 * @author José Diego Toledou
 */
public class Matrrixz {

    public static void main(String[] args) {
        Scanner algoparaguardar = new Scanner(System.in);
        System.out.println("Holaa :D");
        System.out.print("Ingrese el número de filas: ");
        int filas = algoparaguardar.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = algoparaguardar.nextInt();
        int[][] matriz = new int[filas][columnas];
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = algoparaguardar.nextInt();
            }
        }
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
