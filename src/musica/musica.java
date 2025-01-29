package musica;

public class musica {


    public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Añadir banda");
            System.out.println("2. Eliminar banda");
            System.out.println("3. Mostrar todas las bandas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    // Llamar al método para añadir banda
                    break;
                case 2:
                    // Llamar al método para eliminar banda
                    break;
                case 3:
                    // Llamar al método para mostrar todas las bandas
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
            }
        } while(opcion != 4);
    }

}
