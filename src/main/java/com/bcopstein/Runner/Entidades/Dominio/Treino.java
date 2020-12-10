package com.bcopstein.Runner.Entidades.Dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Treino {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int codigoTreino;
  private double distancia;
  private double tempo;

  protected Treino() {
  }

  public Treino(int codigoTreino, double distancia, double tempo) {
    this.codigoTreino = codigoTreino;
    this.distancia = distancia;
    this.tempo = tempo;
  }

  public int getCodigoTreino() {
    return codigoTreino;
  }

  public void setCodigoTreino(int codigoTreino) {
    this.codigoTreino = codigoTreino;
  }

  public double getDistancia() {
    return distancia;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }

  public double getTempo() {
    return tempo;
  }

  public void setTempo(double tempo) {
    this.tempo = tempo;
  }

  @Override
  public String toString() {
    return "Treino [codigoTreino=" + codigoTreino + ", distancia=" + distancia + ", tempo=" + tempo + "]";
  }
}