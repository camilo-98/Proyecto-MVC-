package com.example.projectMVC.Controlador.Service;

import com.example.projectMVC.Modelo.Domain.Cliente;
import com.example.projectMVC.Modelo.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getById(long idCliente){
        return clienteRepository.findById(idCliente);
    }

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente update(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public boolean delete(long idCliente){
        if(!getById(idCliente).isEmpty()){
            clienteRepository.deleteById(idCliente);
            return true;
        } else {
            return false;
        }
    }

}
