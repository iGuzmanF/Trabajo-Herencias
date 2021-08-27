/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.clase.herencias;

import edu.ujmd.clases.Atleta;

import edu.ujmd.clases.Boxeador;

/**
 *
 * @author chele
 */
public class TrabajoDeClaseHerencias {

public static void main(String[] args) {
        Atleta Atleta1 = new Atleta();
        Atleta1.MostrarDatos();
        Atleta1.IngresarDatos();     
        
        Boxeador Boxeador = new Boxeador();
        Boxeador.MostrarDatos();
        Boxeador.IngresarDatos();      
    }   
}
