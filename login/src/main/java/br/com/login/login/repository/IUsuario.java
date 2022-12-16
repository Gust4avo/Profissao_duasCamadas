package br.com.login.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.login.login.model.Usuario;


public interface IUsuario extends JpaRepository<Usuario, Integer>{


}
