package cafeteria;

public class Main {

    public static void main(String[] args) {

        // Crear una instancia de Cafeteria
        Cafeteria cafeteria = new Cafeteria();

        // Crear productos
        Bebida cafe = new Bebida("Café Americano", 2.50, "Mediano");
        Bebida te = new Bebida("Té Verde", 2.00, "Grande");
        Comida sandwich = new Comida("Sándwich de Pollo", 4.00, true);
        Comida ensalada = new Comida("Ensalada César", 3.50, false);

        // Agregar productos al menú
        cafeteria.agregarAlMenu(cafe);
        cafeteria.agregarAlMenu(te);
        cafeteria.agregarAlMenu(sandwich);
        cafeteria.agregarAlMenu(ensalada);

        // Mostrar el menú
        cafeteria.mostrarMenu();

        // Crear un pedido y agregar productos
        Pedido pedido = new Pedido();
        pedido.agregarProducto(cafe);
        pedido.agregarProducto(sandwich);
        pedido.agregarProducto(te);

        // Mostrar el pedido y total
        System.out.println("\n--------------------------\n");
        pedido.mostrarTotal();
    }
}
