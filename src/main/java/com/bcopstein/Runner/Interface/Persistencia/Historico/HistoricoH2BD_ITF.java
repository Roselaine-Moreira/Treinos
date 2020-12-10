package com.bcopstein.Runner.Interface.Persistencia.Historico;

import com.bcopstein.Runner.Entidades.Dominio.HistoricoDeTreino;

import org.springframework.data.repository.CrudRepository;

public interface HistoricoH2BD_ITF extends CrudRepository<HistoricoDeTreino, String> {
    
}