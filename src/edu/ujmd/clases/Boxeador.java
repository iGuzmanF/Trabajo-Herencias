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
public class Boxeador extends Atleta {

    private String Categoria;
    private Double Peso;
    private String Derrotas;
    private String Victorias;
    private String KO;

    public Boxeador() {
    }

    public String getDerrotas() {
        return Derrotas;
    }

    public void setDerrotas(String Derrotas) {
        this.Derrotas = Derrotas;
    }

    public String getVictorias() {
        return Victorias;
    }

    public void setVictorias(String Victorias) {
        this.Victorias = Victorias;
    }

    public String getKO() {
        return KO;
    }

    public void setKO(String KO) {
        this.KO = KO;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double Peso) {
        this.Peso = Peso;
    }
    
    public void mostrar2() {
        MostrarDatos();
        JOptionPane.showMessageDialog(null, Peso + Categoria);
    }

    public void ingreso2() {
        IngresarDatos();
        Categoria = JOptionPane.showInputDialog("Ingrese Categoria");
        String s = JOptionPane.showInputDialog("Ingrese Peso");
        this.setPeso(Double.parseDouble(s));
    }
}