/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.painter_data;

/**
 *
 * @author Swirlix
 */
public class Lista_Doble {

    private Nodo inicio; //nodo raiz 
    private Nodo fin;
    private int contNodos;

    //asegurarnos que al crear la lista
    // inicio sea null
    public Lista_Doble() {

        inicio = null;
        fin = null;
    }
    // agregar un nodo al final de la lista; 
    //BIG-OH N2 Con agregar ciclo  
    //O (1) > agregar un nodo al final de la lista

    public void agregar(int Valor) {

        Nodo nuevo = new Nodo(Valor);
        //verificar si la lista tiene nodos
        if (inicio == null) { // no hay nodos en la lista (vacia) 
            inicio = nuevo;
            fin = nuevo;
        } else { //cada nuevo nodo, debemos recorrer
            //todos los nodos previos
            // lista: 
            // N x (N - 1) = N cuadrada + 1 
            /* Nodo temp= inicio; 
             while(temp.getSig()!= null){
             temp = temp.getSig();
             }
             temp.setSig(nuevo); //conectamos el nuevo nodo */
            // conectamos el nuevo nodo
            fin.setSig(nuevo);
            // movemos a fin al final de la lista 
            fin = nuevo;
        }
        contNodos++;
    }

    //O(N)
    public void imprimir() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSig();
        }
        System.out.println("");
    }

    public void imprimirInv() {
        Nodo temp = fin;
        while (temp != null) {
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSig();
        }
        System.out.println("");
    }
    //O(N)

    public int length() {
        int contNodos = 0; // Inicializar el contador en 0
        Nodo temp = inicio;
        while (temp != null) {
            contNodos++; // Incrementar el contador por cada nodo
            temp = temp.getSig(); // Avanzar al siguiente nodo
        }
        return contNodos;
    }
    // O(1) 

    public boolean listaVacia() {
        boolean resu = true;
        if (inicio != null) {
            resu = false;
        }
        return resu;
    }
    //  O(1)

    public Nodo vaciarLista() {
        contNodos = 0;
        inicio = null;
        fin = null;
        return null;

    }
//O(N) 

    public void agregarEn(int valor, int posi) throws Exception {
        int noNodo = length(); // obtiene la cantidad de nodos
        if ((posi >= 0) && (posi < noNodo)) { // verifica que la posición sea válida
            Nodo nuevo = new Nodo(valor); // crea el nuevo nodo con el valor indicado
            if ((posi == 0)) { // caso especial para insertar al inicio
                nuevo.setSig(inicio);
                inicio.setPrev(nuevo);
                inicio = nuevo;
            } else {
                Nodo temp = inicio;
                for (int i = 0; i < posi - 1; i++) { // mueve el nodo temporal a la posición previa a la de inserción
                    temp = temp.getSig();
                }
                nuevo.setSig(temp.getSig()); // conecta el nuevo nodo al siguiente nodo después del temporal
                temp.getSig().setPrev(nuevo); // conecta el siguiente nodo al nuevo nodo
                temp.setSig(nuevo); // conecta el temporal al nuevo nodo
            }
            contNodos++; // incrementa el contador de elementos de la lista
        } else {
            throw new Exception(posi + " no es una posición de inserción válida.");
        }
    }

    public void eliminarNodo(int posi) throws Exception {
        int noNodo = length(); //Verificar si la posicion cabe en la lista
        // posicion de borrado rapida
        if ((posi >= 0) && (posi < noNodo)) {
            if (noNodo == 1) {
                vaciarLista();
            } else {
                //1. hay que moverse hasta posi - 1
                Nodo temp = inicio;
                for (int i = 0; i < posi - 1; i++) {
                    temp = temp.getSig();
                    contNodos++;
                }

                //2. hay que reconectar
                Nodo sig = temp.getSig();
                temp.setSig(sig.getSig());
                // 3. si borramos el último nodo, mover el nodo fin
                if (temp.getSig() == null) { // si el siguiente nodo es nulo, entonces el nodo anterior era el último nodo de la lista
                    fin = temp;
                }
                contNodos--;
            }
        } else {
            throw new Exception(posi + "  no es una posicion de insercion valida!! ☺ ");
        }

    }
//O(N) 

    public int buscarVal(int valor) {
        int posi = -1;
        Nodo temp = inicio;
        while (temp != null) {
            posi++;
            if (temp.getValor() == valor) {
                System.out.println("El valor " + valor + " se encontro en la posicion " + posi + " de la lista. ☺");
                return posi; // Si se encuentra el valor, retornar su posición
            }
            temp = temp.getSig(); // Avanzar al siguiente nodo
        }
        System.out.println("El valor " + valor + " no se encontro en la lista. ☺");
        return -1; // Si no se encuentra el valor, retornar -1
    }

    public int leerValor(int posi) throws Exception {
        int noNodo = length(); // Verificar si la posicion cabe en la lista
        // posicion de borrado rapida
        if ((posi >= 0) && (posi < noNodo)) {
            // 1. hay que moverse hasta posi - 1
            Nodo temp = inicio;
            int cont = 0;
            while (cont < posi) {
                temp = temp.getSig();
                cont++;
            }
            // 2. se retorna el valor del nodo en la posicion 'posi'
            return temp.getValor();
        } else {
            throw new Exception(posi + " no es una posicion de insercion valida!! ☺");
        }
    }

    public void insertAt(int posicion, int valor) {
        if (posicion < 0 || posicion > contNodos) {
            throw new IndexOutOfBoundsException("Índice inválido: " + posicion);
        }
        Nodo nuevoNodo = new Nodo(valor);
        if (posicion == 0) {
            // Insertar en la primera posición
            if (inicio == null) {
                // La lista está vacía, el nuevo nodo será el único nodo
                inicio = nuevoNodo;
                fin = nuevoNodo;
            } else {
                // La lista no está vacía, insertar el nuevo nodo al inicio
                nuevoNodo.setSig(inicio);
                inicio.setPrev(nuevoNodo);
                inicio = nuevoNodo;
            }
        } else if (posicion == contNodos) {
            // Insertar en la última posición
            fin.setSig(nuevoNodo);
            nuevoNodo.setPrev(fin);
            fin = nuevoNodo;
        } else {
            // Insertar en una posición intermedia
            Nodo temp = inicio;
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSig();
            }
            Nodo siguiente = temp.getSig();
            nuevoNodo.setSig(siguiente);
            siguiente.setPrev(nuevoNodo);
            nuevoNodo.setPrev(temp);
            temp.setSig(nuevoNodo);
        }
        contNodos++;
    }

}
