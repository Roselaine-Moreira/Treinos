package com.bcopstein.Runner.Entidades.Servicos;

import java.util.List;
import java.util.Optional;



import com.bcopstein.Runner.Entidades.Dominio.Corredor;
import com.bcopstein.Runner.Entidades.Repositorio.Corredores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorredoresService {
  @Autowired
  private Corredores corredoresRepository;

  public Corredor buscarPorCodigo(Long codigoCorredor){//retorna um corredor
    Optional<Corredor> resultado = corredoresRepository.findById(codigoCorredor);
    if(resultado.isEmpty()){
      throw new RuntimeException("Corredor não encontrado");
    }
    Corredor corredor = resultado.get();//se não tiver vazio ele pega o valor
    return corredor;

  }

  public List<Corredor> listar(){
    List<Corredor> resultado = corredoresRepository.findAll();
    return resultado;
  }
}
