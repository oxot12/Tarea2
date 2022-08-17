/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Escritorio_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.awt.Color;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;
import static Java_Escritorio_2.Cadenas_Murcielagos.txta_pantalla1;

/**
 *
 * @author Oseas Xt
 */
public class file {
    private JFileChooser accion = null;
    private java.io.File archivo = null;
    private Cadenas_Murcielagos Cadenas_Murcielagos;
    public static String ruta = "C:\\Users\\Oseas Xt\\Documents\\NetBeansProjects\\Proyecto2";
    
     static Path fileName = Path.of("C:\\Users\\Oseas Xt\\Documents\\NetBeansProjects\\Proyecto2");
    
    public static void insert(String s)
        throws IOException 
    {   
        String d = "\r\n";
        Files.writeString(fileName, d,StandardOpenOption.APPEND);
        //Files.writeString(fileName, s);
        Files.writeString(fileName, s,StandardOpenOption.APPEND);
        
    }
    
     public void LeerFichero(Cadenas_Murcielagos Cadenas_Murcielagos) {
        this.Cadenas_Murcielagos = Cadenas_Murcielagos;

        accion = new JFileChooser();
        accion.setFileSelectionMode(0);
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("TXT", "txt");
        accion.setFileFilter(filtroImagen);
        accion.setDialogTitle("Abrir archivo");
        if (accion.showOpenDialog(Cadenas_Murcielagos) == JFileChooser.APPROVE_OPTION) {
            archivo = accion.getSelectedFile();
            ruta = accion.getSelectedFile().toString();
            try {
                /*Si existe el fichero*/
                if (archivo.exists()) {
                    try ( /*Abre un flujo de lectura a el fichero*/ BufferedReader leeArchivo = new BufferedReader(new FileReader(archivo))) {
                        String Slinea, datos = "";
                        /*Lee el fichero linea a linea hasta llegar a la ultima*/
                        while ((Slinea = leeArchivo.readLine()) != null) {
                            /*Imprime la linea leida*/
                            datos = datos + Slinea + "\n";
                        }   Cadenas_Murcielagos.txta_pantalla1.setText("");
                        Cadenas_Murcielagos.txta_pantalla1.setText(datos);
                        Cadenas_Murcielagos.txta_pantalla1.setEditable(true);
                        Cadenas_Murcielagos.txta_pantalla1.requestFocus();
                        Cadenas_Murcielagos.txta_pantalla1.setForeground(Color.black);
                        /*Cierra el flujo*/
                    }
                    this.Cadenas_Murcielagos.abrioArchivo = true;
                    this.Cadenas_Murcielagos.creoNuevo = false;
                } else {
                    System.out.println("Fichero No Existe");
                }
            } catch (IOException ex) {
                /*Captura un posible error y le imprime en pantalla*/
                System.out.println(ex.getMessage());
            }
        }
    }
    
  public void CrearFicheroNuevo(Cadenas_Murcielagos Cadenas_Murcielagos, String SCadena, String nombre) {
        this.Cadenas_Murcielagos = Cadenas_Murcielagos;

        accion = new JFileChooser();
        accion.setFileSelectionMode(0);
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("TXT", "txt");
        accion.setFileFilter(filtroImagen);
        accion.setDialogTitle("Guardar archivo " + nombre);
        accion.setSelectedFile(new java.io.File(nombre));
        if (accion.showSaveDialog(Cadenas_Murcielagos) == JFileChooser.APPROVE_OPTION) {
            ruta = accion.getSelectedFile().toString();
            archivo = new java.io.File(ruta);
            try {
                //Si Existe el fichero lo borra
                if (archivo.exists()) {
                    archivo.delete();
                }
                BufferedWriter wr = new BufferedWriter(new FileWriter(archivo));
                FileWriter escribirArchivo = new FileWriter(archivo, true);
                BufferedWriter buffer = new BufferedWriter(escribirArchivo);
                buffer.write(SCadena);
                buffer.newLine();
                buffer.close();
                wr.close();
                escribirArchivo.close();

                this.Cadenas_Murcielagos.abrioArchivo = true;
                this.Cadenas_Murcielagos.creoNuevo = false;
            } catch (IOException ex) {
            }
        }
    }
     
      public void GuardarFichero(String SCadena, String nombre) {

        System.out.println(ruta);
        archivo = new java.io.File(ruta);
        try {
            //Si Existe el fichero lo borra
            if (archivo.exists()) {
                archivo.delete();
            }
            BufferedWriter wr = new BufferedWriter(new FileWriter(archivo));
            FileWriter escribirArchivo = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escribirArchivo);
            buffer.write(SCadena);
            buffer.newLine();
            buffer.close();
            wr.close();
            escribirArchivo.close();
        } catch (IOException ex) {
            //Captura un posible error le imprime en pantalla 
            System.out.println(ex.getMessage());
        }
}
}
