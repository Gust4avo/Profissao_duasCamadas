package br.com.cadastro.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastro.model.Usuario;
import br.com.cadastro.service.UsuarioService;
import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/cadastro")
public class UsuarioController {

	private UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@GetMapping
	public ResponseEntity<List<Usuario>> listaUsuarios() {
		return ResponseEntity.status(200).body(usuarioService.listaUsuario());
	}

	@PostMapping
	public ResponseEntity<Usuario> criarUsuario(@Valid @RequestBody Usuario cadastro) {
		return ResponseEntity.status(201).body(usuarioService.criarUsuario(cadastro));
	}

	@PutMapping
	public ResponseEntity<Usuario> editarUsuario(@Valid @RequestBody Usuario cadastro) {
		return ResponseEntity.status(200).body(usuarioService.editarUsuario(cadastro));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluirUsuario(@PathVariable Integer id) {
		usuarioService.excluirUsuario(id);
		return ResponseEntity.status(204).build();
	}

}