
package controller;
import java.util.ArrayList;
import javax.swing.border.TitledBorder;
import view.*;
import model.*;

public class ControllerRegistrarCandidato {
    
    private JFRegistrarCandidato frmCandidato;
    private ArrayList<Candidato> listaCandidatos;
   

    public ControllerRegistrarCandidato(JFRegistrarCandidato registrarCandidato) {
        this.frmCandidato = registrarCandidato;
        this.listaCandidatos = new ArrayList();
        initEvents();
    }

    
    public void initEvents(){
        
        this.frmCandidato.btnRegistrar.addActionListener(e->registrar());
        this.frmCandidato.btnMostrar.addActionListener(e->mostrar());
        this.frmCandidato.btnActualizar.addActionListener(e->habilitarPanel());
        this.frmCandidato.panelPersonero.setVisible(false);
        this.frmCandidato.btnAñadirDato.addActionListener(e->registrarDatoExtra());
        
    }

    private void registrar() {
       
      String nombre= this.frmCandidato.txtNombre.getText();
      String apellido = this.frmCandidato.txtApellido.getText();
      String grado= this.frmCandidato.txtGrado.getText();
      String lema= this.frmCandidato.txtLema.getText();
      String numeroTarjeton = this.frmCandidato.txtTarjeton.getText();
      
      
       
     
    
      String decision= (String) this.frmCandidato.cmbTipo.getSelectedItem();
                    
                if(decision.equals("Personero")){
                    
                            Mascota m= (Mascota) this.frmCandidato.cmbDatoExtra.getSelectedItem();
                    
                    
                         if(nombre.isEmpty() || apellido.isEmpty() || grado.isEmpty() || lema.isEmpty() || numeroTarjeton.isEmpty() || m==null){
                              this.frmCandidato.areaResults.setText("COMPLETE LOS ESPACIOS");
   
                            }
                         
                       
                    
                       Personero p= new Personero( nombre, apellido, grado, lema, numeroTarjeton,m);


               }else if(decision.equals("Representante de grado")){
            
                  }
                      
      
      
    
    }

    private void mostrar() {
      
    }
            
    
    private void habilitarPanel(){
        
        if(this.frmCandidato.cmbTipo.getSelectedItem()!=null){
             String decision= (String) this.frmCandidato.cmbTipo.getSelectedItem();
        
             System.out.println(decision);
             if(decision.equals("Personero")){
            this.frmCandidato.panelPersonero.setVisible(true);
                   }   else if(decision.equals("Representante de grado")){
            this.frmCandidato.lblDato.setText("Formula");
                    ( (TitledBorder)  this.frmCandidato.panelPersonero.getBorder()).setTitle("Representante");
            this.frmCandidato.panelPersonero.repaint();
                  }     
        }        
        
       
        
        
        
    }

    private void registrarDatoExtra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
    
    
    
    
    
}
