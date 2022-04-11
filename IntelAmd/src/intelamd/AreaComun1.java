/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intelamd;

import java.util.ArrayList;

/**
 *
 * @author Dolly
 */
public class AreaComun1 {
    
    ArrayList<Procesador> procesadores ;
    
    int contadorintel=0;
    int contadoramd = 0;
    
    public AreaComun1(){
    procesadores = new ArrayList<Procesador>();
    }
    
    
    public synchronized void GeneraIntel(){
    
    if(procesadores.size()< 200){
        procesadores.add(new Procesador("Intel", 1)); // agregar un nuevo procesador, inicializado en 1 de la marca intel
    }    
    
}
            
    public synchronized void GeneraAMD(){
    if(procesadores.size()< 200){
    procesadores.add(new Procesador("AMD", 1));
    }
    
   
    
}
    public synchronized void aumenta(){
    
        for (int i = 0; i < procesadores.size(); i++) { //tomar todos los procesadores que hay
          if("AMD".equals(this.procesadores.get(i).getMarca())){ // get i = para tener el numero de procesadores que esta en el arreglo
          if(this.procesadores.get(i).getEstado()<5){
              this.procesadores.get(i).setEstado(this.procesadores.get(i).getEstado()+1);
          }
          }else{
          if(this.procesadores.get(i).getEstado()<4){
              this.procesadores.get(i).setEstado(this.procesadores.get(i).getEstado()+1);
          }    
          }  
        }
}   
   
      public synchronized int recolecta(){
          int estado =0; 
          if(this.procesadores.size()>0){
     if("AMD".equals(this.procesadores.get(this.procesadores.size()-1).getMarca())){ // get i = para tener el numero de procesadores que esta en el arreglo
          if(this.procesadores.get(this.procesadores.size()-1).getEstado()==4){
              estado =1; // es intel o amd, y se fija si está maduro, y si si, lo elimina
              this.procesadores.remove(this.procesadores.size()-1);
              contadoramd++;
              }
          }else{
          if(this.procesadores.get(this.procesadores.size()-1).getEstado()==3){
              estado=2;
              this.procesadores.remove(this.procesadores.size()-1);
              contadorintel++;
             }    
          }  
      }
          return estado; // 
      }

    public int getContadorintel() {
        return contadorintel;
    }

    public void setContadorintel(int contadorintel) {
        this.contadorintel = contadorintel;
    }

    public int getContadoramd() {
        return contadoramd;
    }

    public void setContadoramd(int contadoramd) {
        this.contadoramd = contadoramd;
    }
    
      
      
}
