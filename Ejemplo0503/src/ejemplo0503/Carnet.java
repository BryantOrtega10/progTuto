/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo0503;

import java.io.Serializable;

/**
 *
 * @author bryda
 */
public class Carnet implements Serializable{
    private String codigo;
    private String nombre;
    private String proyecto;

    public Carnet(String codigo, String nombre, String proyecto){
        this.codigo = codigo;
        this.nombre = nombre;
        this.proyecto = proyecto;
         
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }
    @Override
    public String toString() {
        return "Codigo: "+codigo+"\nNombre: " + nombre + "\nProyecto: " + proyecto;
    }

}
