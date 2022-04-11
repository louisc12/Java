/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intelamd;

import java.util.Random;

/**
 *
 * @author Dolly
 */
public class AreaComun2 {
    
    int intel = 0;
    int amd = 0;
    int contador_cons1 =0;
    int contador_cons2 =0;
    int contador_cons3 =0;
    int contador_cons4 =0;
    int contador_cons5 =0;

    public int getIntel() {
        return intel;
    }

    public int getAmd() {
        return amd;
    }

    public int getContador_cons1() {
        return contador_cons1;
    }

    public int getContador_cons2() {
        return contador_cons2;
    }

    public int getContador_cons3() {
        return contador_cons3;
    }

    public int getContador_cons4() {
        return contador_cons4;
    }

    public int getContador_cons5() {
        return contador_cons5;
    }
    
    
    public synchronized void nuevoIntel(){
        if(intel+amd<150){ //soprte 150 computadoras
            this.intel++;
        }
    }
    
    
    public synchronized void nuevoAmd(){
        if(intel+amd<150){
            this.amd++; // si hay más de 150 se genera un nuevo amd, ya se sabe cuantos son, solo va viendo si pasa de 150 para generar uno nuevo
        }
    }


    public synchronized void Consumidor1(){
        if(this.intel>0){
           intel--; // se va quitando una 
        }else{
            this.contador_cons1++;
        }
    }

    public synchronized void Consumidor2(){
        if(this.amd>0){
            amd--;
        }else{
            this.contador_cons2++;
        }
    }
    
    public synchronized void Consumidor3(){
        if(this.intel>0 && this.amd>0){
        if(this.intel>amd){
            intel--;
        }else
            amd--;
    }else{
            this.contador_cons3++;
        }
    }
    
    public synchronized void Consumidor4(){
        
        Random rnd = new Random();
        int decision = rnd.nextInt(2);//0 y 1
        if(this.intel>0 && this.amd>0){
            if(decision==0){ // si es igual a 0 consume intel y si es igual a 1 consume amd, indistintamente.
            intel--;
        }else{
            amd--;
            }
            
        }else{
            this.contador_cons4++;
        }
    }
    
    public synchronized void Consumidor5(){
        if(this.intel>0 && this.amd>0){
        if(this.intel<amd){
            intel--;
        }else
            amd--;
    }else {
            this.contador_cons5++;
        }
    }
    
    
}
