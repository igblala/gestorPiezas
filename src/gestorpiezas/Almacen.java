package gestorpiezas;

/**
 * Esta clase gestiona todo un Almacen que contiene una colección de piezas
 * @author Marcos
 */
public class Almacen {
    
    private Pieza piezas[];
    // Necesito saber la cantidad de piezas que llevamos
    private int cantidad;
    
    /**
     * Constructor que inicializa el vector y pone el contador a 0
     */
    public Almacen(){
        this.piezas = new Pieza[100];
        this.cantidad = 0;
    }
    
    /**
     * Devuelve la cantidad de piezas del Almacen
     * @return La cantidad de piezas
     */
    public int getCantidad(){
        return this.cantidad;
    }
    
    /**
     * Método para añadir una nueva pieza al Almacen
     * @param nuevaId Id de la pieza a introducir
     * @param nuevoTipo Tipo de la pieza a introducir
     * @param nuevoPrecio Precio de la pieza a introducir
     * @param nuevoDisponible Disponemos o no disponemos
     */
    public void addPieza(String nuevaId, String nuevoTipo, double nuevoPrecio, boolean nuevoDisponible) {
        Pieza aux = new Pieza();
        aux.setId(nuevaId);
        aux.setTipo(nuevoTipo);
        aux.setPrecio(nuevoPrecio);
        aux.setDisponible(nuevoDisponible);
        
        this.piezas[cantidad] = aux;        
        this.cantidad++;
    }
    
    /**
     * Este método devuelve la información de la pieza que ocupa la posición dada
     * @param posicion Posición dentro del vector de la pieza que buscamos
     * @return Un texto con toda la información de la pieza
     */
    public String getPiezaByIndex(int posicion) {
        String resultado = this.piezas[posicion].getId() + " - " + this.piezas[posicion].getTipo() + " - " + this.piezas[posicion].getPrecio();
        return resultado;
    }
    
    /**
     * Este método devuelve la información de la pieza del código dado
     * @param idBuscada Código de la pieza buscada
     * @return Un texto con toda la información de la pieza     * 
     */
    public String getPiezaById(String idBuscada) {
        
        String resultado = null;
        int i;
        for(i = 0; i < this.cantidad && this.piezas[i].getId().equals(idBuscada); i++){        
            if(i<this.cantidad){        
            resultado = this.piezas[i].getId() + " - " + this.piezas[i].getTipo() + " - " + this.piezas[i].getPrecio();
            }
            else{
            resultado = "";
            }
        }
        return resultado;
    }
    
    /**
     * Método para consultar todas las piezas del Almacen
     * @return Un texto con toda la información de todas las piezas
     */
    public String getAllPiezas() {
        String resultado="";
        
        for(int i = 0; i < this.cantidad; i++)
            resultado += this.piezas[i].getId() + " - " + this.piezas[i].getTipo() + " - " + this.piezas[i].getPrecio() + "\n";
        
        if(resultado.equals(""))
            return "Almacén vacío";
        else
            return resultado;
    }
    
    /**
     * Método para consultar todas las piezas disponibles del Almacen
     * @return Un texto con toda la información de todas las piezas disponibles
     */
    public String getPiezasDisponibles() {
        String resultado="";
        
        for(int i = 0; i < this.cantidad; i++)
        {
            if(!this.piezas[i].isDisponible())
            {
                
            }
            else    resultado += this.piezas[i].getId() + " - " + this.piezas[i].getTipo() + " - " + this.piezas[i].getPrecio() + "\n";
        }
        
        
        return resultado;
    }
    
}
