package com.example.projectMVC.Controlador.Service;

import com.example.projectMVC.Modelo.Domain.Producto;
import com.example.projectMVC.Modelo.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> getAll(){
        return productoRepository.findAll();
    }

    public Optional<Producto> getById(int idProducto){
        return productoRepository.findById(idProducto);
    }

    public Producto save(Producto producto){
        return productoRepository.save(producto);
    }

    public Producto update(Producto producto){
        return productoRepository.save(producto);
    }

    public boolean delete(int idProducto){
        if(!getById(idProducto).isEmpty()){
            productoRepository.deleteById(idProducto);
            return true;
        } else {
            return false;
        }
    }

}
