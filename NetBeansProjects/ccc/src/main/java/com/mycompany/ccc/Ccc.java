package com.mycompany.ccc;
import java.util.Scanner;
/**
 * 20/09/23
 * @author José Diego Toledo
 */
public class Ccc {
    private String nombre;
    private int edad;
    private String puesto;
    private double salario;
    private String direccion;
    private String telefono;
    private String correo;
    
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del empleado: ");
        edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el puesto del empleado: ");
        puesto = scanner.nextLine();
        System.out.print("Ingrese el salario del empleado: ");
        salario = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Ingrese la dirección del empleado: ");
        direccion = scanner.nextLine();
        System.out.print("Ingrese el teléfono del empleado: ");
        telefono = scanner.nextLine();
        System.out.print("Ingrese el correo del empleado: ");
        correo = scanner.nextLine();
    }
    public void imprimirDatos() {
        System.out.println("Datos del empleado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
    }
    public static void main(String[] args) {
         Ccc empleado = new Ccc();
         empleado.ingresarDatos();
         empleado.imprimirDatos();
       
    }
}
