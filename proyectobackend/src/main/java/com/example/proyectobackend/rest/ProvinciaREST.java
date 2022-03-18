package com.example.proyectobackend.rest;

import java.util.List;

import com.example.proyectobackend.dto.Provincia;
import com.example.proyectobackend.service.ProvinciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provincia/")
public class ProvinciaREST {
  @Autowired
  private ProvinciaService provinciaService;

  @GetMapping("{id}")
  private ResponseEntity<List<Provincia>> getAllProvinciaByDepartamento(@PathVariable("id") Long  idDepartamento){
    return ResponseEntity.ok(provinciaService.findAllByDepartamento(idDepartamento));
  };

}
