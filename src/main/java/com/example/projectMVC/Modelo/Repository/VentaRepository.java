package com.example.projectMVC.Modelo.Repository;

import com.example.projectMVC.Modelo.Domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {
}
