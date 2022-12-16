package br.com.criandoapi.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	
	@NotBlank(message = "O email é obrigatótirio!")
	@Email(message = "Insira um email válido!")
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@NotBlank(message = "A Senha é obrigatótiria!")
	@Column(name = "senha", columnDefinition = "TEXT", nullable = false)
	private String senha;
	
	@NotBlank(message = "A Senha é obrigatótiria!")
	@Column(name = "cofsenha", columnDefinition = "TEXT", nullable = false)
	private String cofsenha;
	
	
	
	
	
	
		
}
