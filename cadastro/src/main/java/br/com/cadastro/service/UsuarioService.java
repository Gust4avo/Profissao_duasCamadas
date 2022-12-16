package br.com.cadastro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cadastro.model.Usuario;
import br.com.cadastro.repository.IUsuario;

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

	public Usuario criarUsuario(Usuario cadastro) {
	Usuario usuarioNovo = repository.save(cadastro);
		return usuarioNovo;
	}

	public Usuario editarUsuario(Usuario cadastro) {
		Usuario usuarioNovo = repository.save(cadastro);
		return usuarioNovo;
	}

	public Boolean excluirUsuario(Integer id) {
		repository.deleteById(id);
		return true;
	}

}