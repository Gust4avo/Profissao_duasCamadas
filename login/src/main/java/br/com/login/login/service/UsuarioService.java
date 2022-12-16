package br.com.login.login.service;

import java.util.List;
import org.springframework.stereotype.Service;
import br.com.login.login.model.Usuario;
import br.com.login.login.repository.IUsuario;

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

	public Usuario criarUsuario(Usuario logar) {
	Usuario usuarioNovo = repository.save(logar);
		return usuarioNovo;
	}

	public Usuario editarUsuario(Usuario logar) {
		Usuario usuarioNovo = repository.save(logar);
		return usuarioNovo;
	}

	public Boolean excluirUsuario(Integer id) {
		repository.deleteById(id);
		return true;
	}

}
