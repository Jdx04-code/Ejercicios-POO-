
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import view.*;
import model.*;
/**
 *
 * @author Jose Angarita
 */
public class ControllerRecomendar {
    
    private JFRecomendar frmRecomendar;
    private ControllerUsuario controlUsuario;
    private ControllerComentar controlComentar;
    private JFComentar frmComentar;
    private JFPelicula frmPelicula;
    private ControllerPelicula controlPelicula;
    private JFCalificar frmCalificar;
    private ControllerCalificar controlCalificar;
    
    public ControllerRecomendar(JFRecomendar frmRecomendar, ControllerUsuario controlUsuario, ControllerPelicula controlPelicula) {
        this.frmRecomendar = frmRecomendar;
        this.controlUsuario=controlUsuario;
       this.frmComentar= new JFComentar();
       this.frmPelicula= new JFPelicula();
       this.frmCalificar= new JFCalificar();
       this.controlPelicula= controlPelicula;
       this.controlComentar= new ControllerComentar(frmComentar, controlUsuario, controlPelicula,this);
       this.controlCalificar= new ControllerCalificar(frmCalificar, controlPelicula, controlUsuario, this);
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
            this.frmRecomendar.cmbUsuario.addActionListener(e->agregarPeliculas());
//            this.frmRecomendar.btnVerDetalles.addActionListener(e->verDetalles());
            this.frmRecomendar.tablePeliculas.getSelectionModel().addListSelectionListener(e -> verDetalles());


    }

       

      

public void agregarPeliculas() {

    Usuario user =
    (Usuario) this.frmRecomendar
            .cmbUsuario
            .getSelectedItem();

    ArrayList<Pelicula> listaPeliculas =
            user.getHistorialVisualizacion();

    DefaultTableModel modelo =
    (DefaultTableModel) this.frmRecomendar
            .tablePeliculas
            .getModel();

    modelo.setRowCount(0);

    for(Pelicula p : listaPeliculas){

        modelo.addRow(new Object[]{

            p.getNombre(),
            p.getGenero(),
            p.getDuracion(),
            p.getCalificacionPromedio(),
            p.getListaDeComentarios().size(),
            p.getDirector(),
            p.getAnio()

        });

    }

}
            
        public void llenarCombo(){
               ArrayList<Usuario> listaUsuarios= this.controlUsuario.getListaUsuarios();
            DefaultComboBoxModel modelo= new DefaultComboBoxModel();
            for(Usuario u:listaUsuarios){
                    modelo.addElement(u);
            }
            
            this.frmRecomendar.cmbUsuario.setModel(modelo);
        }
                    
       
       private void mostrarTodo() {

           ArrayList<Pelicula> listaPelicula= controlPelicula.getListaPeliculas();
           
           DefaultTableModel modelo =
    (DefaultTableModel) this.frmRecomendar
            .tablePeliculas
            .getModel();

    modelo.setRowCount(0);

       for(Pelicula p : listaPelicula){

        modelo.addRow(new Object[]{

            p.getNombre(),
            p.getGenero(),
            p.getDuracion(),
            p.getCalificacionPromedio(),
            p.getListaDeComentarios().size(),
            p.getDirector(),
            p.getAnio()

        });

    }
       
       
       
       }       
         
     private void buscarTitulo() {

           String busqda= frmRecomendar.txtBuscar.getText();
           
           if(busqda.isEmpty()){
              this.frmRecomendar.areaRecomendacion.setText("PARA BUSCAR, COMPLETE EL ESPACIO DE BUSQUEDA");
              this.frmRecomendar.areaRecomendacion.setBorder(new TitledBorder("Aviso"));
              return;
           }
           
           boolean encontrada=false;
           ArrayList<Pelicula> listaPelicula= controlPelicula.getListaPeliculas();
           for(Pelicula p:listaPelicula){
               if(p.getNombre().toLowerCase().contains(busqda.toLowerCase())){
                    DefaultTableModel modelo = (DefaultTableModel) this.frmRecomendar .tablePeliculas .getModel();
                    modelo.setRowCount(0);
                       modelo.addRow(new Object[]{

                         p.getNombre(),
                          p.getGenero(),
                         p.getDuracion(),
                         p.getCalificacionPromedio(),
                         p.getListaDeComentarios().size(),
                         p.getDirector(),
                        p.getAnio()

                        });                   
                   encontrada=true;
               }
           }
           
           if(encontrada!=true){
               this.frmRecomendar.areaRecomendacion.setBorder(new TitledBorder("Aviso"));
               this.frmRecomendar.areaRecomendacion.setText("NO HAY NINGUNA PELICULA CON ESE TITULO");
               return;
           }
           
           
           }

