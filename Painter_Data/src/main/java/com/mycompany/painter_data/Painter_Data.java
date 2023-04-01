/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.painter_data;

/**
 *
 * @author Swirlix
 */
public class Painter_Data {

    public static void main(String[] args) {
        Lista_Doble lista = new Lista_Doble();

        // Agrega valores aleatorios a la lista
        for (int i = 0; i < 10; i++) {
            int valor = (int) (Math.random() * 5);
            lista.agregar(valor);
        }

        // Imprime la lista
        System.out.println("Elementos en la lista: " + lista.length());
        lista.imprimir();

        try {
            // Agrega un valor en la posición 0
            lista.agregarEn(1000, 0);
            lista.insertAt(0, 200);
            // Elimina el primer nodo
            lista.eliminarNodo(8);

            // Busca un valor en la lista
            int buscarVal = lista.buscarVal(2);
            System.out.println("El valor buscado es: " + buscarVal);

            // Imprime la lista actualizada
            System.out.println("Elementos en la lista: " + lista.length());
            lista.imprimir();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
