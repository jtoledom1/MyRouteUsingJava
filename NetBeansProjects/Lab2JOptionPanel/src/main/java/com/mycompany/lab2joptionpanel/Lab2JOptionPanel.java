/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2joptionpanel;
import javax.swing.JOptionPane;
/**
 *
 * @author Jtole
 */
public class Lab2JOptionPanel {

    public static void main(String[] args) {
        
//String Nom_var;  
//Nom_var=JOptionPane.showInputDialog(“algo”); //sólo es para cadenas, para usar tipos enteros debe ser usado el parse.
        String nombre;
    char sexo;
    float estatura;
    int edad;

    nombre = JOptionPane.showInputDialog("Teclea un nombre de usuario ");
    sexo = JOptionPane.showInputDialog("Teclea tu sexo M  F ").charAt(0);
    edad = Integer.parseInt(JOptionPane.showInputDialog("Teclea tu edad "));
    estatura = Float.parseFloat(JOptionPane.showInputDialog("Teclea tu estatura"));
    System.out.print("Hola " +nombre); 
    
    JOptionPane.showMessageDialog(null,"Su nombre es: "+nombre+" \nSexo es: "+sexo+"\nEdad es: "+edad+"\nEstatura: "+estatura);
    int resp =JOptionPane.showConfirmDialog(null, "estás seguro?"); 
    }
}