         private void buscarDirector() {

         String busqda= frmRecomendar.txtBuscar.getText();
          DefaultTableModel modelo = (DefaultTableModel) this.frmRecomendar .tablePeliculas .getModel();
          
           if(busqda.isEmpty()){
              this.frmRecomendar.areaRecomendacion.setText("PARA BUSCAR, COMPLETE EL ESPACIO DE BUSQUEDA");
              this.frmRecomendar.areaRecomendacion.setBorder(new TitledBorder("Aviso"));
              return;
           }
           modelo.setRowCount(0);
           
           boolean encontrada=false;
           ArrayList<Pelicula> listaPelicula= controlPelicula.getListaPeliculas();
           for(Pelicula p:listaPelicula){
               if(p.getDirector().toLowerCase().contains(busqda.toLowerCase())){
                    
                        
                       modelo.addRow(new Object[]{

                         p.getNombre(),
                          p.getGenero(),
                         p.getDuracion(),
                         p.getCalificacionPromedio(),
                         p.getListaDeComentarios().size(),
                         p.getDirector(),
                        p.getAnio()

                        });                   
                   encontrada=true;
               }
           }
           
           if(encontrada!=true){
               this.frmRecomendar.areaRecomendacion.setBorder(new TitledBorder("Aviso"));
               this.frmRecomendar.areaRecomendacion.setText("NO HAY NINGUN DIRECTOR CON ESE NOMBRE");
               return;
           }
         
         
         
         }

        private void buscarGenero() {

             Genero busqda=Genero.valueOf(frmRecomendar.txtBuscar.getText().toUpperCase());
             DefaultTableModel modelo = (DefaultTableModel) this.frmRecomendar .tablePeliculas .getModel();
           
           if(busqda==null ){
              this.frmRecomendar.areaRecomendacion.setText("PARA BUSCAR, COMPLETE EL ESPACIO DE BUSQUEDA");
              this.frmRecomendar.areaRecomendacion.setBorder(new TitledBorder("Aviso"));
              return;
           }
           modelo.setRowCount(0);
           
           boolean encontrada=false;
           ArrayList<Pelicula> listaPelicula= controlPelicula.getListaPeliculas();
           for(Pelicula p:listaPelicula){
               
               if(p.getGenero()  == busqda){
                   
                   
                    modelo.addRow(new Object[]{

                         p.getNombre(),
                          p.getGenero(),
                         p.getDuracion(),
                         p.getCalificacionPromedio(),
                         p.getListaDeComentarios().size(),
                         p.getDirector(),
                        p.getAnio()

                        });         
                   
                   
                   
                         encontrada=true;

                       }
    
               }
           
           
           if(encontrada!=true){
               this.frmRecomendar.areaRecomendacion.setBorder(new TitledBorder("Aviso"));
               this.frmRecomendar.areaRecomendacion.setText("NO HAY NINGUN GENERO DE ESE TIPO");
               return;
           }




        } 

        
       
    
    



    private void agregarCalificacion() {

        frmCalificar.setVisible(true);
         controlCalificar.llenarComboUsuarios();
         controlCalificar.llenarComboPeliculas();
    }
    
     private void agregarComentario() {

            frmComentar.setVisible(true);
            controlComentar.llenarComboPeliculas();
            controlComentar.llenarComboUsuarios();


        }

        private void AgregarPeliculaVista() {
            
            Usuario u= (Usuario)this.frmRecomendar.cmbUsuario.getSelectedItem();
            
             ArrayList<Pelicula> listaPelicula= controlPelicula.getListaPeliculas();
       Pelicula p=null;
       int fila= this.frmRecomendar.tablePeliculas.getSelectedRow();
     String nombre ="";

      if(fila != -1){

                  nombre = frmRecomendar.tablePeliculas.getValueAt(fila, 0) .toString();
                  for(Pelicula p1:listaPelicula){
                      
                      if(p1.getNombre().equals(nombre)){
                          p=p1;
                      }
                  }
                  u.getHistorialVisualizacion().add(p);
                  
      }






        }

    private void generarRecomendacion() {

        Usuario u= (Usuario)this.frmRecomendar.cmbUsuario.getSelectedItem();
           
         ArrayList<Pelicula> listaPelicula= u.getHistorialVisualizacion();



    }

    private void verDetalles() {

       ArrayList<Pelicula> listaPelicula= controlPelicula.getListaPeliculas();
       Pelicula p=null;
       int fila= this.frmRecomendar.tablePeliculas.getSelectedRow();
     String nombre ="";

      if(fila != -1){

                  nombre = frmRecomendar.tablePeliculas.getValueAt(fila, 0) .toString();
                  for(Pelicula p1:listaPelicula){
                      
                      if(p1.getNombre().equals(nombre)){
                          p=p1;
                      }
                  }
                   this.frmRecomendar.areaRecomendacion.setBorder(new TitledBorder("DETALLES"));
               this.frmRecomendar.areaRecomendacion.setText(p.toString2());
               return;
        }else{
          this.frmRecomendar.areaRecomendacion.setBorder(new TitledBorder("AVISO"));
               this.frmRecomendar.areaRecomendacion.setText("NO SE ENCONTRO LA PELICULA");
               return;
      }

    

    }

    
    
    
    
    
    }
    
    

