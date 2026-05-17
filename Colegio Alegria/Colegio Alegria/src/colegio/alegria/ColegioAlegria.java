
package colegio.alegria;
import view.JFRegistrarCandidato;
import controller.*;
public class ColegioAlegria {

    public static void main(String[] args) {
         
        JFRegistrarCandidato registrar = new JFRegistrarCandidato();
        
        ControllerRegistrarCandidato control= new ControllerRegistrarCandidato(registrar);
        registrar.setVisible(true);
        
        
    }
    
}
