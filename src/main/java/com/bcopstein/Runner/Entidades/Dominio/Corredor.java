package com.bcopstein.Runner.Entidades.Dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Corredor {
  @Id
  private Long codigoCorredor;
  private String nomeCorredor;
  private int idade;

  protected Corredor() {
  }

  public Corredor(Long codigoCorredor, String nomeCorredor, int idade) {
    this.codigoCorredor = codigoCorredor;
    this.nomeCorredor = nomeCorredor;
    this.idade = idade;
  }

  public Long getCodigoCorredor() {
    return codigoCorredor;
  }

  public void setCodigoCorredor(Long codigoCorredor) {
    this.codigoCorredor = codigoCorredor;
  }

  public String getNomeCorredor() {
    return nomeCorredor;
  }

  public void setNomeCorredor(String nomeCorredor) {
    this.nomeCorredor = nomeCorredor;
  }

  public double getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  @Override
  public String toString() {
    return "Corredor [codigoCorredor=" + codigoCorredor + ", nomeCorredor=" + nomeCorredor + ", idade=" + idade + "]";
  }

}
