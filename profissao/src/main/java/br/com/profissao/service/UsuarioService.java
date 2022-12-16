package br.com.profissao.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.profissao.model.Usuario;
import br.com.profissao.repository.IUsuario;
import jakarta.validation.Valid;

@Service
public class UsuarioService {

	private IUsuario repository;

	public UsuarioService(IUsuario repository) {
		this.repository = repository;

	}

	public List<Usuario> listaUsuario() {
		List<Usuario> lista = repository.findAll();
		return lista;
	}

	public Usuario criarUsuario(@Valid Usuario atuacao) {
		Usuario usuarioNovo = repository.save(atuacao);
		return usuarioNovo;
	}

	public Usuario editarUsuario(Usuario atuacao) {
		Usuario usuarioNovo = repository.save(atuacao);
		return usuarioNovo;
	}

	public Boolean excluirUsuario(Integer id) {
		repository.deleteById(id);
		return true;
	}
}
