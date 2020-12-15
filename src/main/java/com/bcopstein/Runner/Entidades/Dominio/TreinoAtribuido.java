package com.bcopstein.Runner.Entidades.Dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class TreinoAtribuido {
  @Id
  private Long codigoTreinoAtribuido;

//  @OneToOne
//  @JoinColumn(nullable=false, unique=true)
  private Long codigoCorredor;
  private double tempoPrevisto;
  private double tempoExecutado;
  private double distanciaPrevista;
  private double distanciaExecutada;
  private int esforco;

  protected TreinoAtribuido() {
  }

  public TreinoAtribuido(Long codigoTreinoAtribuido, Long codigoCorredor, double tempoPrevisto,
      double distanciaPrevista) {
    this.codigoTreinoAtribuido = codigoTreinoAtribuido;
    this.codigoCorredor = codigoCorredor;
    this.tempoPrevisto = tempoPrevisto;
    this.distanciaPrevista = distanciaPrevista;
    this.tempoExecutado = -1;
    this.distanciaExecutada = -1;
    this.esforco = 0;
  }

  public Long getCodigoTreinoAtribuido() {
    return codigoTreinoAtribuido;
  }
  public void setCodigoTreinoAtribuido(Long codigoTreinoAtribuido) {
    this.codigoTreinoAtribuido = codigoTreinoAtribuido;
  }

  public Long getCorredor() {
    return codigoCorredor;
  }

  public void setCodigoCorredor(Long codigoCorredor) {
    this.codigoCorredor = codigoCorredor;
  }

  public double getTempoPrevisto() {
    return tempoPrevisto;
  }
  
  public void setTempoPrevisto(double tempoPrevisto) {
    this.tempoPrevisto = tempoPrevisto;
  }

  public double getTempoExecutado() {
    return tempoExecutado;
  }
  
  public void setTempoExecutado(double tempoExecutado) {
    this.tempoExecutado = tempoExecutado;
  }

  public double getDistanciaPrevista() {
    return distanciaPrevista;
  }

  public void setDistanciaPrevista(double distanciaPrevista) {
    this.distanciaPrevista = distanciaPrevista;
  }

  public double getDistanciaExecutada() {
    return distanciaExecutada;
  }

  public void setDistanciaExecutada(double distanciaExecutada) {
    this.distanciaExecutada = distanciaExecutada;
  }

  public int getEsforco() {
    return esforco;
  }

  public void setEsforco(int esforco) {
    this.esforco = esforco;
  }

  @Override
  public String toString() {
    return "TreinoAtribuido [codigoTreinoAtribuido= " + codigoTreinoAtribuido + ", codigoCorredor= " + codigoCorredor
        + ", tempoPrevisto= " + tempoPrevisto + ", tempoExecutado= " + tempoExecutado + ", distanciaPrevista= "
        + distanciaPrevista + ", distanciaExecutada= " + distanciaExecutada + ", nivelEsforco= " + esforco + "]";
  }

}
