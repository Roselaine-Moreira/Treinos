package com.bcopstein.Runner.Dominio;

import com.bcopstein.Runner.Entidades.Dominio.Treino;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TreinoTests {
  @Test
  public void criar() {
    Treino t1 = new Treino(
      Long.valueOf("1008"), 
      25, 
      16);
  }
}
