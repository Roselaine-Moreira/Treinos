package com.bcopstein.Runner.Interface;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.bcopstein.Runner.CasosDeUso.ControleDeTreinos;
import com.bcopstein.Runner.Entidades.Dominio.Corredor;
import com.bcopstein.Runner.Entidades.Dominio.Treino;
import com.bcopstein.Runner.Entidades.Dominio.TreinoAtribuido;
import com.bcopstein.Runner.Entidades.Repositorio.Corredores;
import com.bcopstein.Runner.Entidades.Repositorio.Treinos;
import com.bcopstein.Runner.Entidades.Repositorio.TreinosAtribuidos;
// import com.bcopstein.Runner.Entidades.Servicos.CorredoresService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/runner")
public class TreinosController {

  @Autowired
  private ControleDeTreinos controlTreinos;

  // envia a lista dos corredores
  @GetMapping("/listaCorredores")
  @CrossOrigin(origins = "*")
  public List<Corredor> listar() {
    List<Corredor> corredores = controlTreinos.listar();
    return corredores;
  }

  // busca corredor por código
  // localhost:8080/runner/27
  @GetMapping("/{codigoCorredor}")
  public Corredor buscarPorCodigo(@PathVariable Long codigoCorredor) {
    Corredor corredor = controlTreinos.buscarPorCodigo(codigoCorredor);
    return corredor;
  }

  // exibe um treinoAtribuido passando o código do treino
  // localhost:8080/runner/buscaTreinoAtribuido/2222
  @GetMapping("/buscaTreinoAtribuido/{codigoTreinoAtribuido}")
  public TreinoAtribuido buscarTreinoPorCodigo(@PathVariable Long codigoTreinoAtribuido) {
    TreinoAtribuido treinoAtribuido = controlTreinos.buscarTreinoPorCodigo(codigoTreinoAtribuido);
    return treinoAtribuido;
  }

  // inserir corredor
  @PostMapping("/inserir")
  @CrossOrigin(origins = "*")
  public Corredor inserir(@RequestBody Corredor corredor) {
    Corredor corredorSalvo = controlTreinos.inserir(corredor);
    return corredorSalvo;
  }

  // //excluir corredor retorna o corredor excluido
  // exclui pela chave
  @DeleteMapping("/{corredor}")
  @CrossOrigin(origins = "*")
  public Corredor excluir(@PathVariable Long corredor) {
    Corredor corredorRetorno = controlTreinos.excluirCorredor(corredor);
    return corredorRetorno;
  }

  // editar
  @PutMapping("/editar")
  @CrossOrigin(origins = "*")
  public Corredor editar(@RequestBody Corredor corredor) {// @RequestBody parametro vem pelo corpo
    Corredor corredorEditado = controlTreinos.editarCorredor(corredor);
    return corredorEditado;
  }

  // lista de treinosAtribuidos
  @GetMapping("/buscaTodosTreinosAtribuidos")
  @CrossOrigin(origins = "*")
  public List<TreinoAtribuido> listarTodosTreinosAtribuidos() {
    List<TreinoAtribuido> treinosAtribuidos = controlTreinos.listarTreinosAtribuidos();
    return treinosAtribuidos;
  }

    // editar
    @PutMapping("/editarTreinoAtribuido")
    @CrossOrigin(origins = "*")
    public TreinoAtribuido editar(@RequestBody TreinoAtribuido treinoAtribuido) {// @RequestBody parametro vem pelo corpo
      TreinoAtribuido treinoAtribuidoEditado = controlTreinos.editarTreinoAtribuido(treinoAtribuido);
      return  treinoAtribuidoEditado;
    }

}
