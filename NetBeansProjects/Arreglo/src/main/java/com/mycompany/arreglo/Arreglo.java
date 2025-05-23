package com.mycompany.arreglo;
import java.util.Scanner;

/**
 *
 * @author José Diego Toledo Muñoz
 */
public class Arreglo {

    public static void main(String[] args) {
    
        int[]num=new int[10];
        Scanner dato=new Scanner(System.in);
        System.out.println("proporcione los datos");
        for(int i=0;i<10;i++)
        {
        System.out.println("Elemento["+(i+1)+"]=");
        num[i]=dato.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("Elemento["+(i+1+"]=")+num[i]);
        }   
    }
}
