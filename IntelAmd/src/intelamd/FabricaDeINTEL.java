/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intelamd;

/**
 *
 * @author Dolly
 */
public class FabricaDeINTEL implements Runnable{
    
    AreaComun1 ac2; // se trae el aarea comun 1, pero en lugar de fabricar amd será intel. Pq el area comun 2 es para comprar

    public FabricaDeINTEL(AreaComun1 ac2) {
        this.ac2 = ac2;
    }
    
    @Override
    public void run() {
        
   for (long i = 0; i < 10000000; i++) {
            if(i % 60 == 0){ // el módulo, cuando el residuo sea 0, serán cumplidos los 50 ciclos
            ac2.GeneraIntel();// una vez que se cumplan esos 50 ciclos, se genera un AMD
            }
        }     
        
        
    }
    
}
