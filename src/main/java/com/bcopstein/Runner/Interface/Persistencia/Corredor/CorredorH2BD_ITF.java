package com.bcopstein.Runner.Interface.Persistencia.Corredor;

import java.util.List;

import com.bcopstein.Runner.Entidades.Dominio.Corredor;

import org.springframework.data.repository.CrudRepository;

public interface CorredorH2BD_ITF extends CrudRepository<Corredor, Long> {
  List<Corredor> findByCodigoCorredor(Long codigoCorredor);

  List<Corredor> findAll();
}