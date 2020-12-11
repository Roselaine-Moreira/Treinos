package com.bcopstein.Runner.Interface.Persistencia.Treino;

import java.util.List;

import com.bcopstein.Runner.Entidades.Dominio.Treino;

import org.springframework.data.repository.CrudRepository;

public interface TreinoH2BD_ITF extends CrudRepository<Treino, Long> {
  List<Treino> findByCodigoTreino(Long codigoTreino);

  List<Treino> findAll();
}
