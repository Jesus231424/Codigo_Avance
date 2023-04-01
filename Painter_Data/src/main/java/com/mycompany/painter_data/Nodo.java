/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.painter_data;

/**
 *
 * @author Swirlix
 */
public class Nodo {

    private int valor;
    private Nodo sig;
    private Nodo prev;

    // constructor
    public Nodo() {
        sig = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.sig = null;
    }
    // Metodos get y set

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
