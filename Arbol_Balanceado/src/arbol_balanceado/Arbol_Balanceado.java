/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_balanceado;

/**
 *
 * @author july
 */
public class Arbol_Balanceado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       ArbolBalanceado artistas = new ArbolBalanceado();
       
       artistas.insertar("Megadeth", "Trash Metal");
      // artistas.imprimirEnPreorden();
       artistas.insertar("Guns and Roses", "Glam");
      // artistas.imprimirEnPreorden();
       artistas.insertar("Slipknot", "Comercial");
      // artistas.imprimirEnPreorden();
       artistas.insertar("Daddy Yankee", "Reggaeton");
      // artistas.imprimirEnPreorden();
       artistas.insertar("Whitney Houston", "Balada");
       //artistas.imprimirEnPreorden();
       artistas.insertar("Evanescence", "Comercial");
      // artistas.imprimirEnPreorden();
       artistas.insertar("U2", "Old");
      // artistas.imprimirEnPreorden();
       artistas.insertar("Van Halen", "Glam");
      // artistas.imprimirEnPreorden();
       artistas.imprimirEnorden();
       
       System.out.println("---------------------------------------");
        System.out.println("");
       ArbolBalanceado paises = new ArbolBalanceado();
       paises.insertar("México", "el mejor");
       //paises.imprimirEnPreorden();
       paises.insertar("Suiza", "hermoso");
      // paises.imprimirEnPreorden();
       paises.insertar("Guatemala", "sudamérica");
       //paises.imprimirEnPreorden();
       paises.insertar("Tailandia", "elefantes");
       //paises.imprimirEnPreorden();
       paises.insertar("Pakistán", "peligroso");
      // paises.imprimirEnPreorden();
       paises.insertar("Japón", "tecnología");
      // paises.imprimirEnPreorden();
       paises.insertar("Ucrania", "desconocido");
      // paises.imprimirEnPreorden();
       paises.insertar("Rusia", "difícil");
      // paises.imprimirEnPreorden();
       paises.insertar("Nueva Zelanda", "frío");
      // paises.imprimirEnPreorden();
       paises.insertar("India", "peligroso");
       //paises.imprimirEnPreorden();
       paises.imprimirEnorden();
       
       System.out.println("---------------------------------------");
        System.out.println("");
       ArbolBalanceado perros = new ArbolBalanceado();
       perros.insertar("Chihuahua", "Nervioso");
       //perros.imprimirEnPreorden();
       perros.insertar("Dobberman", "Rudo");
       //perros.imprimirEnPreorden();
       perros.insertar("Pug", "Gordo");
       //perros.imprimirEnPreorden();
       perros.imprimirEnorden();
       
       System.out.println("---------------------------------------");
        System.out.println("");
       ArbolBalanceado marcas = new ArbolBalanceado();
       marcas.insertar("Under Armour", "Nervioso");
       //marcas.imprimirEnOrden();
       marcas.insertar("Pirma", "Rudo");
       //marcas.imprimirEnOrden();
       marcas.insertar("Adidas", "Gordo");
       marcas.imprimirEnorden();
       
   }
}
   

