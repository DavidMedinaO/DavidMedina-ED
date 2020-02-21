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
public class Estudiante {
    
    private String cedula;
    private String nombre;
    private String barrio; 
    private double notafinal; 
    private Estudiante nextNodo;
    private Estudiante previousNode;
    
    public Estudiante(String cedula,String nombre, String barrio,double notafinal){
    
        this.cedula= cedula;
        this.nombre = nombre;
        this.barrio = barrio;
        this.notafinal= notafinal;
        nextNodo=null;
        previousNode=null; 
    
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the barrio
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * @param barrio the barrio to set
     */
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    /**
     * @return the notafinal
     */
    public double getNotafinal() {
        return notafinal;
    }

    /**
     * @param notafinal the notafinal to set
     */
    public void setNotafinal(double notafinal) {
        this.notafinal = notafinal;
    }

    /**
     * @return the nextNodo
     */
    public Estudiante getNextNodo() {
        return nextNodo;
    }

    /**
     * @param nextNodo the nextNodo to set
     */
    public void setNextNodo(Estudiante nextNodo) {
        this.nextNodo = nextNodo;
    }

    /**
     * @return the previousNode
     */
    public Estudiante getPreviousNode() {
        return previousNode;
    }

    /**
     * @param previousNode the previousNode to set
     */
    public void setPreviousNode(Estudiante previousNode) {
        this.previousNode = previousNode;
    }
    
    
    
    
    
}
