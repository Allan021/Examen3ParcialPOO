
package examen;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //aca se hara toda la logica de la aplicacion
        menu(entrada);
        
    }
    
    
    public static void menu(Scanner entrada){//mandandole la clase Scanner
        
        //Declarando los arraylist que iran en los objetos
        
         ArrayList<Tennis> listatenis = new  ArrayList<Tennis>();
        ArrayList<Chinela> listaChinelas = new  ArrayList<Chinela>();
        ArrayList<Zapatilla> listaZapatilla = new  ArrayList<Zapatilla>();
        
        int opcion ;
        
        
      do{
          System.out.println("\n\t.:Zapateria Aceituno:.");
          System.out.println("1.Ingresar un Tennis al inventario");
          System.out.println("2.Ingresar una Chinela al inventario");
          System.out.println("3.Ingresar una Zapatilla al inventario");
          System.out.println("4.Salir");
          System.out.print("Seleccione una opcion: ");
          
          opcion=entrada.nextInt();
          
          
           switch(opcion){
          
          case 1: 
              //cree otras funciones aparte para que el codigo no s vea tan feo
             Tennis tennis =  crearTennis(entrada);
             tennis.setNombre("tennis");
             
             listatenis.add(tennis);
             
              System.out.println("\n\nUsted acaba de agregar un tennis al stock\n");
             break;
          
        case 2: 
            
              //cree otras funciones aparte para que el codigo no s vea tan feo
             Chinela chinela =  crearChinelas(entrada);
           
              chinela.setNombre("chinela");
             
             listaChinelas.add(chinela);
            
              System.out.println("\n\nUsted acaba de agregar una chinela al stock\n");
             
              break;  
          
               case 3: 
                   
              //cree otras funciones aparte para que el codigo no s vea tan feo
                   Zapatilla zapatilla = crearZapatillas(entrada);
                   zapatilla.setNombre("zapatilla");
                  zapatilla.File("Zapatilla.txt"); 
                   listaZapatilla.add(zapatilla);
                  
                    System.out.println("\n\nUsted acaba de agregar una zapatilla al stock\n");
                   
              break; 
              
              
               case 4: 
                   System.out.println("\n\nGracias pór utlilizar esta aplicacion :)");
              break;
      }
      
          
      }while(opcion != 4);
         //for each para recorrer todos los arraylist
         //recorriendo la lista de todos los tennis
      for(Tennis lista: listatenis){
          lista.File("Tennis.txt");//esto recorrera cada una de las posiciones de los tennis cuando se termine el programa
      }
      
      for(Chinela lista: listaChinelas){
          lista.File("Chinela.txt");//esto recorrera cada una de las posiciones de los tennis cuando se termine el programa
      }
      
      for(Zapatilla lista: listaZapatilla){
          lista.File("Zapatillas.txt");//esto recorrera cada una de las posiciones de los tennis cuando se termine el programa
      }
      
     
        
    }
    
    
    public static Tennis crearTennis(Scanner entrada){//voy a retornar un tennis
      
        double talla;
        String color;
        String marca;
        double precio;
        String modelo;
        
        System.out.println("\nUsted eligio ingresar un tennis\n");
        
        do{
        System.out.print("Ingrese la talla del tennis: ");
        talla= entrada.nextDouble();
        
         if(talla < 0){
            System.out.println("\n\nTalla incorrecta\n");
        }
        
        
         }while (talla < 0);//para que no ingrese la talla negativa
        entrada.nextLine();
        System.out.print("Ingrese el color del tennis: ");
        color = entrada.nextLine();
        
     
        
         System.out.print("Ingrese la marca del tennis: ");
       marca = entrada.nextLine();
       
        System.out.print("Ingrese el precio del tennis: ");
       precio= entrada.nextDouble();
       
             
       entrada.nextLine();

       
        System.out.print("Ingrese el modelo del tennis: ");
       modelo = entrada.nextLine();
        
       
        Tennis tennis = new Tennis(talla, color, marca, precio,modelo );
        
        return tennis;
    }
    
    
     public static Zapatilla crearZapatillas(Scanner entrada){
        double talla;
        String color;
        String marca;
        double precio;
    
        
        System.out.println("\nUsted eligio ingresar una Zapatilla\n");
        
        do{
        System.out.print("Ingrese la talla de la zapatilla: ");
        talla= entrada.nextDouble();
        
         if(talla < 0){
            System.out.println("\n\nTalla incorrecta\n");
        }
        
        
         }while (talla < 0);//para que no ingrese la talla negativa
        
            entrada.nextLine();
        
        System.out.print("Ingrese el color de la zapatilla: ");
        color = entrada.nextLine();
        
        
            
         System.out.print("Ingrese la marca de la zapatilla: ");
      
         marca = entrada.nextLine();
       
        System.out.print("Ingrese el precio de la zapatilla: ");
       precio= entrada.nextDouble();
       
        Zapatilla zapatiila = new Zapatilla(talla, color, marca, precio);
        
       
         
         return zapatiila;
    }
     
     
     public static Chinela crearChinelas(Scanner entrada){
        double talla;
        String color;
        String marca;
        double precio;
        String material;
        
        System.out.print("\nUsted eligio ingresar una Chinela: \n");
        
        do{
        System.out.print("Ingrese la talla de la Chinela: ");
        talla= entrada.nextDouble();
        
        if(talla < 0){
            System.out.println("\n\nTalla incorrecta\n");
        }
        
        }while (talla < 0);//para que no ingrese la talla negativa
        
            entrada.nextLine();
            
        System.out.print("Ingrese el color de la Chinela: ");
        color = entrada.nextLine();
        

        
         System.out.print("Ingrese la marca de la Chinela: ");
       marca = entrada.nextLine();
       
       do{
        System.out.print("Ingrese el precio de la Chinela: ");
       precio= entrada.nextDouble();
       
        if(talla < 0){
            System.out.println("\n\nPrecio incorrecto\n");
        }
      
       }while(precio <0);//para que no ingrese el precio negativo
       
       
        entrada.nextLine();
        
          System.out.print("Ingrese el material de la Chinela: ");
      material = entrada.nextLine();
       
      Chinela chinela = new Chinela(precio, material, talla, color, marca);
      
      
      return chinela;
    }
     
}
