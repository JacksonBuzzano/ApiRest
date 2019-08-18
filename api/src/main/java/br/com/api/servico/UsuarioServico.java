package br.com.api.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.modelo.RespostaModelo;
import br.com.api.modelo.UsuarioModelo;
import br.com.api.repositorio.UsuarioRepositorio;

//@CrossOrigin(origins="http://localhost:4200")
@CrossOrigin(origins="http://localhost:8090/api/usuario")
@RestController
@RequestMapping("/api")
public class UsuarioServico {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@RequestMapping(value="/usuario", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody RespostaModelo salvar(@RequestBody UsuarioModelo usuario){
		try {
			this.usuarioRepositorio.save(usuario);
			return new RespostaModelo("Registro salvo com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());			
		}
	}
	
	
	@RequestMapping(value="/usuario", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<UsuarioModelo> consultar(){	
		return this.usuarioRepositorio.findAll();
	}
	
	
	@RequestMapping(value="/usuario/{codigo}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody UsuarioModelo buscar(@PathVariable("codigo") Integer codigo){
		return this.usuarioRepositorio.findByCodigo(codigo);
	}
	

	
	@RequestMapping(value="/usuario", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody RespostaModelo atualizar(@RequestBody UsuarioModelo usuario){
		try {
			this.usuarioRepositorio.save(usuario);		
			return new RespostaModelo("Registro atualizado com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	
	
	@RequestMapping(value="/usuario/{codigo}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("codigo") Integer codigo){
		UsuarioModelo usuarioModelo = usuarioRepositorio.findByCodigo(codigo);
		try {
			this.usuarioRepositorio.delete(usuarioModelo);
			return new RespostaModelo("Registro excluido com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	

	
}
