package com.bcopstein.Runner.Entidades.Dominio;

public class TreinoAtribuido {
  private Long codigoTreinoAtribuido;
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

  public Long getCorredor() {
    return codigoCorredor;
  }

  public double getTempoPrevisto() {
    return tempoPrevisto;
  }

  public double getTempoExecutado() {
    return tempoExecutado;
  }

  public double getDistanciaPrevista() {
    return distanciaPrevista;
  }

  public double getDistanciaExecutada() {
    return distanciaExecutada;
  }

  public int getEsforco() {
    return esforco;
  }

  @Override
  public String toString() {
    return "TreinoAtribuido [codigoTreinoAtribuido= " + codigoTreinoAtribuido + ", codigoCorredor= " + codigoCorredor
        + ", tempoPrevisto= " + tempoPrevisto + ", tempoExecutado= " + tempoExecutado + ", distanciaPrevista= "
        + distanciaPrevista + ", distanciaExecutada= " + distanciaExecutada + ", nivelEsforco= " + esforco + "]";
  }

}
