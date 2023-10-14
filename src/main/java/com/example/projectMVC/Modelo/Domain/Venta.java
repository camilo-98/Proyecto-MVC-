package com.example.projectMVC.Modelo.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "ventas")
public class Venta {

    @Id
    @Column(name = "nro_venta")
    private Integer nroVenta;

    private Timestamp fecha;

    @Column(name = "id_sucursal")
    private Integer idSucursal;

    private Long cedula;

    @ManyToOne
    @JoinColumn(name = "id_sucursal", insertable = false, updatable = false)
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "cedula", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "venta")
    @JsonIgnore
    private List<VentaProductos> productosVenta;

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<VentaProductos> getProductosVenta() {
        return productosVenta;
    }

    public void setProductosVenta(List<VentaProductos> productosVenta) {
        this.productosVenta = productosVenta;
    }

    public Integer getNroVenta() {
        return nroVenta;
    }

    public void setNroVenta(Integer nroVenta) {
        this.nroVenta = nroVenta;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }
}
