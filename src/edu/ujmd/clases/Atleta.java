/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.clases;

import javax.swing.JOptionPane;

/**
 *
 * @author chele
 */
public class Atleta {

    String Nombre;
    private String Apellido;
    int Edad;
    private String Deporte;
    private String Direccion;
    private String Genero;

    public Atleta() {
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        this.Genero = genero;
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String Deporte) {
        this.Deporte = Deporte;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

     public void MostrarDatos() {
        JOptionPane.showConfirmDialog(null, Nombre + Apellido+Edad+Deporte +Direccion);
    }
    public void IngresarDatos() {
        Nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
        Apellido = JOptionPane.showInputDialog("Ingrese el Apellido"); 
        Deporte = JOptionPane.showInputDialog("Ingrese el Deporte"); 
        Direccion = JOptionPane.showInputDialog("Ingrese el direccion");
    }
}
