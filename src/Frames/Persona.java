
package Frames;

/**
 *
 * @author acxel
 */
public class Persona {
    
    private String nombre, apellidos, mail, direccion, celular;

    public Persona(String nombre, String apellidos, String mail, String direccion, String celular) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.mail = mail;
        this.direccion = direccion;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    } 
}
