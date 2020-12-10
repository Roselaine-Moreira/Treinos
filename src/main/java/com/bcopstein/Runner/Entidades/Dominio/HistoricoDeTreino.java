package com.bcopstein.Runner.Entidades.Dominio;

import java.time.LocalDate;

import com.bcopstein.Runner.Entidades.Dominio.Corredor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class HistoricoDeTreino {
  @Id
  private Long codigoHistorico;
  private Long codigoCorredor;
  private int idade;
  private double distancia;
  private int tempo;
  private LocalDate data;
  private int esforco;

  public HistoricoDeTreino() {
    this.codigoCorredor = -1L;
    //this.corredor = null;
    this.distancia = 0.0;
    this.tempo = 0;
    this.data = null;
    this.esforco = 0;
  }

  public Long getCodigoCorredor() {
    return codigoCorredor;
  }

 // public Corredor getCorredor() {
  //  return corredor;
 // }

  // public void setNomeCorredor(Corredor corredor) {
  // this.corredor = corredor;
  // }

  public double getDistancia() {
    return distancia;
  }

  public int getTempo() {
    return tempo;
  }

  public LocalDate getData() {
    return data;
  }

  public int getEsforco() {
    return esforco;
  }

  @Override
  public String toString() {
    return "Corredor [codigoCorredor=" + codigoCorredor + ", corredor="  + ", distancia=" + distancia
        + ", tempo=" + tempo + ", data=" + data + ", esforco=" + esforco + "]";
  }

}