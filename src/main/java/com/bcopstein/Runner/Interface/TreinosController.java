package com.bcopstein.Runner.Interface;

import java.util.Collection;
import java.util.List;

import com.bcopstein.Runner.CasosDeUso.ControleDeTreinos;
import com.bcopstein.Runner.Entidades.Dominio.Corredor;
import com.bcopstein.Runner.Entidades.Dominio.Treino;
import com.bcopstein.Runner.Entidades.Dominio.TreinoAtribuido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

  // envia a lista todos os treinos
  @GetMapping("/treinosAtribuidos")
  @CrossOrigin(origins = "*")
  public Collection<Treino> listaTreinos() {
    return ctrlTreinos.listaTreinos();
  }


  // passa o codigo do corredor e devolve o treino
    //recebe uma placa e libera o carro para uma nova locacao
    // @PostMapping("/exibeTreino")
    // @CrossOrigin(origins = "*")
    // public boolean exibirTreino(@RequestParam final Long codCorredor) {    
    //   return ctrlTreinos.getTreino(codCorredor);
    // }

    // @GetMapping("/exibeTreino")
    // @CrossOrigin(origins = "*")
    // public boolean exibirTreino(@RequestParam final Integer codProd,
    //                           @RequestParam final Integer qtdade) {
    //     return ctrlVendas.podeVender(codProd, qtdade);
    // }

  // registra o treino, passa o código do treino, tempo e esfoço 

}
