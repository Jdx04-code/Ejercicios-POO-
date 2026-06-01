/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class ClaseMagica {

    private String tema;
    private ArrayList<Estudiante> estudiantes;

    public ClaseMagica(String tema) {

        this.tema = tema;
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e){
        estudiantes.add(e);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
    
}
