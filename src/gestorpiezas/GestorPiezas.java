package gestorpiezas;

import java.util.Scanner;

public class GestorPiezas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
	// En la variable miAlmacen es donde guardaremos las piezas
        Almacen miAlmacen = new Almacen();
  
        String id, tipo;
        int precio, a;
        boolean disponible;
        
        int opcion, salir = 5;                
        //teclado.nextLine();
        do{
            muestraMenu();
            System.out.println("(Piezas actuales: " + miAlmacen.getCantidad() + ")");
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch(opcion){
                
		// Añadir una pieza nueva
                case 1:		    
                    System.out.println("Ponga su código de identificación");
                    id = teclado.nextLine();
                    System.out.println("Ponga su tipo");
                    tipo = teclado.nextLine();
                    System.out.println("Ponga su precio");
                    precio = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("¿La tenemos en stock? s/n");
                    if(teclado.nextLine().equals("s"))
                    {
                        System.out.println("Ok, si tu lo dices.");
                        disponible = true;
                        disponible = true;
                    }
                    else
                        disponible = false;
                    // ... y finalmente la añado
                    miAlmacen.addPieza(id, tipo, precio, disponible);
                    System.out.println("Pieza introducida con éxito");
                    break;
                
		// Mostrar las piezas disponibles    
                case 2:
                    System.out.println(miAlmacen.getPiezasDisponibles());
                    break;
                
		// Mostrar todas las piezas                
                case 3:
                    System.out.println(miAlmacen.getAllPiezas());
                    break;
                
		// Buscar una pieza por código                      
                case 4:
                    System.out.println("Dame el código de identificación de la pieza a buscar");
                    id = teclado.nextLine();
                    
                    System.out.println(miAlmacen.getPiezaById(id));
                    break;
                    
                case 5:
                    System.out.println("Gracias por usarme. Hasta la próxima!");
                    break;
                    
                default:
                    System.out.println("Opcion incorrecta!");
            }  
            System.out.println("(ENTER para continuar...)");
            teclado.nextLine();
            
        }while(opcion!=salir);
    }

    private static void muestraMenu() {
        System.out.println("Bienvenido al gestor de piezas");
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Añadir una nueva pieza");
        System.out.println("2. Mostrar las piezas disponibles");
        System.out.println("3. Mostrar todas las piezas");
        System.out.println("4. Buscar una pieza");
        System.out.println("5. Salir");
    }
    /**
     * Función para mostrar los créditos del programa
     */
    public static void muestraCreditos(){
        System.out.println("Creado por Marcos. Ningún derecho reservado");
}
    
}
