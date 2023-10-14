package com.example.projectMVC.Modelo.Repository;

import com.example.projectMVC.Modelo.Domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
