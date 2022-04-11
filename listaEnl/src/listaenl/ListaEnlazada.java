/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenl;

/**
 *
 * @author louiscarrillo
 */
public class ListaEnlazada {
     private nodo inicio;
     private nodo fin;
     
     
     
     
     public void agregarAlFinal(Object elemento){
         nodo Nodo = new nodo();
         Nodo.elemento=elemento;
         if(inicio==null){
             inicio =Nodo;
         }         
         if(fin==null){
         fin=Nodo;
         }else{
             fin.next=Nodo;
             fin=Nodo;
         }
     }
     
     public void agregarEn(int pocision,Object el){
         nodo actual=inicio;
         for(int i=0;i<pocision;i++){
             if(actual==null){
                 break;
             }else{
                 actual=actual.next;
             }
         }
     }
     
     
     
}
