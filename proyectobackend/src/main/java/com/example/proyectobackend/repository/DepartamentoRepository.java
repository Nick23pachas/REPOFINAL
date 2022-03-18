package com.example.proyectobackend.repository;

import com.example.proyectobackend.dto.Departamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento,Long> {
  
}
