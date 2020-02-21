/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s208e19
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        DoublyLinkedList<Integer> myDoublelist = new DoublyLinkedList<>();
        
        int existe= 11;//Variable para validar el punto 1
        System.out.println("EL DATO"+ existe + "EXISTE EN LA LISTA: "+ myDoublelist.searchData(existe));//PUNTO1
        
        myDoublelist.addOrdered(66);// variables para verificar el punto 2
        myDoublelist.addOrdered(11);
        myDoublelist.addOrdered(99);
        myDoublelist.addOrdered(33);
        myDoublelist.addOrdered(44);
        myDoublelist.addOrdered(22);
        myDoublelist.addOrdered(101);
        System.out.println(myDoublelist.showData());// Punto 2
        
        
        myDoublelist.deleteU(101);// Variables Punto 3
        System.out.println(myDoublelist.showData());// Mostrar que se elimino el dato, punto 3
        
        
        myDoublelist.Insertnode(11, 12);// Variable para validar Punto 4
        System.out.println(myDoublelist.showData());// Punto 4
        
        
        
        
        System.out.println("");////////////////Caso Practico
        
        DoublyLinkedList<Estudiante> ListEstudiante= new DoublyLinkedList<>();
        
        ListEstudiante.AgregarEstudiante(new Estudiante("1000204463", "Medina", "Belen", 2));// Punto 1 y 2
        ListEstudiante.AgregarEstudiante(new Estudiante("127812973", "David5", "Belen", 5));
         ListEstudiante.AgregarEstudiante(new Estudiante("127812973", "David4", "Belen", 4));
          ListEstudiante.AgregarEstudiante(new Estudiante("127812973", "David1", "Belen", 1));

        System.out.println("LISTA: " + ListEstudiante.MostrarEstudiantes());// Punto 3

         
        System.out.println("Buscar"+ ListEstudiante.Buscar("1000204463"));// Punto 4
        
        
        System.out.println("BARRIO: " + ListEstudiante.BuscarBarrio("Belen"));// Punto 5
        
        
        System.out.println("LA LISTA DE APROBADOS ES:" + ListEstudiante.ListAprobados().MostrarEstudiantes()); // Punto 7 
        
        System.out.println("LA LISTA DE APROBADOS ES:" + ListEstudiante.ListReprobados().MostrarEstudiantes()); // Punto 8 
        
        


    }

}
