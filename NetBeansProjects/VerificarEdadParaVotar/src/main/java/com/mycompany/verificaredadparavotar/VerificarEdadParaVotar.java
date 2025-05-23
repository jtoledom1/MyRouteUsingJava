package com.mycompany.verificaredadparavotar;
import java.util.Scanner;
/**
 *
 * @author José Diego Toledo
 */
public class VerificarEdadParaVotar {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad al usuario
        System.out.print("Por favor, ingrese su edad: ");
        int edad = scanner.nextInt();

        // Utilizar el operador condicional ternario para verificar si puede votar
        String mensaje = (edad >= 18) ? "¡Puede votar en las próximas elecciones!" : "No puede votar en las próximas elecciones.";

        // Mostrar el mensaje
        System.out.println(mensaje);

        // Cerrar el Scanner
        scanner.close();
    
    }
}
