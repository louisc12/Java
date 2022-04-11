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
public class Consumidor4 implements Runnable{
    
    AreaComun2 area;

    public Consumidor4(AreaComun2 area) {
        this.area = area;
    }
    
    

    @Override
    public void run() {
         for (long i = 0; i < 10000000; i++) {
            if(i % 90 == 0){ // el módulo, cuando el residuo sea 0, serán cumplidos los 50 ciclos
            area.Consumidor4();
            }
        }
    }
    
}
