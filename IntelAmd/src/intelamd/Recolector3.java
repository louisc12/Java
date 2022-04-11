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
public class Recolector3 implements Runnable{
    
     AreaComun1 ac2; // se trae el aarea comun 1, pero en lugar de fabricar amd será intel. Pq el area comun 2 es para comprar
     AreaComun2 acc2;

    public Recolector3(AreaComun1 ac2, AreaComun2 acc2) {
        this.ac2 = ac2;
        this.acc2 = acc2;
    }
     
     
    public Recolector3(AreaComun1 ac2) {
        this.ac2 = ac2;
    }
    
    @Override
    public void run() {
        
   for (long i = 0; i < 10000000; i++) {
            if(i % 80 == 0){ // 80 ciclos
            if(ac2.recolecta()==1){
                acc2.nuevoAmd();
            }else if(ac2.recolecta()==2){
                acc2.nuevoIntel();
            }else{
            }
            }
        }     
        
        
    }
    
}
