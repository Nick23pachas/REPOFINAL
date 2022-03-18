package com.example.proyectobackend.dto;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="Distrito")
public class Distrito {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;
  private String Nombre;

  @ManyToOne
  @JoinColumn(name = "provincia_id")
  private Provincia provincia;

  @ManyToOne
  @JoinColumn(name="departamento_id")
  private Departamento departamento;

  public Distrito() {
    
  }
  public Distrito(String Nombre, Provincia provincia, Departamento departamento) {
    super();
    this.Nombre = Nombre;
    this.provincia = provincia;
    this.departamento = departamento;
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

  public Provincia getProvincia() {
    return this.provincia;
  }

  public void setProvincia(Provincia provincia) {
    this.provincia = provincia;
  }

  public Departamento getDepartamento() {
    return this.departamento;
  }

  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }


}
