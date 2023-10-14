package com.example.projectMVC.Modelo.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class VentaProductosPK implements Serializable {

    @Column(name = "nro_venta")
    private Integer nroVenta;

    @Column(name = "id_producto")
    private Integer idProducto;


    public Integer getNroVenta() {
        return nroVenta;
    }

    public void setNroVenta(Integer nroVenta) {
        this.nroVenta = nroVenta;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
