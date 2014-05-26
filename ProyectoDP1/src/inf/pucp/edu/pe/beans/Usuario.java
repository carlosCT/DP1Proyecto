/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inf.pucp.edu.pe.beans;

/**
 *
 * @author fatima
 */
public class Usuario {
    
    private String dni;
    private String nombres;
    private String apellidos;
    private String email;
    private String direccion;
    private String usuario;
    private String sexo;
    private String contrasena;
    private String estadoBloqueo;
    private int perfil;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstadoBloqueo() {
        return estadoBloqueo;
    }

    public void setEstadoBloqueo(String estadoBloqueo) {
        this.estadoBloqueo = estadoBloqueo;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    
}
