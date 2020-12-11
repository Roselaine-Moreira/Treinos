package com.bcopstein.Runner.Interface;

import java.util.Collection;
import java.util.List;

import com.bcopstein.Runner.CasosDeUso.ControleDeTreinos;
import com.bcopstein.Runner.Entidades.Dominio.Corredor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/treinos")
public class TreinosController {
  private ControleDeTreinos ctrlTreinos;

  @Autowired
  public TreinosController(ControleDeTreinos ctrlTreinos) {
    this.ctrlTreinos = ctrlTreinos;

  }

  // envia a lista dos corredores
  @GetMapping("/corredores")
  @CrossOrigin(origins = "*")
  public Collection<Corredor> listaCorredores() {
    return ctrlTreinos.listaCorredores();
  }

  // cadastro de Corredor
  @GetMapping(value = "/corredor")
  public String getOi() {
    return "*******************";
  }

  // exibe os treinos a fazer
  @GetMapping(value = "/treinoAtribuido")
  public String getOiii() {
    return "/*/*/*/*/*";
  }

  // exibe os treinos feitos
  @GetMapping(value = "/historico")
  public String getOla() {
    return "88888888888888";
  }
}
