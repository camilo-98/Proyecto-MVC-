package com.example.projectMVC.Modelo.Repository;

import com.example.projectMVC.Modelo.Domain.VentaProductos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentaProductoRepository  extends JpaRepository<VentaProductos, Integer> {

    @Query(value = "SELECT * FROM venta_productos WHERE nro_venta = :nroVenta", nativeQuery = true)
    List<VentaProductos> findAllByNroVenta(@Param("nroVenta") Integer nroVenta);

}
