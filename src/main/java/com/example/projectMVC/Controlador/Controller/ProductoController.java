package com.example.projectMVC.Controlador.Controller;

import com.example.projectMVC.Controlador.Service.ProductoService;
import com.example.projectMVC.Modelo.Domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/all")
    public ResponseEntity<List<Producto>> getAll(){
        return new ResponseEntity<>(productoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idProducto}")
    public ResponseEntity<Producto> getById(@PathVariable("idProducto") int idProducto){
        return productoService.getById(idProducto)
                .map(producto -> new ResponseEntity<>(producto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Producto> save(@RequestBody Producto producto){
        return new ResponseEntity<>(productoService.save(producto), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Producto> update(@RequestBody Producto producto){
        return new ResponseEntity<>(productoService.update(producto), HttpStatus.OK);
    }

    @DeleteMapping("/{idProducto}")
    public ResponseEntity delete(@PathVariable("idProducto") int idProducto){
        if(productoService.delete(idProducto)){
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
