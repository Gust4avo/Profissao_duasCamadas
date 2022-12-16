package br.com.profissao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.profissao.model.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer>{

}
