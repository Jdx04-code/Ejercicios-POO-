
package controller;
import java.util.ArrayList;
import javax.swing.border.TitledBorder;
import view.*;
import model.*;

public class ControllerRegistrarCandidato {
    
    private JFRegistrarCandidato frmCandidato;
    private ArrayList<Personero> listaPersoneros;
    private ArrayList<RepresentanteGrado> representante;

    public ControllerRegistrarCandidato(JFRegistrarCandidato registrarCandidato) {
        this.frmCandidato = registrarCandidato;
        this.listaPersoneros = new ArrayList();
        this.representante = new ArrayList();
        initEvents();
    }

    
    public void initEvents(){
        
        this.frmCandidato.btnRegistrar.addActionListener(e->registrar());
        this.frmCandidato.btnMostrar.addActionListener(e->mostrar());
        this.frmCandidato.panelPersonero.setVisible(false);
        habilitarPanel();
    }

    private void registrar() {
       
      String nombre= this.frmCandidato.txtNombre.getText();
      String apellido = this.frmCandidato.txtApellido.getText();
      String grado= this.frmCandidato.txtLema.getText();
      String numeroTarjeton = this.frmCandidato.txtTarjeton.getText();
      String datoExtra= this.frmCandidato.txtDato.getText();
       
      if(nombre.isEmpty() || apellido.isEmpty() || grado.isEmpty() || numeroTarjeton.isEmpty() || datoExtra.isEmpty()){
          this.frmCandidato.areaResults.setText("COMPLETE LOS ESPACIOS");
   
    }
    
      String decision= (String) this.frmCandidato.cmbTipo.getSelectedItem();
        
                if(decision.equals("Personero")){
                        
               }else if(decision.equals("Representante de grado")){
            
                  }
                      
      
      
    
    }

    private void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
    
    private void habilitarPanel(){
        
        if(this.frmCandidato.cmbTipo.getSelectedItem()!=null){
             String decision= (String) this.frmCandidato.cmbTipo.getSelectedItem();
        
             if(decision.equals("Personero")){
            this.frmCandidato.panelPersonero.setVisible(true);
                   }   else if(decision.equals("Representante de grado")){
            this.frmCandidato.lblDato.setText("Formula");
                    ( (TitledBorder)  this.frmCandidato.panelPersonero.getBorder()).setTitle("Representante");
            this.frmCandidato.panelPersonero.repaint();
                  }     
        }        
        
       
        
        
        
    }
    
    
    
    
    
    
    
}
