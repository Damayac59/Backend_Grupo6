package com.grupo6.apigrupo6.modelos;
import java.util.ArrayList;
import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class UsuarioModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable = false)
    private long id;
    private String nombreUsuario;
    private int cedula;
    private String nombre;
    private String apellido;
    private String cargo;
    private String contrasena;
    private String horario;
    private String diasLaborales;
    /*private ArrayList<String> diasLaborales;*/
    /*private ArrayList<String> novedades;*/

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private boolean administrador;

    public String getNombre() {
        return this.nombre;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDiasLaborales() {
        return this.diasLaborales;
    }

    public void setDiasLaborales(String diasLaborales) {
        this.diasLaborales = diasLaborales;
    }

   /*public ArrayList<String> getDiasLaborales() {
        return this.diasLaborales;
    }

    public void setDiasLaborales(ArrayList<String> diasLaborales) {
        this.diasLaborales = diasLaborales;
    }*/
    /* 
    public ArrayList<String> getNovedades() {
        return this.novedades;
    }

    public void setNovedades(ArrayList<String> novedades) {
        this.novedades = novedades;
    }*/
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }    
}
    
