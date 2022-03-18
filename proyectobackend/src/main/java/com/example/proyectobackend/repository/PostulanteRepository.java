package com.example.proyectobackend.repository;

import com.example.proyectobackend.dto.Postulante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostulanteRepository extends JpaRepository<Postulante,Long>{
  
}
