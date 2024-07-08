package net.originmobi.pdv.service;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import net.originmobi.pdv.model.Pessoa;
import net.originmobi.pdv.model.Usuario;
import net.originmobi.pdv.repository.UsuarioRepository;


import org.junit.Test;

import static org.junit.Assert.assertFalse;

//----------

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class UsuarioServiceTest{
	
  
  @Autowired
  private UsuarioService usuarioService;
  
	private Usuario usuario;


  @Autowired
  private UsuarioRepository usuarioRepository;
  
	@BeforeEach
	public void inicializa() {
    //usuarioRepository.deleteAll(); // so sera necessario se voce quiser limpar a base sempre que iniciar novos testes
  
		usuario = new Usuario();
		usuario.setCodigo(1L);
		usuario.setUser("Alberta");
		usuario.setSenha("Alb123");
		usuario.setData_cadastro(Date.valueOf(LocalDate.now()));
		usuario.setGrupoUsuario(null);
    
    usuarioRepository.save(usuario);
    assertFalse(usuarioRepository.findAll().isEmpty());
	}
	
	@Test
	public void listaTest() {
	
		
		List<Usuario> usuarios = usuarioService.lista(); // pegando lista do service
		assertFalse(usuarios.isEmpty());
	}
}