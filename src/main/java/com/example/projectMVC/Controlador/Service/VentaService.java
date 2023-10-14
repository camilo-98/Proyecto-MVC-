package com.example.projectMVC.Controlador.Service;

import com.example.projectMVC.Modelo.Domain.Cliente;
import com.example.projectMVC.Modelo.Domain.Venta;
import com.example.projectMVC.Modelo.Repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    VentaRepository ventaRepository;

    public List<Venta> getAll(){
        return ventaRepository.findAll();
    }

    public Optional<Venta> getById(int nroVenta){
        return ventaRepository.findById(nroVenta);
    }

    public Venta save(Venta venta){
        return ventaRepository.save(venta);
    }

    public Venta update(Venta venta){
        return ventaRepository.save(venta);
    }


}
