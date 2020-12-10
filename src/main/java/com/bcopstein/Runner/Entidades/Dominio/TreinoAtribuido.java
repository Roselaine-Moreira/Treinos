package com.bcopstein.Runner.Entidades.Dominio;

public class TreinoAtribuido {
  private Long codigoTreinoAtribuido;
  private Corredor corredor;
  private double tempoExecutado;

  protected TreinoAtribuido() {
  }

  public TreinoAtribuido(Long codigoTreinoAtribuido, Corredor corredor, double tempoExecutado) {
    this.codigoTreinoAtribuido = codigoTreinoAtribuido;
    this.corredor = corredor;
    this.tempoExecutado = tempoExecutado;
  }

  public Long getCodigoTreinoAtribuido() {
    return codigoTreinoAtribuido;
  }

  public Corredor getCorredor() {
    return corredor;
  }

  public double getTempoExecutado() {
    return tempoExecutado;
  }

  @Override
  public String toString() {
    return "TreinoAtribuido [codigoTreinoAtribuido= " + codigoTreinoAtribuido + ", corredor= " + corredor
        + ", tempoExecutado= " + tempoExecutado + ", nivelEsforco= " + "]";
  }
}
