package com.bcopstein.Runner.Interface.Persistencia.Treino;

import java.util.Collection;

import com.bcopstein.Runner.Entidades.Dominio.Treino;
import com.bcopstein.Runner.Entidades.Repositorio.Treinos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TreinoH2BD_IMPL implements Treinos {
    private TreinoH2BD_ITF treinosDB;

    @Autowired
    public TreinoH2BD_IMPL(TreinoH2BD_ITF treinosDB) {
        this.treinosDB = treinosDB;
    }

    @Override
    public void cadastra(Treino treino) {
        treinosDB.save(treino);
    }

    @Override
    public Treino recupera(Long chave) {
        return treinosDB.findByCodigoTreino(chave).get(0);
    }

    @Override
    public Collection<Treino> todos() {
        return treinosDB.findAll();
    }

    @Override
    public void atualiza(Treino treino) {
        treinosDB.save(treino);
    }

}