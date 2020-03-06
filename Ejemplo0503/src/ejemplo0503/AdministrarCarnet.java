/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo0503;

import java.util.ArrayList;
/**
 *
 * @author bryda
 */
public class AdministrarCarnet {
    
    
    Archivo arch;
    
    public AdministrarCarnet(){
        arch = new Archivo();
    }
    
    public Respuesta guardarCarnet(Carnet carnet){
        
        
        ArrayList<Carnet> arrayCarne = arch.abrir("estudiantes.txt");
        if(arrayCarne == null){
           arrayCarne = new ArrayList();
        }
        for (Carnet carnet1 : arrayCarne) {
            if(carnet1.getCodigo().equals(carnet.getCodigo())){
                return new Respuesta(false, "El codigo de carnet ya está registrado");
            }
        }
        //ArrayList<Carnet> arrayCarne = new ArrayList();
        
        arrayCarne.add(carnet);
        return new Respuesta(arch.guardar("estudiantes.txt", arrayCarne), "Error desconocido");
            
        
    }
    public void LeerCarnets(){
        ArrayList<Carnet> arrayCarne = arch.abrir("estudiantes.txt");
        if(arrayCarne == null){
           arrayCarne = new ArrayList();
        }
        for (Carnet carnet : arrayCarne) {
            System.out.println(carnet.getCodigo()+" " + carnet.getNombre() + " " + carnet.getProyecto());
        }
    }

    
    
}
