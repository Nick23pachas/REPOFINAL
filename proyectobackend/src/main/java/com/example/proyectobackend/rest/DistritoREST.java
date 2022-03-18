package com.example.proyectobackend.rest;

import java.util.List;

import com.example.proyectobackend.dto.Distrito;
import com.example.proyectobackend.service.DistritoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distrito/")
public class DistritoREST {
  @Autowired
  private DistritoService distritoService;

  @GetMapping("{idD}")
  private ResponseEntity<List<Distrito>> getAllDistritoByProvincia(@PathVariable("idD") Long  idProvincia){
    return ResponseEntity.ok(distritoService.findAllByProvincia(idProvincia));
  };
}
