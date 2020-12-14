package com.bcopstein.Runner.Dominio;

import com.bcopstein.Runner.Entidades.Dominio.Corredor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CorredoresTests {
  @Test
  public void criar() {
    Corredor c1 = new Corredor(
      Long.valueOf("67"), 
      "Osvaldo", 
      32);
  }
}
