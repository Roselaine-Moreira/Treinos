package com.bcopstein.Runner.CasosDeUso;

import java.util.Collection;

import com.bcopstein.Runner.Entidades.Dominio.Corredor;
import com.bcopstein.Runner.Entidades.Repositorio.Corredores;
import com.bcopstein.Runner.Entidades.Repositorio.Treinos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// lista todos os corredores
// informa o codigo do corredor devolve o treino
// registra o treino, passa o código do treino, tempo e esfoço 

@Component
public class ControleDeTreinos {
  private Corredores corredores;
  private Treinos treinos;
  // private TreinoAtribuido treinoAtribuido;

  @Autowired
  public ControleDeTreinos(Corredores corredores, Treinos treinos) {
    this.corredores = corredores;
    this.treinos = treinos;

  }

  // lista todos os corredores
  public Collection<Corredor> listaCorredores() {
    return corredores.todos();
  }

  public Corredor getCorredor(Long chave) {
    return corredores.recupera(chave);
  }
}
