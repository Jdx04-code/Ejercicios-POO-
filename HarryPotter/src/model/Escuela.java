/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class Escuela {

    private String nombre;

    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;
    private ArrayList<Locacion> locaciones;

    public Escuela(String nombre) {

        this.nombre = nombre;

        estudiantes = new ArrayList<>();
        profesores = new ArrayList<>();
        locaciones = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e){
        estudiantes.add(e);
    }

    public void agregarProfesor(Profesor p){
        profesores.add(p);
    }

    public void agregarLocacion(Locacion l){
        locaciones.add(l);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Locacion> getLocaciones() {
        return locaciones;
    }

    public void setLocaciones(ArrayList<Locacion> locaciones) {
        this.locaciones = locaciones;
    }
    
}