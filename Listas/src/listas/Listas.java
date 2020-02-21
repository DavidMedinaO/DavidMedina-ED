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
        myDoublelist.addOrdered(66);
        myDoublelist.addOrdered(11);
        myDoublelist.addOrdered(99);
        myDoublelist.addOrdered(33);
        myDoublelist.addOrdered(44);
        myDoublelist.addOrdered(22);
        myDoublelist.addOrdered(101);

        System.out.println(myDoublelist.showData());
        System.out.println(myDoublelist.searchData(77));

//        try {
//            myDoublelist.deleteLast();
//            myDoublelist.deleteLast();
//            myDoublelist.delete();
//            myDoublelist.deleteLast();
//            myDoublelist.deleteLast();
//        } catch (Exception ex) {
//            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
//        }

        System.out.println(myDoublelist.showData());
        System.out.println(myDoublelist.showDataReverse());
        
        int existe= 11;//Variable para validar el punto 1
        System.out.println("EL DATO"+ existe + "EXISTE EN LA LISTA: "+ myDoublelist.searchData(existe));//PUNTO1
        
        



    }

}
