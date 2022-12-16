package br.com.trabalho.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.trabalho.model.Usuario;
import br.com.trabalho.repository.IUsuario;

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

	public Usuario criarUsuario(Usuario trabalho) {
		Usuario usuarioNovo = repository.save(trabalho);
		return usuarioNovo;
	}

	public Usuario editarUsuario(Usuario trabalho) {
		Usuario usuarioNovo = repository.save(trabalho);
		return usuarioNovo;
	}

	public Boolean excluirUsuario(Integer id) {
		repository.deleteById(id);
		return true;
	}
}
