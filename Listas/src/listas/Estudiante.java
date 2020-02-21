/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Estefania
 */
public class Estudiante implements Comparable{
    
    private String cedula;
    private String nombre;
    private String barrio; 
    private double notafinal; 
   
    
    public Estudiante(String cedula,String nombre, String barrio,double notafinal){
    
        this.cedula= cedula;
        this.nombre = nombre;
        this.barrio = barrio;
        this.notafinal= notafinal;
        
    
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

    @Override
    public int compareTo(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
