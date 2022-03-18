package com.example.proyectobackend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Departamento")
public class Departamento {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;
  private String Nombre;

  public Departamento( String Nombre) {
    super();
    this.Nombre = Nombre;
  }
  public Departamento() {
    
  }
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return this.Nombre;
  }

  public void setNombre(String Nombre) {
    this.Nombre = Nombre;
  }

}
