package com.tito.springboot.criptografar.senha.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tito.springboot.criptografar.senha.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

    public Optional<UsuarioModel> findByLogin(String login);

}