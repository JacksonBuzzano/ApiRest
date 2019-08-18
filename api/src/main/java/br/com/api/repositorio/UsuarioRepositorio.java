package br.com.api.repositorio;

import java.util.List;
import org.springframework.data.repository.Repository;
import br.com.api.modelo.UsuarioModelo;


public interface UsuarioRepositorio extends Repository<UsuarioModelo, Integer>{

	//Métodos CRUD
	void save(UsuarioModelo usuario);
	List<UsuarioModelo> findAll();
	UsuarioModelo findByCodigo(Integer codigo);
	void delete(UsuarioModelo usuario);
	
	
}
