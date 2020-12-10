package com.bcopstein.Runner.Interface.Persistencia.Corredor;

import java.util.List;

import com.bcopstein.Runner.Entidades.Dominio.Corredor;


import org.springframework.data.repository.CrudRepository;

//String ou Long?
//String ou Long?
public interface CorredorH2BD_ITF extends CrudRepository<Corredor, String> {
  List<Corredor> findByCodigoCorredor(String codigoCorredor);

  List<Corredor> findAll();
}