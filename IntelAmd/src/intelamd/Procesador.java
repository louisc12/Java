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
public class Procesador {
    
    String Marca;
    int Estado;

    public Procesador(String Marca, int Estado) {
        this.Marca = Marca;
        this.Estado = Estado;
    }

    public Procesador() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }
    
    
}
