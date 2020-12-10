package com.bcopstein.Runner.Interface;

import java.util.Collection;
import java.util.List;

import com.bcopstein.Runner.CasosDeUso.ControleDeTreinos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/treino")
public class TreinosController {

  private ControleDeTreinos ctrlTreinos;
  
  //cadastro de Treino
  @GetMapping(value = "/cadastro")
  public String getOu() {
    return "-----------------";
  }

  //cadastro de Corredor
  @GetMapping(value = "/corredor")
  public String getOi() {
    return "*******************";
  }

  //exibe os treinos a fazer
  @GetMapping(value = "/treinoAtribuido")
  public String getOiii() {
    return "/*/*/*/*/*";
  }

  //exibe os treinos feitos
  @GetMapping(value = "/historico")
  public String getOla() {
    return "88888888888888";
  }
}
