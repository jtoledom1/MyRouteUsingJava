package com.mycompany.l2p2;
import java.util.Scanner;
/**
 *
 * @author Jtole
 */

public class L2p2{
    public static void main(String[] args) {
        double num1=0, num2=0, resultado=0;
        int opcion;
        Scanner dato = new Scanner (System. in);
        System. out.println("=== MINICALCULADORA ===");
        System. out.println("Teclee el primer número:");
        num1= dato.nextDouble();
        System. out.println("Teclee el segundo número:");
        num2= dato.nextDouble();
        System.out.println ("*********************");
        System.out.println("1.\t Suma");
        System.out.println("2.\t Resta");
        System.out.println("3.\t Multiplicación");
        System.out.println("4.\t División");
        System.out.println("*********************");
        opcion=dato.nextInt();
        switch(opcion) {
            case 1 -> {
                resultado=num1+num2;
                System.out.println("La suma es:" +resultado);
            }
            case 2 -> {
                resultado=num1-num2;
                System.out.println("La resta es: "+resultado);
            }
            case 3 -> {
                resultado=num1*num2;
                System.out.println("La multiplicación es: "+resultado);
            }
            case 4 -> {
                if(num2==0) {
                    System.out.println("No se puede dividir entre 0");
                }
                else {
                    resultado=num1/num2;
                    System.out.println("La división es: "+resultado);
                }
            }
            default -> System.out.println("Opción no válida");
        }
    }
}
