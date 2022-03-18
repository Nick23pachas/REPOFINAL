package com.example.proyectobackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import com.example.proyectobackend.dto.Provincia;
import com.example.proyectobackend.repository.ProvinciaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaService implements ProvinciaRepository{
  @Autowired
  private ProvinciaRepository provinciaRepository;

  @Override
  public List<Provincia> findAll() {
    // TODO Auto-generated method stub
    return provinciaRepository.findAll();
  }

  
  public List<Provincia> findAllByDepartamento(Long idD) {
    List<Provincia> provinciaRespuesta=new ArrayList<>();
    List<Provincia> provincia= provinciaRepository.findAll();
    for(int i=0; i<provincia.size();i++){
      if(provincia.get(i).getDepartamento().getId()==idD){
        provinciaRespuesta.add(provincia.get(i));
      }
    } 
    return provinciaRespuesta;
  }

  @Override
  public List<Provincia> findAll(Sort sort) {
    // TODO Auto-generated method stub
    return provinciaRepository.findAll(sort);
  }

  @Override
  public List<Provincia> findAllById(Iterable<Long> ids) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Provincia> List<S> saveAll(Iterable<S> entities) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void flush() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public <S extends Provincia> S saveAndFlush(S entity) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Provincia> List<S> saveAllAndFlush(Iterable<S> entities) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void deleteAllInBatch(Iterable<Provincia> entities) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAllByIdInBatch(Iterable<Long> ids) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAllInBatch() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Provincia getOne(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Provincia getById(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Provincia> List<S> findAll(Example<S> example) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Provincia> List<S> findAll(Example<S> example, Sort sort) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Page<Provincia> findAll(Pageable pageable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public long count() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void delete(Provincia entity) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAll() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAll(Iterable<? extends Provincia> entities) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAllById(Iterable<? extends Long> ids) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteById(Long id) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean existsById(Long id) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Optional<Provincia> findById(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Provincia> S save(S entity) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Provincia> long count(Example<S> example) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public <S extends Provincia> boolean exists(Example<S> example) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public <S extends Provincia> Page<S> findAll(Example<S> example, Pageable pageable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Provincia, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Provincia> Optional<S> findOne(Example<S> example) {
    // TODO Auto-generated method stub
    return null;
  }
  
}
