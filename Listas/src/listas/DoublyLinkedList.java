/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author s103e28
 */
public class DoublyLinkedList<T extends  Comparable> implements Ilist<T> {

    private DoubleNode<T> head;
    private DoubleNode<T> tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    //agregar datos al inicio
    @Override
    public void add(T d) {

        if (isEmpty()) {
            head = tail = new DoubleNode<>(d);
        } else {
            head = new DoubleNode<>(d, null, head);
            head.getNextNode().setPreviousNode(head);
        }

    }

    @Override
    public void addLast(T d) {
        if (isEmpty()) {
            head = tail = new DoubleNode<>(d);
        } else {
            tail = new DoubleNode<>(d, tail, null);
            tail.getPreviousNode().setNextNode(tail);
        }
    }

    @Override
    public void addOrdered(T d) throws Exception {

        if (isEmpty() || d.compareTo(head.getData()) == 1) {
            add(d);
            return;
        }
        if (d.compareTo(tail.getData()) == -1) {
            addLast(d);
            return;
        } else if (d.compareTo(head.getData()) == 0) {

            throw new Exception("YA SE ENCUENTRA EL DATO EN LA LISTA");

        } else if (d.compareTo(tail.getData()) == 0) {

            throw new Exception("YA SE ENCUENTRA EL DATO EN LA LISTA");

        }
        DoubleNode<T> current = head.getNextNode();
        DoubleNode<T> newNode;

        while (current.getData().compareTo(d) == 1) {

            if (d.compareTo(current.getData()) == 0) {

                throw new Exception("YA SE ENCUENTRA EL DATO EN LA LISTA");

            }
            current = current.getNextNode();
        }

        newNode = new DoubleNode<>(d, current.getPreviousNode(), current);
        current.getPreviousNode().setNextNode(newNode);
        current.setPreviousNode(newNode);

    }

    @Override
    /**
     * Borrar el primer nodo
     */
    public void delete() throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista ya esta vacía");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head.getNextNode().setPreviousNode(null);
            head = head.getNextNode();
        }
    }

    @Override
    public void deleteLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista ya esta vacía");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail.getPreviousNode().setNextNode(null);
            tail = tail.getPreviousNode();
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String showData() {
        String data = "";
        DoubleNode<T> current = this.head;
        while (current != null) {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        }
        return data;
    }

    public String showDataReverse() {
        String data = "";
        DoubleNode<T> current = this.tail;
        while (current != null) {
            data += current.getData() + " ";
            current = current.getPreviousNode();
        }
        return data;
    }

    public boolean searchData(T d) {

        DoubleNode<T> current = this.head;

        while (current != null) {
            //if (current.getData()==d){}
            if (current.getData() == d) {
                //if (current.getData().compareTo(d) == 0) {
                return true;
            }
            current = current.getNextNode();
        }

        return false;

    }
    
    
    public void deleteU(T d) {

        if (isEmpty()) {

        } else if (this.tail.getData() == d) {

            this.tail.getPreviousNode().setNextNode(null);
            this.tail = this.tail.getPreviousNode();

        } else if (this.head.getData() == d) {

            this.head = head.getNextNode();

        } else {

            DoubleNode<T> current = this.head.getNextNode();
            while (current != null) {

                if (current.getData() == d) {

                    current.getPreviousNode().setNextNode(current.getNextNode());
                    current.getNextNode().setPreviousNode(current.getPreviousNode());

                }

                current = current.getNextNode();

            }

        }

    }
    
    
    public void Insertnode(T pos, T dato) throws Exception  {
        DoubleNode<T> current = this.head;
        
        boolean existe = false; 
        if (this.tail.getData() == pos) {
            
            existe = true; 
             DoubleNode<T> newnodo = new DoubleNode<T>(dato, current, null);
             this.tail.setNextNode(newnodo);
             this.tail= newnodo; 
            
        } else {

            while (current != null) {

                if (current.getData() == pos) {
                    
                    existe = true;
                    DoubleNode<T> newnodo = new DoubleNode<T>(dato, current, current.getNextNode());
                    current.getNextNode().setPreviousNode(newnodo);
                    current.setNextNode(newnodo);

                }
                current = current.getNextNode();

            }
            

        }
        
        if(existe== false){
        
         throw new Exception("EL DATO INGRESADO NO EXISTE");
        
        }

    }

 /////////////////////////////////////////////////////////Caso Practico
    
    public String MostrarEstudiantes() {
        String est = "";
        DoubleNode<Estudiante> current = (DoubleNode<Estudiante>) this.head;
        while (current != null) {
            est = est + current.getData().getCedula() + "  " + current.getData().getNombre() + "  " + current.getData().getBarrio() + "  " + current.getData().getNotafinal() + " / ";
            current = current.getNextNode();
        }
        return est;
    }

    public void AgregarEstudiante(Estudiante est) {

        if (3 <= est.getNotafinal()) {

            add((T) est);

        } else {

            addLast((T) est);
        }

    }
    
    public String Buscar( String est) throws Exception {

        String estudiante = "";
        DoubleNode<Estudiante> current = (DoubleNode<Estudiante>) this.head;
        while (current != null) {

            if (current.getData().getCedula().equals(est)) {

                estudiante = current.getData().getCedula() + "  " + current.getData().getNombre() + "  " + current.getData().getBarrio() + "  " + current.getData().getNotafinal();
                return estudiante;
            }
            current = current.getNextNode();

        }
        
        if(estudiante.equals("")){
        
            
            throw new Exception("ERROR, NO EXISTE EL ESTUDIANTE CON ESA CEDULA");
        }else{

        return estudiante;
        }

    }
    
    
    
     public String BuscarBarrio(String est) throws Exception{

        String estudiante = "";
        DoubleNode<Estudiante> current = (DoubleNode<Estudiante>) this.head;
        while (current != null) {

            if (current.getData().getBarrio().equals(est)) {

                estudiante = estudiante + "  " + current.getData().getCedula() + "  " + current.getData().getNombre() + "  " + current.getData().getBarrio() + "  " + current.getData().getNotafinal() + " / ";

            }
            current = current.getNextNode();

        }
        if(estudiante.equals("")){
        
            
            throw new Exception("ERROR, NO EXISTEN ESTUDIANTES PERTENECIENTES A ESE BARRIO");
        }else{

        return estudiante;
        }

      

    }
     
      public DoublyLinkedList<Estudiante> ListAprobados() {

        DoubleNode<Estudiante> current = (DoubleNode<Estudiante>) this.head;
        DoublyLinkedList<Estudiante> Aprobados = new DoublyLinkedList<>();

        while (current != null) {
            if (current.getData().getNotafinal() >= 3) {

                Aprobados.AgregarEstudiante(current.getData());

            }
            current = current.getNextNode();

        }
        return Aprobados;

    }
      
      
      public DoublyLinkedList<Estudiante> ListReprobados() {

        DoubleNode<Estudiante> current = (DoubleNode<Estudiante>) this.head;
        DoublyLinkedList<Estudiante> Reprobados = new DoublyLinkedList<>();

        while (current != null) {
            if (current.getData().getNotafinal() < 3) {

                Reprobados.AgregarEstudiante(current.getData());

            }
            current = current.getNextNode();

        }
        return Reprobados;

    } 

}
