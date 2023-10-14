package com.example.projectMVC.Controlador.Controller;

import com.example.projectMVC.Controlador.Service.VentaProductoService;
import com.example.projectMVC.Modelo.Domain.Venta;
import com.example.projectMVC.Modelo.Domain.VentaProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventaproductos")
public class VentaProductoController {

    @Autowired
    VentaProductoService ventaProductoService;

    @GetMapping("/all")
    public ResponseEntity<List<VentaProductos>> getAll(){
        return new ResponseEntity<>(ventaProductoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{nroVenta}")
    public ResponseEntity<List<VentaProductos>> getById(@PathVariable("nroVenta") int nroVenta){
        return new ResponseEntity<>(ventaProductoService.getByNroVentas(nroVenta), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<VentaProductos> save(@RequestBody VentaProductos ventaProductos){
        return new ResponseEntity<>(ventaProductoService.save(ventaProductos), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<VentaProductos> update(@RequestBody VentaProductos ventaProductos){
        return new ResponseEntity<>(ventaProductoService.update(ventaProductos), HttpStatus.OK);
    }

}
