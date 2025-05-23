package org.serratec.backend.trabalho.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class Endereco {
	@NotBlank(message = "Preencha a rua")
	@Column(nullable = false)
	private String rua;

	@NotBlank(message = "Preencha a cidade")
	@Column(nullable = false)
	private String cidade;

	@NotBlank(message = "Preencha o estado")
	@Column(nullable = false)
	private String estado;

	@NotBlank(message = "Preencha o CEP")
	@Column(nullable = false, length = 9)
	@Size(min = 9, max = 9)
	private String cep;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
