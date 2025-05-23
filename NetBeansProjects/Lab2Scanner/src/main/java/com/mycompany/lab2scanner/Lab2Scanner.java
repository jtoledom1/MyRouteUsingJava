/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2scanner;
import java.util.Scanner;
/**
 *
 * @author Sr. Toledo Muñoz
 */
public class Lab2Scanner {

    public static void main(String[] args) {
        
        int var1;
        int var2;
        int resta;
        int mult;
        double div;
        int modul;
        String cad;
        char tecla;
        
        Scanner OBD=new Scanner(System.in);
        
        System.out.println("*******************************************************\n");
        System.out.println("\tB i e n v e n i d o    s e a s\n");
        System.out.println("*******************************************************\n\n");
        
       
        
        System.out.println("Ingresa el primer valor");       
        var1 = OBD.nextInt();
        System.out.println("Ingresa el segundo valor");       
        var2 = OBD.nextInt();
        int sum=var1+var2;
        System.out.println("El valor de la suma es el siguiente: "+sum);
        resta= var1-var2;
        System.out.println("El valor de la resta es el siguiente: "+resta);
        mult= var1*var2;
        System.out.println("El valor de la multiplicación es el siguiente: "+mult);
        div= var1/var2;
        System.out.println("El valor de la división es el siguiente: "+div);
        modul= var1%var2;
        System.out.println("El valor del móduloes el siguiente: "+modul);
        
         System.out.println("Ahora ingresa una cadena");
        cad=OBD.next();
        System.out.println("Ingresaste"+cad);
        
        System.out.println("Ahora ingresa un caracter"); 
        tecla=OBD.next().charAt(0);
        System.out.println("Ingresaste: "+tecla);
    }
}
