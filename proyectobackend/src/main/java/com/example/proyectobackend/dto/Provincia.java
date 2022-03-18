package com.example.proyectobackend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Provincia")
public class Provincia {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;
  private String Nombre;


  @ManyToOne
  @JoinColumn(name="departamento_id")
  private Departamento departamento;


  public Provincia( String Nombre, Departamento departamento) {
    super();
    this.Nombre = Nombre;
    this.departamento = departamento;
  }
  public Provincia( ) {
   
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

  public Departamento getDepartamento() {
    return this.departamento;
  }

  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }

}
