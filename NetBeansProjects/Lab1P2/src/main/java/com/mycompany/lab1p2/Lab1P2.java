package com.mycompany.lab1p2;
import java.util.Scanner;
/**
 *
 * @author José Toledo
 */
public class Lab1P2 {
    public static void main (String[]args){
        int num1, num2, mayor;
        Scanner dato=new Scanner(System.in);
        System.out.println("Comparación de 2 numeros");
        System.out.println("Dame el primero");
        num1=dato.nextInt();
        System.out.println("Dame el segundo número");
        num2=dato.nextInt();
        if (num1>num2){
            mayor=num1;
        }
        else{
            mayor=num2;
        }
        
        System.out.println("El número mayor es:"+mayor);
        
    }
}
/**
 * ASÍ QUEDA USANDO OPERADORES TERNARIOS, CUANDO UNO LE SABE LE SABE, ASÍ ES. CHI CHEÑOL
 * @author José Toledo
 * import java.util.Scanner;

public class Lab1P2 {
    public static void main(String[] args) {
        int num1, num2, mayor;
        Scanner dato = new Scanner(System.in);
        System.out.println("Comparación de 2 números");
        System.out.println("Dame el primero");
        num1 = dato.nextInt();
        System.out.println("Dame el segundo número");
        num2 = dato.nextInt();

        mayor = (num1 > num2) ? num1 : num2;

        System.out.println("El número mayor es: " + mayor);
    }
}
 * 
 * 
 * 
 */