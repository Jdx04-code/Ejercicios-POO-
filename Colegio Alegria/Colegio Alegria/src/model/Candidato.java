
package model;


public class Candidato {
    
   protected  String nombre;
   protected String apellido;
   protected  String grado;
   protected String lema;
   protected int numeroTarjeton;
   protected int cantidadVotos;

    public Candidato(String nombre, String apellido, String grado, String lema, int numeroTarjeton, int cantidadVotos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.lema = lema;
        this.numeroTarjeton = numeroTarjeton;
        this.cantidadVotos = cantidadVotos;
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

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public int getNumeroTarjeton() {
        return numeroTarjeton;
    }

    public void setNumeroTarjeton(int numeroTarjeton) {
        this.numeroTarjeton = numeroTarjeton;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
   
  public void aumentarVotos(){
   cantidadVotos+=1;
  
  }
   
   
   
   
    
}
