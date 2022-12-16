package br.com.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trabalho.model.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer>{

}
