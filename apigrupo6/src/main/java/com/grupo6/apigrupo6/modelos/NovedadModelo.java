package com.grupo6.apigrupo6.modelos;
import javax.persistence.*;

@Entity
@Table(name="novedades")
public class NovedadModelo {
    @Id
    @Column(nullable = false)
    private long id;
    private String fecha_hora;
    private String novedad;
    private String observacion;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFecha_hora() {
        return this.fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getNovedad() {
        return this.novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

     
}
