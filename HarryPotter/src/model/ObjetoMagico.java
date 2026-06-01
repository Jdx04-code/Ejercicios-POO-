/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jose Angarita
 */
public class ObjetoMagico {

    private String nombre;
    private String proposito;
    private int nivelObjeto;

    public ObjetoMagico(String nombre,
            String proposito,
            int nivelObjeto) {

        this.nombre = nombre;
        this.proposito = proposito;
        this.nivelObjeto = nivelObjeto;
    }

    public String getNombre() {
        return nombre;
    }
}