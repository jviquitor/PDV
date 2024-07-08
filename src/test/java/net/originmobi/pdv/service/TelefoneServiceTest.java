package net.originmobi.pdv.service;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import net.originmobi.pdv.enumerado.TelefoneTipo;
import net.originmobi.pdv.model.Telefone;
import net.originmobi.pdv.repository.TelefoneRepository;


import org.junit.Test;

//----------

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TelefoneServiceTest{
	
	TelefoneService telefoneService;
	Telefone telefone;
	
	@BeforeEach
	public void inicializa() {
		telefoneService = new TelefoneService();
		telefone = new Telefone();
		telefone.setCodigo(1L);
		telefone.setFone("+552126036527");
		telefone.setTipo(TelefoneTipo.FIXO);
		telefone.setData_cadastro(Date.valueOf(LocalDate.now()));
		telefoneService.cadastrar(telefone);
		
	}
	
	@Test
	public void cadastrarTest() {
		inicializa();
		telefoneService.cadastrar(telefone);
		
		

	}
	
}