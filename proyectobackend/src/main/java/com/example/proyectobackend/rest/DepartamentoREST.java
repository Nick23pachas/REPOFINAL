package com.example.proyectobackend.rest;

import java.util.List;

import com.example.proyectobackend.dto.Departamento;
import com.example.proyectobackend.service.DepartamentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departamento/")
public class DepartamentoREST {
  @Autowired
  private DepartamentoService departamentoService;

  @GetMapping
  private ResponseEntity<List<Departamento>> getAllDepartamento(){
    return ResponseEntity.ok(departamentoService.findAll());
  };
}
