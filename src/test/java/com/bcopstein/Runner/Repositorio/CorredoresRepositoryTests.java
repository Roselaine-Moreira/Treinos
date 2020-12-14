package com.bcopstein.Runner.Repositorio;

import com.bcopstein.Runner.Entidades.Dominio.Corredor;
import com.bcopstein.Runner.Entidades.Repositorio.Corredores;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CorredoresRepositoryTests {

@Autowired
private Corredores corredoresRepository;

  @Test
  public void inserir(){
    Corredor c1 = new Corredor(
      Long.valueOf("77"), 
      "Luiz", 
      24);

      Corredor c2 = new Corredor(
      Long.valueOf("87"), 
      "Geovana", 
      29);

      corredoresRepository.save(c1);
      corredoresRepository.save(c2);
  }
}
