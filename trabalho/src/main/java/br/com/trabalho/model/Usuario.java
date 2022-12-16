package br.com.trabalho.model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "trabalho")

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "localC", length = 255, nullable = false)
	private String localC;

	@Column(name = "especialidade")
	private String especialidade;

	@Column(name = "bibiografia", length = 255, nullable = false)
	private String bibiografia;

}
