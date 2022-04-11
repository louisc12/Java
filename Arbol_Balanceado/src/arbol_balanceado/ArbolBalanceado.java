/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_balanceado;

/**
 *
 * @author july
 */

    public class ArbolBalanceado {
   private NodoArbol raiz = new NodoArbol();
    
    public void insertar(String llave, Object valor){
        insertar(llave, valor, raiz);
    }
    
    private String insertar(String llave, Object valor, NodoArbol arbol){
        if (arbol.llave != null){
            if (llave.compareTo(arbol.llave) < 0){
                if (arbol.izq == null){
                    arbol.izq = new NodoArbol();
                    arbol.izq.padre = arbol;
                }
                String camino = insertar(llave, valor, arbol.izq);
                if (!camino.equals("0") && !camino.equals("B")){
                    /* Completar en clase*/
                    
                    actualizarFe(arbol);
                    
                    camino = "I" + camino;
                    if(arbol.fe < -1 || arbol.fe > 1){
                        balancear(arbol,camino);
                        return "B";
                    }
                    
                    return camino;
                }
                else{
                    return "0";
                }
            }
            else if (llave.compareTo(arbol.llave) > 0){
                if (arbol.der == null){
                    arbol.der = new NodoArbol();
                    arbol.der.padre = arbol;
                }
                String camino = insertar(llave, valor, arbol.der);
                if (!camino.equals("0") && !camino.equals("B")){
                    /* Completar en clase*/
                    
                    actualizarFe(arbol);
                    
                    camino = "D" + camino;
                    if(arbol.fe < -1 || arbol.fe > 1){
                        balancear(arbol,camino);
                        return "B";
                    }
                    
                    return camino;
                }
                else{
                    return "0";
                }
            }
            else{
                System.out.println("Llave duplicada");
                return "0";
            }
        }
        else{
            arbol.llave = llave;
            arbol.valor = valor;
            arbol.fe = 0;
            return "";
        }
    }
    
    private void balancear(NodoArbol arbol, String camino){
        String ultimosCaminos = camino.substring(0, 2);
        switch (ultimosCaminos){
            case "II": 
                rotacionII(arbol, arbol.izq);
                break;
            case "DD": 
                rotacionDD(arbol, arbol.der);
                break;
            case "ID":
                rotacionID(arbol, arbol.izq, arbol.izq.der);
                break;
            case "DI":
                rotacionDI(arbol, arbol.der, arbol.der.izq);
                break;
        }
        
    }
    
    private void rotacionII(NodoArbol n, NodoArbol n1){
        n.izq = n1.der;
        if (n1.der != null){
            n1.der.padre = n;
        }
        n1.der = n;
        if (n.padre != null){
            if (n.padre.izq == n){
                n.padre.izq = n1;
            }
            else{
                n.padre.der = n1;
            }
            n1.padre = n.padre;
        }
        else{
            raiz = n1;
            raiz.padre = null;
        }
        n.padre = n1;
    }
    
    private void rotacionDD(NodoArbol n, NodoArbol n1){
        n.der = n1.izq;
        if (n1.izq != null){
            n1.izq.padre = n;
        }
        n1.izq = n;
        if (n.padre != null){
            if (n.padre.izq == n){
                n.padre.izq = n1;
            }
            else{
                n.padre.der = n1;
            }
            n1.padre = n.padre;
        }
        else{
            raiz = n1;
            raiz.padre = null;
        }
        
        n.padre = n1;
        
    }
    
    private void rotacionID(NodoArbol n, NodoArbol n1, NodoArbol n2){
        
        n.izq = n2.der;
        if (n2.der != null){
            n2.der.padre = n;
        }
        n2.der = n;
        
        n1.der = n2.izq;
        if (n2.izq != null){
            n2.izq.padre = n1;
        }
        n2.izq = n1;
        
        if (n.padre != null){
            if (n.padre.izq == n){
                n.padre.izq = n2;
            }
            else{
                n.padre.der = n2;
            }
            n2.padre = n.padre;
        }
        else{
            raiz = n2;
            raiz.padre = null;
        }
        n.padre = n2;
        n1.padre = n2;
    }
    
    private void rotacionDI(NodoArbol n, NodoArbol n1, NodoArbol n2){
        n.der = n2.izq;
        if (n2.izq != null){
            n2.izq.padre = n;
        }
        n2.izq = n;
        
        n1.izq = n2.der;
        if (n2.der != null){
            n2.der.padre = n1;
        }
        n2.der = n1;
        
        
        
        if (n.padre != null){
            if (n.padre.izq == n){
                n.padre.izq = n2;
            }
            else{
                n.padre.der = n2;
            }
            n2.padre = n.padre;
        }
        else{
            raiz = n2;
            raiz.padre = null;
        }
        
        n.padre = n2;
        n1.padre = n2;
        
        
        
    }
    
    public void imprimirEnPreorden(){
        imprimirEnPreorden(raiz, "");
    }
    
    private void imprimirEnPreorden(NodoArbol arbol, String tab){
        if (arbol.llave != null){
            System.out.println(tab + arbol.llave);
        }
        if (arbol.izq != null){
            imprimirEnPreorden(arbol.izq, tab + "\t");
        }
        if (arbol.der != null){
            imprimirEnPreorden(arbol.der, tab + "\t");
        }
    }
    
    
    private void actualizarFe(NodoArbol arbol){
        int altIzq = 0;
        int altDer = 0;
        if (arbol.izq != null){
            altIzq = altura(arbol.izq);
        } 
        if (arbol.der != null){
            altDer = altura(arbol.der);
        }
        arbol.fe = altDer - altIzq;
    }
    
    
    
    private int altura(NodoArbol arbol){
        int altIzq = 0;
        int altDer = 0;
        if (arbol.izq != null){
            altIzq = altura(arbol.izq);
        }
        if (arbol.der != null){
            altDer = altura(arbol.der);
        }
        if (altIzq > altDer){
            return altIzq + 1;
        }
        return altDer + 1;
    }
    
    
    public void imprimirEnorden(){
        imprimirEnorden(raiz, "");
    }
    
    private void imprimirEnorden(NodoArbol arbol, String tab){
        
        if (arbol.izq != null){
            imprimirEnorden(arbol.izq, tab + "\t");
        }
        if (arbol.llave != null){
            System.out.println(tab + arbol.llave);
        }
        if (arbol.der != null){
            imprimirEnorden(arbol.der, tab + "\t");
        }
    }
    }
   
    
    class NodoArbol{
    String llave;
    public Object valor;
    public int fe;
    public NodoArbol izq;
    public NodoArbol der;
    public NodoArbol padre;
}


