package com.bcopstein.Runner.CasosDeUso;

import java.util.Collection;

import com.bcopstein.Runner.Entidades.Dominio.Corredor;
import com.bcopstein.Runner.Entidades.Dominio.Treino;
import com.bcopstein.Runner.Entidades.Dominio.TreinoAtribuido;
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
  private TreinoAtribuido treinosAtribuidos;

  @Autowired
  public ControleDeTreinos(Corredores corredores, Treinos treinos) {
    this.corredores = corredores;
    this.treinos = treinos;
  }

  // lista todos os corredores
  public Collection<Corredor> listaCorredores() {
    return corredores.todos();
  }

    // lista todos os treinos
    public Collection<Treino> listaTreinos() {
      return treinos.todos();
    }

  // public Corredor getCorredor(Long chave) {
  // return corredores.recupera(chave);
  // }

  // informa o codigo do corredor devolve o treino
  public Treino getTreino(Long chave) {
    return treinos.recupera(chave);
  }

  // registra o treino, passa o código do treino, tempo e esfoço

}
