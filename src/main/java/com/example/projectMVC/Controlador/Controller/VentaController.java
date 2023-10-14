package com.example.projectMVC.Controlador.Controller;

import com.example.projectMVC.Controlador.Service.VentaService;
import com.example.projectMVC.Modelo.Domain.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    VentaService ventaService;

    @GetMapping("/all")
    public ResponseEntity<List<Venta>> getAll(){
        return new ResponseEntity<>(ventaService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{nroVenta}")
    public ResponseEntity<Venta> getById(@PathVariable("nroVenta") int nroVenta){
        return ventaService.getById(nroVenta)
                .map(venta -> new ResponseEntity<>(venta, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Venta> save(@RequestBody Venta venta){
        return new ResponseEntity<>(ventaService.save(venta), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Venta> update(@RequestBody Venta venta){
        return new ResponseEntity<>(ventaService.update(venta), HttpStatus.OK);
    }


}
