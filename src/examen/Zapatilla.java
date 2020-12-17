
package examen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Zapatilla extends Zapato {
       private double precio;

       
        //Las clases hijas estan heredando los atributos de la clase padre
    public Zapatilla(double talla, String color, String Marca,Double precio) {
        super(talla, color, Marca);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
    public String calzar() {
        return super.calzar(); //To change body of generated methods, choose Tools | Templates.
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
     return "Datos de la Zapatilla"
             + "\nTalla: "+getTalla()+"\nColor: "+getColor()
             + "\nMarca: "+getMarca()+"\nPrecio: "+precio+" $\n\n";
        
   
    }
    
    
    
   
    
}
