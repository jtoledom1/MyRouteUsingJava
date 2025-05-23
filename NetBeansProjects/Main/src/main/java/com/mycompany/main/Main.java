package com.mycompany.main;
import java.util.Scanner;
/**
 *
 * @author José Diego Toledo Muñoz ft. Javier Valdez Cuellar
 */


// Clase para representar artículos electrónicos
class ArticuloElectronico {
    private String nombre;
    private double precio;

    // Método constructor
    public ArticuloElectronico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el precio
    public double getPrecio() {
        return precio;
    }
}

// Clase para representar computadoras
class Computadora extends ArticuloElectronico {
    private String modelo;

    // Método constructor (sobrecargado)
    public Computadora(String nombre, double precio, String modelo) {
        super(nombre, precio);
        this.modelo = modelo;
    }

    // Método para obtener el modelo
    public String getModelo() {
        return modelo;
    }
}

// Clase para la tienda
class Tienda {
    private String nombre;
    private ArticuloElectronico[] inventario;

    // Método constructor
    public Tienda(String nombre) {
        this.nombre = nombre;
        this.inventario = new ArticuloElectronico[10];
    }

    // Método para agregar un artículo al inventario (con parámetros)
    public void agregarArticulo(ArticuloElectronico articulo) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
                inventario[i] = articulo;
                System.out.println("Artículo agregado al inventario: " + articulo.getNombre());
                break;
            }
        }
    }

    // Método para listar el inventario (sin parámetros y sin retorno)
    public void listarInventario() {
        System.out.println("Inventario de la tienda " + nombre + ":");
        for (ArticuloElectronico articulo : inventario) {
            if (articulo != null) {
                System.out.println("Nombre: " + articulo.getNombre());
                System.out.println("Precio: $" + articulo.getPrecio());
                if (articulo instanceof Computadora) {
                    Computadora computadora = (Computadora) articulo;
                    System.out.println("Modelo: " + computadora.getModelo());
                }
                System.out.println("------------------------------");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Tienda de Electrónicos");
        System.out.print("Ingrese el nombre de la tienda: ");
        String nombreTienda = scanner.nextLine();

        Tienda tienda = new Tienda(nombreTienda);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar artículo electrónico");
            System.out.println("2. Listar inventario");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese el nombre del artículo: ");
                    String nombreArticulo = scanner.nextLine();
                    System.out.print("Ingrese el precio del artículo: ");
                    double precioArticulo = scanner.nextDouble();

                    System.out.println("¿Es una computadora? (S/N): ");
                    scanner.nextLine(); // Consumir el salto de línea
                    String esComputadora = scanner.nextLine();
                    if (esComputadora.equalsIgnoreCase("S")) {
                        System.out.print("Ingrese el modelo de la computadora: ");
                        String modelo = scanner.nextLine();
                        Computadora computadora = new Computadora(nombreArticulo, precioArticulo, modelo);
                        tienda.agregarArticulo(computadora);
                    } else {
                        ArticuloElectronico articulo = new ArticuloElectronico(nombreArticulo, precioArticulo);
                        tienda.agregarArticulo(articulo);
                    }
                    break;
                case 2:
                    tienda.listarInventario();
                    break;
                case 3:
                    System.out.println("Gracias por visitar la Tienda de Electrónicos. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}

