package com.example.projectMVC.Modelo.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "venta_productos")
public class VentaProductos {

    @EmbeddedId
    private VentaProductosPK id;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "nro_venta", insertable = false, updatable = false)
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public VentaProductosPK getId() {
        return id;
    }

    public void setId(VentaProductosPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
