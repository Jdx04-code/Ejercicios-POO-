/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.*;

/**
 *
 * @author Jose Angarita
 */
public class ControllerPrincipal {
    
    private JFPrincipal frmPrincipal;
    private JFRecomendar frmRecomendar;
    private JFUsuario frmUsuario;
    private ControllerUsuario controlUsuario;
    private ControllerRecomendar controlRecomendar;

    public ControllerPrincipal(JFPrincipal frmPrincipal) {
        this.frmPrincipal = frmPrincipal;
        this.frmRecomendar = new JFRecomendar();
        this.frmUsuario = new JFUsuario();
        this.controlUsuario = new ControllerUsuario(frmUsuario);
        this.controlRecomendar= new ControllerRecomendar(frmRecomendar);
        initEvents();
    }

    private void initEvents() {

        this.frmPrincipal.btnRecomendar.addActionListener(e->abrirRecomendar());
       this.frmPrincipal.btnRegistrar.addActionListener(e->abrirRegistrar());
    }

    private void abrirRecomendar() {
        
        frmRecomendar.setVisible(true);
        
        
    }

    private void abrirRegistrar() {

        frmUsuario.setVisible(true);


    }
    
    
    
    
    
    
}
