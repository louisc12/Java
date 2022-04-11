/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbusqueda;

/**
 *
 * @author 52473
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        arbolBusqueda arbol=new arbolBusqueda();
        arbol.insertar("Breaking bad ", "Metastasis");
        arbol.insertar("Friends", "Amigos");
        arbol.insertar("How i met ", "Como Conoci");
        arbol.insertar("Dark", "Oscuro");
        arbol.insertar("El chapo", "Narco"); 
        arbol.insertar("Daredevil", "Chapulin Colorado");
        arbol.insertar("Super Campeones", "Dream Team");
        arbol.insertar("Fifa", "Pes");
        arbol.insertar("PUBG","Free Fire");
        
        arbol.eliminar("PUBG");
        arbol.eliminar("Dark");
        // arbol.imprimirEnPreorden();
               
        arbol.buscar("Friends", "");
    }
    
}
