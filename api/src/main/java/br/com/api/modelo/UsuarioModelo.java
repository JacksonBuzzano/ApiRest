package br.com.api.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="usuarios")
@Entity
public class UsuarioModelo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//Colunas da tabela
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Integer codigo;
	 
	@Column(name="nome_usuario")
	private String  nome;
	 
	@Column(name="documento_usuario")
	private String  documento;
	 
	@Column(name="telefone_usuario")
	private String  telefone;
	
	@Column(name="data_usuario")
	private String  data;
	 
	@Column(name="total_usuario")
	private String  total;

	@Column(name="saida_usuario")
	private String  saida;

	
	

	//Set e Get
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	
	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

	
	
}
