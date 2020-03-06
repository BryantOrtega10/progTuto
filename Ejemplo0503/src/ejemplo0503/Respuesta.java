/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo0503;

/**
 *
 * @author bryda
 */
public class Respuesta {
    private Boolean success;
    private String mensaje;
    public Respuesta(Boolean success, String mensaje){
        this.success = success;
        this.mensaje = mensaje;
    }
       
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
