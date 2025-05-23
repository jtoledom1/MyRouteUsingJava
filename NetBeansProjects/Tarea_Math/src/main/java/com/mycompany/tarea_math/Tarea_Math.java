package com.mycompany.tarea_math;
import javax.swing.JOptionPane;

/**
 *
 * @author José Diego Toledo Muñoz JDTM
 */
public class Tarea_Math {
    public static void main(String[] args) {
        // Solicitar el primer número
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        double num1 = Double.parseDouble(input1);

        // Solicitar el segundo número
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        double num2 = Double.parseDouble(input2);

        // Solicitar la operación a realizar
        String operacion = JOptionPane.showInputDialog("Ingrese la operación a realizar (mas, menos, multi, div, max):");

        // Realizar la operación y almacenar el resultado
        double resultado = 0.0;
        String msjOperacion = "";

        switch (operacion) {
            case "mas":
                resultado = Math.addExact((int) num1, (int) num2);
                msjOperacion = "Suma";
                break;
            case "menos":
                resultado = Math.subtractExact((int) num1, (int) num2);
                msjOperacion = "Resta";
                break;
            case "multi":
                resultado = Math.multiplyExact((int) num1, (int) num2);
                msjOperacion = "Multiplicación";
                break;
            case "div":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    msjOperacion = "División";
                } else {
                    JOptionPane.showMessageDialog(null, "No es posible dividir por cero.");
                    System.exit(1);
                }
                break;
            case "max":
                resultado = Math.max(num1, num2);
                msjOperacion = "Máximo";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida.");
                System.exit(1);
        }

        // Mostrar el resultado y la operación en una caja de diálogo
        JOptionPane.showMessageDialog(null, msjOperacion + " de " + num1 + " y " + num2 + " es igual a " + resultado);
    }
}
