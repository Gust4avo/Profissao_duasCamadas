package br.com.profissao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "atuacao")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome", length = 50, nullable = false)
	private String nome;

	@Column(name = "modotrabalho", length = 50, nullable = false)
	private String modotrabalho;

	@Column(name = "localA", length = 255, nullable = false)
	private String localA;

	@Column(name = "especialidade" )
	private String  especialidade;
	


}
