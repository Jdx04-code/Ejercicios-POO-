
package colegio.alegria;
import view.*;
import controller.*;
public class ColegioAlegria {

    public static void main(String[] args) {
         
    JFPrincipal principal = new JFPrincipal();
    ControllerPrincipal control= new ControllerPrincipal(principal);
        principal.setVisible(true);
//        
//        JFRegistrarCandidato registrar= new JFRegistrarCandidato();
//        ControllerRegistrarCandidato controller= new ControllerRegistrarCandidato(registrar);
//        registrar.setVisible(true);
    }
    
}
