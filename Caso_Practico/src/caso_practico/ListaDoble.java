/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso_practico;

/**
 *
 * @author s208e12
 */
public class ListaDoble {
    
    public Estudiante head; 
    public Estudiante tail; 
    
    public ListaDoble(){

         head = tail = null;

    }
    public boolean isEmpty() {
        return head == null;
    }
    public void add(Estudiante Newnodo){
        
        if(isEmpty()){
            
            head=tail= Newnodo; 
        }else{
        
            
            Newnodo.setNextNodo(head); 
            head= Newnodo; 
            head.getNextNodo().setPreviousNode(head);
        }
    
            
    }
    
    
}
