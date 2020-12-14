package com.bcopstein.Runner.Entidades.Repositorio;

import com.bcopstein.Runner.Entidades.Dominio.Treino;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Treinos extends JpaRepository<Treino, Long> {
}