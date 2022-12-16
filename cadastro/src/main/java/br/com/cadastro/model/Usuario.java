package br.com.cadastro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "cadastro")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@NotBlank(message = "O nome é obrigatótirio!")
	@Column(name = "nome", length = 50, nullable = false)
	private String nome;

	@NotBlank(message = "O contato é obrigatótiria!")
	@Column(name = "contato", length = 20, nullable = false)
	private String contato;

	@NotBlank(message = "O CEP é obrigatótiria!")
	@Column(name = "cep", length = 9, nullable = false)
	private String cep;

	@NotBlank(message = "A seleção é obrigatoria!")
	@Column(name = "cliente", length = 10, nullable = false)
	private String cliente;


}
