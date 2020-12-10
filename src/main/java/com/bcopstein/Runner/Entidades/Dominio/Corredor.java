package com.bcopstein.Runner.Entidades.Dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Corredor {
  @Id
  private int codigoCorredor;
  private String nomeCorredor;
  private int idade;

  protected Corredor() {
  }

  public Corredor(int codigoCorredor, String nomeCorredor, int idade) {
    this.codigoCorredor = codigoCorredor;
    this.nomeCorredor = nomeCorredor;
    this.idade = idade;
  }

  public int getCodigoCorredor() {
    return codigoCorredor;
  }

  public void setCodigoCorredor(int codigoCorredor) {
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
