package com.mycompany.alumno;
/**
 * 18/SEPT
 * @author Jtole
 */
public class ALUMNO {

        //Miembros de la clase
    //Atributos
    private String nombre;
    private int edad;
    private float promedio;
    
    // metodos
    //Aqui utilizamos Ccnstructor por defecto
    //porque no lo definimos 
    
    public static void main(String[] args) {
        //MIEMBROS DE LA CLASE: ATRIBUTOS
        ALUMNO alu=new ALUMNO();
         //instanciando la clase
        alu.nombre="AS-K";
        alu.edad=78;
        alu.promedio=6.7f;
        
        ALUMNO alu1=new ALUMNO();
        alu1.nombre="EDOR";
        alu1.edad=51;
        alu1.promedio=9.9f;
        
        System.out.println("tu nombre es" +alu.nombre);
        System.out.println("\ntu edad es " +alu.edad);
        System.out.println("\ntu promedio es " +alu.promedio);
        System.out.println("\nEl alumno 1 se llama " +alu.nombre + " El alumno 2 se llama " +alu1.nombre);
    }
}
