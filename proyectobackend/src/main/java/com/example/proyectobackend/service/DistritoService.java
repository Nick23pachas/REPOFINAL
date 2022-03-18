package com.example.proyectobackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import com.example.proyectobackend.dto.Distrito;
import com.example.proyectobackend.repository.DistritoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
@Service
public class DistritoService implements DistritoRepository{
  @Autowired
  private DistritoRepository distritoRepository;

  @Override
  public List<Distrito> findAll() {
    // TODO Auto-generated method stub
    return distritoRepository.findAll();
  }

  @Override
  public List<Distrito> findAll(Sort sort) {
    // TODO Auto-generated method stub
    return distritoRepository.findAll(sort);
  }

  public List<Distrito> findAllByProvincia(Long id) {
    List<Distrito> distritoRespuesta=new ArrayList<>();
    List<Distrito> distritos= distritoRepository.findAll();
    for(int i=0; i<distritos.size();i++){
      if(distritos.get(i).getProvincia().getId()==id){
        distritoRespuesta.add(distritos.get(i));
      }
    } 
    return distritoRespuesta;
  }

  @Override
  public List<Distrito> findAllById(Iterable<Long> ids) {

    return null;
  }

  @Override
  public <S extends Distrito> List<S> saveAll(Iterable<S> entities) {
  
    return null;
  }

  @Override
  public void flush() {
    
    
  }

  @Override
  public <S extends Distrito> S saveAndFlush(S entity) {
  
    return null;
  }

  @Override
  public <S extends Distrito> List<S> saveAllAndFlush(Iterable<S> entities) {
  
    return null;
  }

  @Override
  public void deleteAllInBatch(Iterable<Distrito> entities) {
  
    
  }

  @Override
  public void deleteAllByIdInBatch(Iterable<Long> ids) {
  
    
  }

  @Override
  public void deleteAllInBatch() {
  
    
  }

  @Override
  public Distrito getOne(Long id) {
  
    return null;
  }

  @Override
  public Distrito getById(Long id) {
  
    return null;
  }

  @Override
  public <S extends Distrito> List<S> findAll(Example<S> example) {
  
    return null;
  }

  @Override
  public <S extends Distrito> List<S> findAll(Example<S> example, Sort sort) {
  
    return null;
  }

  @Override
  public Page<Distrito> findAll(Pageable pageable) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void delete(Distrito entity) { 
  }

  @Override
  public void deleteAll() {
  
  }

  @Override
  public void deleteAll(Iterable<? extends Distrito> entities) {
  
    
  }

  @Override
  public void deleteAllById(Iterable<? extends Long> ids) {
  
    
  }

  @Override
  public void deleteById(Long id) {
  
    
  }

  @Override
  public boolean existsById(Long id) {
  
    return false;
  }

  @Override
  public Optional<Distrito> findById(Long id) {
  
    return null;
  }

  @Override
  public <S extends Distrito> S save(S entity) {
  
    return null;
  }

  @Override
  public <S extends Distrito> long count(Example<S> example) {
  
    return 0;
  }

  @Override
  public <S extends Distrito> boolean exists(Example<S> example) {
  
    return false;
  }

  @Override
  public <S extends Distrito> Page<S> findAll(Example<S> example, Pageable pageable) {
  
    return null;
  }

  @Override
  public <S extends Distrito, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
  
    return null;
  }

  @Override
  public <S extends Distrito> Optional<S> findOne(Example<S> example) {
    // TODO Auto-generated method stub
    return null;
  }
}
