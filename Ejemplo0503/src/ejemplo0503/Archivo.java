/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo0503;
import java.io.EOFException;
import java.io.File;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author bryda
 */
public class Archivo {
    
    
    public Boolean guardar(String ruta,ArrayList<Carnet> arrayCarne) { 
        //Persiste el objeto Array Completo, en archivo binario}
        //Para que se pueda leer posteriormente los objetos Carne que estan en array solo es necesario que la clase Carne sea serializable
        try {
            File f = new File(ruta);
            f.delete();  // borro primero el archivo ya que actualizo todo 
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
            salida.writeObject(arrayCarne);
            salida.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
        
    }

    public ArrayList<Carnet> abrir(String ruta) {
        //Leo el objeto Array Completo, en archivo binario}
        //ya que lo serialize puede leerlo como objeto de manera automatica
        //para que no haya problemas con la lectura del objeto Carne, es necesario que objeto carne implemente interface serializable
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ruta));
            if (entrada != null) {
                ArrayList<Carnet> arrayCarne = (ArrayList<Carnet>) entrada.readObject();
                entrada.close();
                return arrayCarne;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Clase no encontrada");
        }
        return null;
    }

}
