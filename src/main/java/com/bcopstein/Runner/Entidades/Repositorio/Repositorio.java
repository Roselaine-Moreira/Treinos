package com.bcopstein.Runner.Entidades.Repositorio;

import java.util.Collection;

public interface Repositorio<E, K> {
    void cadastra(E elemento);
    E recupera(K chave);
    Collection<E> todos();
    void atualiza(E elemento);
}
