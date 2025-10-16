package model;

import jakarta.persistence.*;

import java.awt.*;

@Entity
@Table(name="Sucursal")
@NamedQueries(
        {
                @NamedQuery(name="Sucursal.findAll", query="SELECT u FROM Sucursal u"),
                @NamedQuery(name="Sucursal.findById", query = "SELECT u FROM Sucursal u where u.id=?1")
        }
)
public class Sucursal {
    @Id
    private Integer id;
    private String nombre;
    private String descripcion;
    @Column(name="direccion_actual", length= 100)
    private String direccionActual;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccionActual() {
        return direccionActual;
    }

    public void setDireccionActual(String direccionActual) {
        this.direccionActual = direccionActual;
    }
}
