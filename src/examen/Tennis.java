
package examen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Tennis extends Zapato{
    private double precio;
    private String modelo;
    
     //Las clases hijas estan heredando los atributos de la clase padre
    public Tennis(double talla, String color, String Marca,double precio,String modelo) {
        super(talla, color, Marca);
        this.precio = precio;
        this.modelo = modelo;
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
    @Override
    public void File(String filename) {
        
         //aca escribire en los archivos de texto mediante el fileWriter
   FileWriter escribirArchivo = null;
           try {
               File archivo = new File(filename);//Creando el archivo de texto
               escribirArchivo = new FileWriter(archivo,true); //vamos a ecribir en un archivo
               
               escribirArchivo.write(mostrarDatos());//vamos a añadir el texto del metodo mostrar datos
               escribirArchivo.write(calzar());
               
               
           } catch (IOException ex) {
               System.err.println("Error "+ex);
           } finally {
               try {
                   escribirArchivo.close();
               } catch (IOException ex) {
           
               }
           }
   
  
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

  
    public String mostrarDatos(){//que me muestre los datos del zapato
     return "Datos del tennis"
             + "\nTalla: "+getTalla()+"\nColor: "+getColor()
             + "\nMarca: "+getMarca()+"\nPrecio: "+precio+" $\nModelo: "+modelo+"\n\n";
        
        
        
    }

    @Override
    public String calzar() {
        return super.calzar(); //To change body of generated methods, choose Tools | Templates.
    }

         
    
    
    
    
}
