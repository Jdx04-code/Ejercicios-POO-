
package model;


public class Estudiante {
    private String nombre;
    private String apellido;
    private RepresentanteGrado representante;

    public Estudiante(String nombre, String apellido, RepresentanteGrado representante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.representante = representante;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public RepresentanteGrado getRepresentante() {
        return representante;
    }

    public void setRepresentante(RepresentanteGrado representante) {
        this.representante = representante;
    }
    
    
    
}
