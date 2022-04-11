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
public class Recolector1 implements Runnable{
    
     AreaComun1 ac2; 
     AreaComun2 acc2;

    public Recolector1(AreaComun1 ac2, AreaComun2 acc2) {
        this.ac2 = ac2;
        this.acc2 = acc2;
    }
     
    
    @Override
    public void run() {
        
   for (long i = 0; i < 10000000; i++) {
            if(i % 30 == 0){ // 30 ciclos
            if(ac2.recolecta()==1){ // 1 es AMD
                acc2.nuevoAmd();
            }else if(ac2.recolecta()==2){ // 2 es intel
                acc2.nuevoIntel();
            }else{
            }
            }
        }     
        
        
    }
    
}
