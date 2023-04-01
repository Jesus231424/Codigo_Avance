/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.painter_data;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Swirlix
 */
public class Archivo {

    File archivo;

    public void crearArchivo() throws IOException {
        try {
            archivo = new File("Datoscontacto.txt");
            if (archivo.createNewFile());
            {
                JOptionPane.showMessageDialog(null, "Archivo Creado ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void escribirEnArchivo(Cliente Cliente) {
        try {
            FileWriter escritura = new FileWriter(archivo, true);
            escritura.write(Cliente.getNombre() + "%" + Cliente.getTel() + "%" + Cliente.getModelo() + "%" + Cliente.getTipoRep() + "%" + Cliente.getPrecio() + "%" + Cliente.getFechaI() + "%" + Cliente.getFechaF());
            escritura.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
