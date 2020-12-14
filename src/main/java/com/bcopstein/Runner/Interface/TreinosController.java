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
import com.bcopstein.Runner.Entidades.Servicos.CorredoresService;

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
  private CorredoresService corredoresService;
  
  // // private ControleDeTreinos ctrlTreinos;

  // // @Autowired
  // // private Corredores corredoresRepository;
  // // @Autowired
  // // private Treinos treinosRepository;
  // // @Autowired
  // // private TreinosAtribuidos treinosAtribuidosRepository;

  @GetMapping("/{codigoCorredor}")
  public Corredor buscarPorCodigo(@PathVariable Long codigoCorredor) {
  Corredor corredor = corredoresService.buscarPorCodigo(codigoCorredor);
  return corredor;
  }

  @GetMapping("/listaCorredores")
  @CrossOrigin(origins = "*")
  public List<Corredor> listar() {
    List<Corredor> corredores = corredoresService.listar();
    return corredores;
  }

  // // // envia a lista dos corredores
  // // @GetMapping("/listaCorredores")
  // // @CrossOrigin(origins = "*")
  // // public List<Corredor> listar() {
  // //   List<Corredor> corredores = corredoresRepository.findAll();
  // //   return corredores;
  // // }

  // // //busca corredor por código
  // // localhost:8080/runner/27
  // // @GetMapping("/{codigoCorredor}")
  // // public Corredor buscar(@PathVariable Long codigoCorredor) {
  // // Optional<Corredor> resultado = corredoresRepository.findById(codigoCorredor);
  // // Corredor corredor = resultado.get();
  // // return corredor;
  // // }


    // // //buscar por código
    // //repetido
    // // @GetMapping("/buscaCodigo/{codigoCorredor}")
    // // @CrossOrigin(origins = "*")
    // // public Corredor buscar(@PathVariable Long codigoCorredor){//esse é o filtro Long codigoCorredor 
    // //  Optional<Corredor> resultado = corredoresRepository.findById(codigoCorredor);//Optional<Corredor> qdo não acha nada ele recebe um null
    // //  Corredor corredor = resultado.get(); //aqui pega o corredor
    // //  return corredor;
    // // }

  // // //exibe um treinoAtribuido passando o código do treino
  // // localhost:8080/runner/2222
  // // @GetMapping("/{codigoTreinoAtribuido}")
  // // @CrossOrigin(origins = "*")
  // // public TreinoAtribuido buscar(@PathVariable Long codigoTreinoAtribuido) {
  // // Optional<TreinoAtribuido> resultado =
  // // treinosAtribuidosRepository.findById(codigoTreinoAtribuido);
  // // TreinoAtribuido treino = resultado.get();
  // // return treino;
  // // }

  // // //inserir corredor
  // // @PostMapping("/inserir")
  // // @CrossOrigin(origins = "*")
  // // public Corredor inserir(@RequestBody Corredor corredor) {
  // // Corredor corredorSalvo = corredoresRepository.save(corredor);
  // // return corredorSalvo;
  // // }

  // // // //excluir corredor retorna o corredor excluido
  // // // exclui pela chave
  // // @DeleteMapping("/{corredor}")
  // // @CrossOrigin(origins = "*")
  // // public Corredor excluir(@PathVariable Long corredor) {
  // // // Optional se não encontrar retorna nulo
  // // Optional<Corredor> corredorEncontrado =
  // // corredoresRepository.findById(corredor);// busca pelo id código
  // // corredoresRepository.delete(corredorEncontrado.get());// get para pegar o
  // // conteudo do objeto
  // // Corredor corredorRetorno = corredorEncontrado.get();
  // // return corredorRetorno;
  // // }

  // // // editar
  // // @PutMapping("/editar")
  // // @CrossOrigin(origins = "*")
  // // public Corredor editar(@RequestBody Corredor corredor) {// @RequestBody
  // // parametro vem pelo corpo,
  // // // trabalha com o objeto
  // // Corredor corredorEditado = corredoresRepository.save(corredor);
  // // return corredorEditado;
  // // }

}
