/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jose Angarita
 */
public class Locacion {

    private String id;
    private String nombre;
    private String secreto;
    private boolean descubierto;

    public Locacion(String id,
            String nombre,
            String secreto) {

        this.id = id;
        this.nombre = nombre;
        this.secreto = secreto;
        this.descubierto = false;
    }

    public void revelarSecreto(){
        descubierto = true;
    }
}