package br.com.api.modelo;

public class RespostaModelo {

	//Atributo
	private String mensagem;
	
	//Construtores
	public RespostaModelo() {}
	 
	public RespostaModelo(String mensagem) {
		this.mensagem =  mensagem;
	}

	//Set e Get
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
