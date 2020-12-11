package com.bcopstein.Runner.Interface.Persistencia.Corredor;

import java.util.Collection;

import com.bcopstein.Runner.Entidades.Dominio.Corredor;
import com.bcopstein.Runner.Entidades.Repositorio.Corredores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CorredorH2BD_IMPL implements Corredores {
    private CorredorH2BD_ITF corredoresBD;

    @Autowired
    public CorredorH2BD_IMPL(CorredorH2BD_ITF corredoresBD) {
        this.corredoresBD = corredoresBD;
    }

    @Override
    public void cadastra(Corredor corredor) {
        corredoresBD.save(corredor);
    }

    @Override
    public Corredor recupera(Long chave) {
        return corredoresBD.findByCodigoCorredor(chave).get(0);
    }

    @Override
    public Collection<Corredor> todos() {
        return corredoresBD.findAll();
    }

    @Override
    public void atualiza(Corredor corredor) {
        corredoresBD.save(corredor);
    }

}