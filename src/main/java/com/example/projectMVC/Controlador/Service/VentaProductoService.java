package com.example.projectMVC.Controlador.Service;

import com.example.projectMVC.Modelo.Domain.VentaProductos;
import com.example.projectMVC.Modelo.Domain.VentaProductosPK;
import com.example.projectMVC.Modelo.Repository.VentaProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaProductoService {

    @Autowired
    VentaProductoRepository ventaProductoRepository;

    public List<VentaProductos> getAll(){
        return ventaProductoRepository.findAll();
    }

    public List<VentaProductos> getByNroVentas(int nroVenta){
        return ventaProductoRepository.findAllByNroVenta(nroVenta);
    }

    public VentaProductos save(VentaProductos ventaProductos){
        return ventaProductoRepository.save(ventaProductos);
    }

    public VentaProductos update(VentaProductos ventaProductos){
        return ventaProductoRepository.save(ventaProductos);
    }


}
