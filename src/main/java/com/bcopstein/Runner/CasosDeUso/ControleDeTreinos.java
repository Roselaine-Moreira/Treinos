package com.bcopstein.Runner.CasosDeUso;

import java.util.List;
import java.util.Optional;

import com.bcopstein.Runner.Entidades.Dominio.Corredor;
import com.bcopstein.Runner.Entidades.Dominio.TreinoAtribuido;
import com.bcopstein.Runner.Entidades.Repositorio.Corredores;
import com.bcopstein.Runner.Entidades.Repositorio.TreinosAtribuidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// lista todos os corredores
// informa o codigo do corredor devolve o treino
// registra o treino, passa o código do treino, tempo e esfoço 

@Component
public class ControleDeTreinos {

  @Autowired
  private Corredores corredoresRepository;
  @Autowired
  private TreinosAtribuidos treinosAtribuidosRepository;
  private TreinoAtribuido treinoAtribuido;
  private Corredor corredor;

  @Autowired
  public ControleDeTreinos(TreinosAtribuidos treinosAtribuidosRepository) {
    this.treinosAtribuidosRepository = treinosAtribuidosRepository;
    this.treinoAtribuido = treinoAtribuido;
  }

  // listar todos os corredores
  public List<Corredor> listar() {
    List<Corredor> resultado = corredoresRepository.findAll();
    return resultado;
  }

  // busca corredor por código
  public Corredor buscarPorCodigo(Long codigoCorredor) {// retorna um corredor
    Optional<Corredor> resultado = corredoresRepository.findById(codigoCorredor);
    if (resultado.isEmpty()) {
      throw new RuntimeException("Corredor não encontrado");
    }
    Corredor corredor = resultado.get();// se não tiver vazio ele pega o valor
    return corredor;

  }

  // busca TreinoAtribuido por código
  public TreinoAtribuido buscarTreinoPorCodigo(Long codigoTreinoAtribuido) {
    Optional<TreinoAtribuido> resultado = treinosAtribuidosRepository.findById(codigoTreinoAtribuido);
    if (resultado.isEmpty()) {
      throw new RuntimeException("Treino não encontrado");
    }
    TreinoAtribuido treinoAtribuido = resultado.get();// se não tiver vazio ele pega o valor
    return treinoAtribuido;
  }

  // inserir corredor
  public Corredor inserir(Corredor corredor) {
    Corredor corredorSalvo = corredoresRepository.save(corredor);
    return corredorSalvo;
  }

  // excluir corredor retorna o corredor excluido
  // exclui pela chave
  public Corredor excluirCorredor(Long corredor) {
    // Optional se não encontrar retorna nulo
    Optional<Corredor> corredorEncontrado = corredoresRepository.findById(corredor);// busca pelo id código
    corredoresRepository.delete(corredorEncontrado.get());// get para pegar o conteudo do objeto
    Corredor corredorRetorno = corredorEncontrado.get();
    return corredorRetorno;
  }

  // editar
  public Corredor editarCorredor(Corredor corredor) {
    Corredor corredorEditado = corredoresRepository.save(corredor);
    return corredorEditado;
  }

  // listar todos os TreinosAtribuidos
  public List<TreinoAtribuido> listarTreinosAtribuidos() {
    List<TreinoAtribuido> resultado = treinosAtribuidosRepository.findAll();
    return resultado;
  }

  // // editar Treino Atribuido
  public TreinoAtribuido editarTreinoAtribuido(TreinoAtribuido codigoTreinoAtribuido) {
    TreinoAtribuido treinoAtribuidoEditado = treinosAtribuidosRepository.save(codigoTreinoAtribuido);
    return treinoAtribuidoEditado;
  }

  // //  editar Treino Atribuido
  // public TreinoAtribuido editarTreinoAtribuido(TreinoAtribuido codigoTreinoAtribuido)
  // {
  // TreinoAtribuido tre = new
  // TreinoAtribuido(codigoTreinoAtribuido.getCodigoTreinoAtribuido(), null, 0,
  // 0);
  // tre.setTempoExecutado(15);
  // tre.setDistanciaExecutada(10);
  // tre.setEsforco(5);
  // TreinoAtribuido treinoAtribuidoEditado =
  // treinosAtribuidosRepository.save(tre);
  // return treinoAtribuidoEditado;
  // }
}
