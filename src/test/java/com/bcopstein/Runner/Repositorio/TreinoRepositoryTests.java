package com.bcopstein.Runner.Repositorio;

import com.bcopstein.Runner.Entidades.Dominio.Treino;
import com.bcopstein.Runner.Entidades.Repositorio.Treinos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TreinoRepositoryTests {

  @Autowired
  private Treinos treinosRepository;

  @Test
  public void inserir() {
    Treino t1 = new Treino(Long.valueOf("1009"), 18, 10);
    Treino t2 = new Treino(Long.valueOf("1010"), 26, 12);
    treinosRepository.save(t1);
    treinosRepository.save(t2);
  }
}
