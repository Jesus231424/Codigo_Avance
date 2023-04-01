/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.painter_data;

/**
 *
 * @author Swirlix
 */
public class Cliente {

    private String nombre;
    private String tel;
    private String modelo;
    private String tipoRep;
    private String precio;
    private String fechaI;
    private String FechaF;

    public Cliente(String nombre, String tel, String modelo, String tipoRep, String precio, String fechaI, String FechaF) {
        this.nombre = nombre;
        this.tel = tel;
        this.modelo = modelo;
        this.tipoRep = tipoRep;
        this.precio = precio;
        this.fechaI = fechaI;
        this.FechaF = FechaF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoRep() {
        return tipoRep;
    }

    public void setTipoRep(String tipoRep) {
        this.tipoRep = tipoRep;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getFechaF() {
        return FechaF;
    }

    public void setFechaF(String FechaF) {
        this.FechaF = FechaF;
    }

}
