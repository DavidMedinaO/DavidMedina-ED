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

        

        try {
            myDoublelist.addOrdered(66);// variables para verificar el punto 2

        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            myDoublelist.addOrdered(11);// variables para verificar el punto 2
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            myDoublelist.addOrdered(99);// variables para verificar el punto 2
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            myDoublelist.addOrdered(17);// variables para verificar el punto 2
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            myDoublelist.addOrdered(44);// variables para verificar el punto 2
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            myDoublelist.addOrdered(22);// variables para verificar el punto 2
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            myDoublelist.addOrdered(101);// variables para verificar el punto 2
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(myDoublelist.showData());// Punto 2

        int existe = 11;//Variable para validar el punto 1
        System.out.println("EL DATO " + existe + " EXISTE EN LA LISTA: " + myDoublelist.searchData(existe));//PUNTO1
        
        myDoublelist.deleteU(101);// Variables Punto 3
        System.out.println(myDoublelist.showData());// Mostrar que se elimino el dato, punto 3

        int pos=11;// Apartir de que nodo se agregara el nuevo dato
        int dato= 12;// Dato a ingresar 
        try {
            myDoublelist.Insertnode(pos, dato);// Variable para validar Punto 4
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(myDoublelist.showData());// Punto 4

        System.out.println("");////////////////////////////////////Caso Practico

        DoublyLinkedList<Estudiante> ListEstudiante = new DoublyLinkedList<>();

        ListEstudiante.AgregarEstudiante(new Estudiante("1000204463", "Medina", "Belen", 2));// Punto 1 y 2
        ListEstudiante.AgregarEstudiante(new Estudiante("127812973", "David5", "Belen", 5));
        ListEstudiante.AgregarEstudiante(new Estudiante("127812973", "David4", "Bello", 4));
        ListEstudiante.AgregarEstudiante(new Estudiante("127812973", "David1", "Belen", 1));

        System.out.println("LISTA: " + ListEstudiante.MostrarEstudiantes());// Punto 3

        String id = "1000204463";//Variable para validar el Punto 4
        try {
            System.out.println("EL ESTUDIANTE CON CEDULA "+id+" ES " + ListEstudiante.Buscar(id));// Punto 4
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }

        String Barrio = "Belen";// variable para validar el punto 5
        try {
            System.out.println("LOS ESTUDIANTES DEL BARRIO " + Barrio + " SON: " + ListEstudiante.BuscarBarrio(Barrio));// Punto 5
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("LA LISTA DE APROBADOS ES:" + ListEstudiante.ListAprobados().MostrarEstudiantes()); // Punto 7 

        System.out.println("LA LISTA DE REPROBADOS ES:" + ListEstudiante.ListReprobados().MostrarEstudiantes()); // Punto 8 

    }

}
