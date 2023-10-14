package com.example.projectMVC.Modelo.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private Long cedula;

    private String nombre;

    private String apellido;

    private Long telefono;

    @Column(name = "id_tipo_id")
    private Integer idTipoId;

    @ManyToOne
    @JoinColumn(name = "id_tipo_id", insertable = false, updatable = false)
    private TiposId tiposId;

    @OneToMany(mappedBy = "cliente")
    @JsonIgnore
    private List<Venta> ventasClientes;

    public TiposId getTiposId() {
        return tiposId;
    }

    public void setTiposId(TiposId tiposId) {
        this.tiposId = tiposId;
    }

    public List<Venta> getVentasClientes() {
        return ventasClientes;
    }

    public void setVentasClientes(List<Venta> ventasClientes) {
        this.ventasClientes = ventasClientes;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Integer getIdTipoId() {
        return idTipoId;
    }

    public void setIdTipoId(Integer idTipoId) {
        this.idTipoId = idTipoId;
    }
}
