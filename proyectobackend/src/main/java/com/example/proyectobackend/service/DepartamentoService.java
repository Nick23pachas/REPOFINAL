package com.example.proyectobackend.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import com.example.proyectobackend.dto.Departamento;
import com.example.proyectobackend.repository.DepartamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService implements DepartamentoRepository{
  @Autowired
  private DepartamentoRepository departamentoRepository;

  @Override
  public void deleteAllByIdInBatch(Iterable<Long> ids) {
    
    
  }

  @Override
  public void deleteAllInBatch() {
    
    
  }

  @Override
  public void deleteAllInBatch(Iterable<Departamento> entities) {
    
    
  }

  @Override
  public List<Departamento> findAll() {
    
    return departamentoRepository.findAll();
  }

  @Override
  public List<Departamento> findAll(Sort sort) {
    return departamentoRepository.findAll(sort);
  }

  @Override
  public <S extends Departamento> List<S> findAll(Example<S> example) {
    
    return null;
  }

  @Override
  public <S extends Departamento> List<S> findAll(Example<S> example, Sort sort) {
    
    return null;
  }

  @Override
  public List<Departamento> findAllById(Iterable<Long> ids) {
    
    return null;
  }

  @Override
  public void flush() {
    
    
  }

  @Override
  public Departamento getById(Long id) {
    
    return null;
  }

  @Override
  public Departamento getOne(Long id) {
    return null;
  }

  @Override
  public <S extends Departamento> List<S> saveAll(Iterable<S> entities) {
    return null;
  }

  @Override
  public <S extends Departamento> List<S> saveAllAndFlush(Iterable<S> entities) {
    return null;
  }

  @Override
  public <S extends Departamento> S saveAndFlush(S entity) {
    return null;
  }

  @Override
  public Page<Departamento> findAll(Pageable pageable) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void delete(Departamento entity) {
  }

  @Override
  public void deleteAll() {
    
  }

  @Override
  public void deleteAll(Iterable<? extends Departamento> entities) {
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
  public Optional<Departamento> findById(Long id) {
    return null;
  }

  @Override
  public <S extends Departamento> S save(S entity) {
    return null;
  }

  @Override
  public <S extends Departamento> long count(Example<S> example) {
    return 0;
  }

  @Override
  public <S extends Departamento> boolean exists(Example<S> example) {
    
    return false;
  }

  @Override
  public <S extends Departamento> Page<S> findAll(Example<S> example, Pageable pageable) {
    
    return null;
  }

  @Override
  public <S extends Departamento, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
    
    return null;
  }

  @Override
  public <S extends Departamento> Optional<S> findOne(Example<S> example) {
    
    return null;
  }
}
