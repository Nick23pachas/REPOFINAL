package com.example.proyectobackend.rest;

import java.net.URI;
import java.util.List;

import com.example.proyectobackend.dto.Postulante;
import com.example.proyectobackend.service.PostulanteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postulante/")
public class PostulanteREST {
  @Autowired
  private PostulanteService postulanteService;

  @GetMapping
  private ResponseEntity<List<Postulante>> getAllPostulante(){
    return ResponseEntity.ok(postulanteService.findAll());
  }

  
  @PostMapping
	private ResponseEntity<Postulante> savePostulante (@RequestBody Postulante postulante){
		try {
			Postulante postulanteGuardada = postulanteService.save(postulante);		
		return ResponseEntity.created(new URI("/postulante/"+postulanteGuardada.getId())).body(postulanteGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
