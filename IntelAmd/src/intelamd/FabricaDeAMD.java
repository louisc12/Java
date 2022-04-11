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
public class FabricaDeAMD implements Runnable {

    AreaComun1 ac1;

    public FabricaDeAMD(AreaComun1 ac1) {
        this.ac1 = ac1;
    }
    
    
    @Override
    public void run() {
        
        for (long i = 0; i < 10000000; i++) {
            if(i % 50 == 0){ // el módulo, cuando el residuo sea 0, serán cumplidos los 50 ciclos
            ac1.GeneraAMD(); // una vez que se cumplan esos 50 ciclos, se genera un AMD
            }
        }
    
        
        
    }
    
}
