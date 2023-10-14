package com.example.projectMVC.Modelo.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "sucursales")
public class Sucursal {

    @Id
    @Column(name = "id_sucursal")
    private Integer idSucursal;

    @Column(name = "nom_sucursal")
    private String nomSucursal;

    @OneToMany(mappedBy = "sucursal")
    @JsonIgnore
    private List<Venta> ventas;

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNomSucursal() {
        return nomSucursal;
    }

    public void setNomSucursal(String nomSucursal) {
        this.nomSucursal = nomSucursal;
    }
}
