package com.bcopstein.Runner.Interface.Persistencia.Treino;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.bcopstein.Runner.Entidades.Dominio.Treino;
import com.bcopstein.Runner.Entidades.Repositorio.Treinos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TreinoH2BD_IMPL implements Treinos {
    private TreinoH2BD_ITF treinosDB;

    @Autowired
    public TreinoH2BD_IMPL(TreinoH2BD_ITF treinosDB){
        this.treinosDB = treinosDB;
    }

    @Override
    public void carrega() {
        // nao é usado
    }

    @Override
    public void persiste() {
        // nao é usado
    }

    //cadastra um treino
    @Override
    public void cadastra(Treino treino) {
        treinosDB.save(treino);
    }

    @Override
    public Treino recupera(String chave) {
        return treinosDB.findByCodigoTreino(chave).get(0);
    }

    @Override
    public Collection<Treino> todos() {        
        return treinosDB.findAll();
    }

    @Override
    public boolean existente(String chave) {
        return treinosDB.existsById(chave);
    }

    @Override
    public Collection<Treino> pesquisa(Predicate<Treino> pred) {
        return treinosDB.findAll()
                         .stream()
                         .filter(pred)
                         .collect(Collectors.toList());
    }

    @Override
    public void atualiza(Treino treino) {
      treinosDB.save(treino);
    }

    @Override
    public void remove(String chave) {
      treinosDB.deleteById(chave);
    }
}