
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import view.*;
import model.*;
/**
 *
 * @author Jose Angarita
 */
public class ControllerRecomendar {
    
    private JFRecomendar frmRecomendar;
    private ControllerUsuario controlUsuario;
    
    public ControllerRecomendar(JFRecomendar frmRecomendar, ControllerUsuario controlUsuario) {
        this.frmRecomendar = frmRecomendar;
        this.controlUsuario=controlUsuario;
        llenarCombo();
        initEvents();
    }

    private void initEvents() {

        this.frmRecomendar.BtnBuscarPorTitulo.addActionListener(e->buscarTitulo());
        this.frmRecomendar.btnBuscarDirector.addActionListener(e->buscarDirector());
        this.frmRecomendar.btnBuscarGenero.addActionListener(e->buscarGenero());
        this.frmRecomendar.btnCalificar.addActionListener(e->agregarCalificacion());
        this.frmRecomendar.btnComentar.addActionListener(e->agregarComentario());
         this.frmRecomendar.btnGenerarRecomendacion.addActionListener(e->generarRecomendacion());
          this.frmRecomendar.btnVisto.addActionListener(e->AgregarPeliculaVista());
           this.frmRecomendar.btnMostrar.addActionListener(e->mostrarTodo());
            this.frmRecomendar.cmbUsuario.addActionListener(e->agregarUsuarios());
            
    }

        private void agregarComentario() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void AgregarPeliculaVista() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void mostrarTodo() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void agregarUsuarios() {
              
        }
            
        public void llenarCombo(){
               ArrayList<Usuario> listaUsuarios= this.controlUsuario.getListaUsuarios();
            DefaultComboBoxModel modelo= new DefaultComboBoxModel();
            for(Usuario u:listaUsuarios){
                    modelo.addElement(u);
            }
            
            this.frmRecomendar.cmbUsuario.setModel(modelo);
        }
                    
       
            
         
        

        
       
    
    

    private void buscarTitulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void buscarDirector() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void buscarGenero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void agregarCalificacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generarRecomendacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    }
    
    

