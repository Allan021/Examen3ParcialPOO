
package examen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Chinela extends Zapato{  
  private double precio;
  private String material;

  
  //Las clases hijas estan heredando los atributos de la clase padre
    public Chinela(double precio, String material, double talla, String color, String Marca) {
        super(talla, color, Marca);
        this.precio = precio;
        this.material = material;
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
    @Override
    public void File(String filename) {
       
       
        
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

      public String mostrarDatos(){//que me muestre los datos del zapato
     return "Datos de la Chinela"
             + "\nTalla: "+getTalla()+"\nColor: "+getColor()
             + "\nMarca: "+getMarca()+"\nPrecio: "+precio+" $\nMaterial: "+material+"\n\n";
        
        
        
    }

    @Override
    public String calzar() {
        return super.calzar(); 
    }

    
    
    
    
  
  
    
}
