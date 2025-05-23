/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entrada_datos;
import java.util.Scanner;
/**
 *
 * @author Jtoledo Muñoz
 */
public class Entrada_datos {

    public static void main(String[] args) 
    {
        int num; 
        Scanner OBD=new Scanner(System.in);
        System.out.print("dame dato int\t");
        num=OBD.nextInt();
        System.out.println("el obd fue:\t"+num);
        //System.out.print(num,+num,+num);
        
    }
}
