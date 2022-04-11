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
public class LineaFabricacion implements Runnable{

     AreaComun1 ac2; 

    public LineaFabricacion(AreaComun1 ac2) {
        this.ac2 = ac2;
    }

    @Override
    public void run() {
        
        for (long i = 0; i < 10000000; i++) {
            if(i % 75 == 0){ 
            ac2.aumenta();
            }
        }   

    }
    
}
