
package examen;
/*
Utilizando clases y empleando herencia realizar.

Un programa para el inventario de una tienda de zapatos. Está tendrá una clase padre, llamada zapato, este tendrá una propiedad talla (si desea le puede agregar más propiedades)

De ella heredarán 3 clases, ustede definirá los nombres y propiedades de las clases hijas.

La clase padre tendrá un metodo abstracto que implementará polimorfismo, dicho metodo será

void 2File(fileName), este metodo guardará las propiedades de este objeto en un archivo de texto.

La clase padre implementará un metodo String calzar(), devolverá la frase "Que bien me quedan estos NOMBRECLASE que son talla TALLA"

 

En el main..

Se le preguntará al usuario que tipo de zapato quiere agregar y segun el tipo le pedirá las cualidades, por cada tipo de zapato, se creará una instancia del objeto, la cual se guardará en un arraylist. 

Esto se repetirá hasta el que el usuario desee terminar de crear los zapatos. cuando el usuario decida terminar la ejecucion, se llamará el metodo 2file, para que guarde cada instancia del objeto en un archivo con el nombre que se le dio al zapato.

 

Se puede utilizar la clase de manejo de archivos que le pasé.

 

Se subirá el examen a su repositorio con el nombre examen3poo, aqui me pondrán el link de su repositorio.
*/

import java.io.File;
import java.util.Scanner;


public abstract class  Zapato{//clase padre zapato y de esta clase se heredara todo
   private String nombre; 
    //Atributos
   private double talla;//esta seria la talla del  zapato
   private String color;
   private String Marca;
  

   //este constructor estara en las clases hijas
    public Zapato(double talla, String color, String Marca) {
        this.talla = talla;
        this.color = color;
        this.Marca = Marca;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public abstract void File(String filename);

    public String calzar() {
        return "\nQue bien me quedaran estos "+nombre+" talla "+talla+"\n\n";
    }

    
}
