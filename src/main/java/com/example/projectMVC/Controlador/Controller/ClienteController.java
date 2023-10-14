package com.example.projectMVC.Controlador.Controller;

import com.example.projectMVC.Controlador.Service.ClienteService;
import com.example.projectMVC.Modelo.Domain.Cliente;
import com.example.projectMVC.Modelo.Domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/all")
    public ResponseEntity<List<Cliente>> getAll(){
        return new ResponseEntity<>(clienteService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idCliente}")
    public ResponseEntity<Cliente> getById(@PathVariable("idCliente") long idCliente){
        return clienteService.getById(idCliente)
                .map(cliente -> new ResponseEntity<>(cliente, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
        return new ResponseEntity<>(clienteService.save(cliente), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente){
        return new ResponseEntity<>(clienteService.update(cliente), HttpStatus.OK);
    }

    @DeleteMapping("/{idCliente}")
    public ResponseEntity delete(@PathVariable("idCliente") long idCliente){
        if(clienteService.delete(idCliente)){
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
