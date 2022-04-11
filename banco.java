/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import java.util.ArrayList;

/**
 *
 * @author louiscarrillo
 */
public class banco {
    private long dinero;


    public banco(int size) {
        this.dinero=0;
    }



    public synchronized void deporistar(long val){
     this.dinero=this.dinero+val;
        System.out.println("suma actual:"+this.dinero);
    }



}
