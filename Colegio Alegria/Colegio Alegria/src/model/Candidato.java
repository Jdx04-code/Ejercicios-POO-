
package model;


public class Candidato {
    
   protected  String nombre;
   protected String apellido;
   protected  String grado;
   protected String lema;
   protected String numeroTarjeton;
   protected int cantidadVotos;

    public Candidato(String nombre, String apellido, String grado, String lema, String numeroTarjeton) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.lema = lema;
        this.numeroTarjeton = numeroTarjeton;
        this.cantidadVotos = 0;
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

    public String getNumeroTarjeton() {
        return numeroTarjeton;
    }

    public void setNumeroTarjeton(String numeroTarjeton) {
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

    @Override
    public String toString() {
        return "Candidato{" + "nombre=" + nombre + ", apellido=" + apellido + ", grado=" + grado + ", lema=" + lema + ", numeroTarjeton=" + numeroTarjeton + ", cantidadVotos=" + cantidadVotos + '}';
    }
   
   
   
   
    
}
