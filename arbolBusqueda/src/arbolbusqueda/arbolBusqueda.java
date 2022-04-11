/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbusqueda;

/**
 *
 * @author 52473
 */
public class arbolBusqueda
{
    public String llave;
    public Object valor;
    public arbolBusqueda subarbolIzq;
    public arbolBusqueda subarbolDer;
    
    
    public void insertar(String nuevallave,Object valor)
    {
        //
        insertar(nuevallave,valor,this);
    }
    
    private void insertar(String llave,Object valor,arbolBusqueda arbol)
    {
        if (arbol.llave == null)
        {
            arbol.llave=llave;
            arbol.valor=valor;    
        }
        else
        {
            if (llave.compareTo(arbol.llave)<0)
            {
                if (arbol.subarbolIzq==null)
                {
                    arbol.subarbolIzq=new arbolBusqueda();
                }                   
                insertar(llave,valor,arbol.subarbolIzq);       
            }
            else if (llave.compareTo(arbol.llave)==0)
            {
                System.out.println(" Llave duplicada ");     
            }
            else
            {
                if (arbol.subarbolDer==null)
                {
                    arbol.subarbolDer =new arbolBusqueda();
                }
                insertar(llave,valor,arbol.subarbolDer);
            }
        }
    }
 
    
    private arbolBusqueda eliminarMenor(arbolBusqueda ar)
    {
        arbolBusqueda actual=null;
        arbolBusqueda anterior = null;
        
        if (ar!=null)
        {
            actual=ar;
            while(actual.subarbolIzq!=null)
            {
                anterior=ar;
                actual=ar.subarbolIzq;
            }
       
            if (anterior!=null)
            {
                if (actual.subarbolDer!=null)
                {
                    anterior.subarbolIzq=actual.subarbolDer;
                } 
                else 
                {
                    anterior.subarbolIzq=null;
                }
            }
        }     
        return actual;

    }
    
    
    //condicion para el miercoles 
    //metodo de eliminar mayor 
    private arbolBusqueda eliminarMayor(arbolBusqueda ar)
    {
        arbolBusqueda actual=null;
        arbolBusqueda anterior = null;
        
        if (ar!=null)
        {
            actual=ar;
            while(actual.subarbolDer!=null)
            {
                anterior=ar;
                actual=ar.subarbolDer;
            }
       
            if (anterior!=null)
            {
                if (actual.subarbolIzq!=null)
                {
                    anterior.subarbolDer=actual.subarbolIzq;
                } 
                else 
                {
                    anterior.subarbolDer=null;
                }
            }
        }     
        return actual;

    }
    public void eliminar(String llaveAEliminar)
    {
        eliminar(llaveAEliminar, this, null, 0);
    }
    
     
    private void eliminar(String llaveAEliminar, arbolBusqueda arbol, arbolBusqueda padre, int subarbol){
        if (arbol.llave == null)
        {
            System.out.println("Llave no encontrada");
        }
        else
        {
            if (llaveAEliminar.compareToIgnoreCase(arbol.llave) < 0)
            {
                if (arbol.subarbolIzq != null)
                {
                    eliminar(llaveAEliminar, arbol.subarbolIzq, arbol, -1);
                }
                //Llave no encontrada
            }
            else if (llaveAEliminar.compareToIgnoreCase(arbol.llave) > 0)
            {
                if (arbol.subarbolDer != null)
                {
                    eliminar(llaveAEliminar, arbol.subarbolDer, arbol, 1);
                }
                //Llave no encontrada
            }
            else
            {
                //Llave encontrada
                if (arbol.subarbolIzq != null)
                {
                    arbolBusqueda mayor = eliminarMayor(arbol.subarbolIzq);
                    if (arbol.subarbolIzq == mayor)
                    {
                        if (subarbol < 0)
                        {
                            padre.subarbolIzq = mayor;
                            mayor.subarbolDer = arbol.subarbolDer;
                        }
                        else if (subarbol > 0)
                        {
                            padre.subarbolDer = mayor;
                            mayor.subarbolDer = arbol.subarbolDer;
                        }
                        else
                        {
                            arbol.llave = mayor.llave;
                            arbol.valor = mayor.valor;
                            arbol.subarbolIzq = mayor.subarbolIzq;
                        }
                    }
                    else
                    {
                        arbol.llave = mayor.llave;
                        arbol.valor = mayor.valor;
                    }
                }
                else if(arbol.subarbolDer != null)
                {
                    arbolBusqueda menor = eliminarMenor(arbol.subarbolDer);
                    if (arbol.subarbolDer == menor)
                    {
                        if (subarbol < 0)
                        {
                            padre.subarbolIzq = menor;
                        }
                        else if (subarbol > 0)
                        {
                            padre.subarbolDer = menor;
                        }
                        else
                        {
                            arbol.llave = menor.llave;
                            arbol.valor = menor.valor;
                            arbol.subarbolDer = menor.subarbolDer;
                        }
                    }
                    else{
                        arbol.llave = menor.llave;
                        arbol.valor = menor.valor;
                    }
                }
                else
                {
                    if (subarbol < 0){
                        padre.subarbolIzq = null;
                    }
                    else if (subarbol > 0)
                    {
                        padre.subarbolDer = null;
                    }
                    else
                    {
                        arbol.llave = null;
                        arbol.valor = null;
                    }
                }
            }
        }
    } 
    public void imprimirEnPreorden(){
        imprimirEnPreorden(this, "");
    }
    
    private void imprimirEnPreorden(arbolBusqueda arbol, String tab)
    {
        if (arbol.llave != null){
            System.out.println(tab + arbol.llave);
        }
        if (arbol.subarbolIzq != null){
            imprimirEnPreorden(arbol.subarbolIzq, tab + "\t");
        }
        if (arbol.subarbolDer != null){
            imprimirEnPreorden(arbol.subarbolDer, tab + "\t");
        }
    }
    
    public Object buscar(String llave,String tb)
    {
        return buscar( this,tb);
    }
    //en orden 
    private Object buscar(arbolBusqueda arbol,String tb)
    {
        if (arbol.subarbolIzq!=null)
        {
            buscar(arbol.subarbolIzq,tb+"\t");
        }
        if(arbol.subarbolDer !=null)
        {
            buscar(arbol.subarbolDer,tb+"\t");
        }
        if(arbol.llave!=null)
        {
            System.out.println(tb+arbol.llave);
        }
        return tb;
    }

}