package com.example.proyectobackend.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="Postulante")
public class Postulante {
  @Id
@SequenceGenerator(name = "seq_td_pos", sequenceName = "seq_td_pos")
@GeneratedValue(generator = "seq_td_pos", strategy = GenerationType.SEQUENCE)
  private Long id;
  private String Nro_DNI;
  private String Nombres;
  private String Apellidos;
  private String Correo_electronico;
  private String Password;
  private String Tipo_usuario;
  private Date Fecha_nacimiento;
  private String Grado_academico;
  private String Telefono;
  
  @ManyToOne
  @JoinColumn(name="departamento_id")
    private Departamento departamento;
  @ManyToOne
  @JoinColumn(name="provincia_id")
    private Provincia provincia;
  @ManyToOne
  @JoinColumn(name="distrito_id")
    private Distrito distrito;


  public Postulante(String Nro_DNI, String Nombres, String Apellidos, String Correo_electronico, String Password, String Tipo_usuario, Date Fecha_nacimiento, String Grado_academico, String Telefono, Departamento departamento, Provincia provincia, Distrito distrito) {
    super();
    this.Nro_DNI = Nro_DNI;
    this.Nombres = Nombres;
    this.Apellidos = Apellidos;
    this.Correo_electronico = Correo_electronico;
    this.Password = Password;
    this.Tipo_usuario = Tipo_usuario;
    this.Fecha_nacimiento = Fecha_nacimiento;
    this.Grado_academico = Grado_academico;
    this.Telefono = Telefono;
    this.departamento = departamento;
    this.provincia = provincia;
    this.distrito = distrito;
  }
  public Postulante() {
  }

  public Long getId(){
    return this.id;
  }
  public void setId(Long id){
    this.id=id;
  }
  public String getNro_DNI() {
    return this.Nro_DNI;
  }

  public void setNro_DNI(String Nro_DNI) {
    this.Nro_DNI = Nro_DNI;
  }

  public String getNombres() {
    return this.Nombres;
  }

  public void setNombres(String Nombres) {
    this.Nombres = Nombres;
  }

  public String getApellidos() {
    return this.Apellidos;
  }

  public void setApellidos(String Apellidos) {
    this.Apellidos = Apellidos;
  }

  public String getCorreo_electronico() {
    return this.Correo_electronico;
  }

  public void setCorreo_electronico(String Correo_electronico) {
    this.Correo_electronico = Correo_electronico;
  }

  public String getPassword() {
    return this.Password;
  }

  public void setPassword(String Password) {
    this.Password = Password;
  }

  public String getTipo_usuario() {
    return this.Tipo_usuario;
  }

  public void setTipo_usuario(String Tipo_usuario) {
    this.Tipo_usuario = Tipo_usuario;
  }

  public Date getFecha_nacimiento() {
    return this.Fecha_nacimiento;
  }

  public void setFecha_nacimiento(Date Fecha_nacimiento) {
    this.Fecha_nacimiento = Fecha_nacimiento;
  }

  public String getGrado_academico() {
    return this.Grado_academico;
  }

  public void setGrado_academico(String Grado_academico) {
    this.Grado_academico = Grado_academico;
  }

  public String getTelefono() {
    return this.Telefono;
  }

  public void setTelefono(String Telefono) {
    this.Telefono = Telefono;
  }

  public Departamento getDepartamento() {
    return this.departamento;
  }

  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }

  public Provincia getProvincia() {
    return this.provincia;
  }

  public void setProvincia(Provincia provincia) {
    this.provincia = provincia;
  }

  public Distrito getDistrito() {
    return this.distrito;
  }

  public void setDistrito(Distrito distrito) {
    this.distrito = distrito;
  }
   
  

  

}
