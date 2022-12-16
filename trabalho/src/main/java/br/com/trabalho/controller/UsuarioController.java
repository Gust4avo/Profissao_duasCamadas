package br.com.trabalho.controller;

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

import br.com.trabalho.model.Usuario;
import br.com.trabalho.service.UsuarioService;
import jakarta.validation.Valid;


@RestController
@CrossOrigin("*")
@RequestMapping("/trabalho")
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
	public ResponseEntity<Usuario> criarUsuario(@Valid @RequestBody Usuario trabalho) {
		return ResponseEntity.status(201).body(usuarioService.criarUsuario(trabalho));
	}

	@PutMapping
	public ResponseEntity<Usuario> editarUsuario(@Valid @RequestBody Usuario trabalho) {
		return ResponseEntity.status(200).body(usuarioService.editarUsuario( trabalho));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluirUsuario(@PathVariable Integer id) {
		usuarioService.excluirUsuario(id);
		return ResponseEntity.status(204).build();
	}
}
