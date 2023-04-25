/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase11;

/**
 *
 * @author luciana
 */
public class Ejemplo {
    
    
    //ARCHIVO PuedeCantar.java (tipo interfaz)
    
       // a) Contiene la interfaz PuedeCantar, que contiene el método cantar.
    public interface PuedeCantar {
        void cantar();
    }
  
    //ARCHIVO SerCantor.java (tipo java class)
   //     b) Contiene la super Clase SerCantor, que implementa la interfaz y que es abstracta.
    public abstract class SerCantor implements PuedeCantar  { // superclase
        public String tipo;
        public SerCantor(String tipo){
            this.tipo = tipo;
        }
        
        @Override
        public void cantar(){
            System.out.println(this.tipo+ " canta asi:");
            this.hacerCantar(this);
        }
        
        abstract void hacerCantar(SerCantor a);
    }
    
    
    //ARCHIVO Artista.java (tipo java class)
    
      //  c) Las subclases de SerCantor, son Artista, Canario y Gallo, que implementan su método abstracto.
        public class Artista extends SerCantor{
            public Artista(String tipo){
                super(tipo);
            }
            @Override
            public void hacerCantar(SerCantor s){ //este es el mpetodo abstractar redefinido
                System.out.println("do re mi fa sol la si");
            }
        }
        
        public class Canario extends SerCantor{ 
            public Canario(String tipo){
                super(tipo);
            }

            @Override
            public void hacerCantar(SerCantor s){
                System.out.println("pio pio pio");
            }
        }
    
        public class Gallo extends SerCantor{
            public Gallo(String tipo){
                super(tipo);
            }
            
            @Override
            public void hacerCantar(SerCantor s){
                System.out.println("ki kiri ki");
            }   
        }
        
            //ARCHIVO main.java (tipo java class)

        
        // El método main se encuentra en la clase Main:
        public class Main {
            public void main(String args[]){ // n  verdd es psvm pero para que quede en un solo archivo lo dejo así
                Artista tenor = new Artista("Pavarotti");
                Gallo animal1 = new Gallo("Claudio");
                Canario animal2 = new Canario("Piolin");
                tenor.cantar();
                animal1.cantar();
                animal2.cantar();

            }
        }
    
}
