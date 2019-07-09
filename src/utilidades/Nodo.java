/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Deportista;

/**
 *
 * @author User_1
 */
public class Nodo {
    private Deportista deportista;
    private Nodo ant;
    private Nodo sig;
    
    public Nodo(Deportista deportista) {
        this.deportista = deportista;
    }
    
    public Nodo(Deportista deportista, Nodo sig) {
        this.deportista = deportista;
        this.sig = sig;
    }
    
    public Deportista getDeportista() {
        return deportista;
    }
    
    public void setDato(Deportista deportista) {
        this.deportista = deportista;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
