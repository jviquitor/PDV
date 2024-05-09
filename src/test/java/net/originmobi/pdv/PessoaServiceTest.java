package net.originmobi.pdv.service;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import net.originmobi.pdv.service.PessoaService;
import net.originmobi.pdv.model.Pessoa;
import net.originmobi.pdv.model.Endereco;
import net.originmobi.pdv.model.Cidade;
import net.originmobi.pdv.model.Telefone;
import net.originmobi.pdv.repository.PessoaRepository;
import main.java.net.*;

public class PessoaServiceTest {

	private PessoaService pessoaService;
	
	
	@BeforeEach
	public void inicializa() {
		pessoaService = new PessoaService();
		
	}
	
	@Mock
		List <Pessoa> pessoas;
		Pessoa pessoa = new Pessoa();
	
	@Test
	public void testList() {
		
		pessoas = pessoaService.lista();
		System.out.println(pessoas);
		Assertions.assertEquals(pessoaService.lista(), pessoas);
	}
	@Test
	public void testCadastrar() {
		
		if(pessoaService.cadastrar(Pessoa)) {
			System.out.println("pessoa cadastrada");	
		}else
			System.out.println("erro");
	}
	
	public void testBusca() {
		long codigo= pessoas[0].codigo;
		pessoa = pessoaService.busca(codigo);
		Pessoa pessoa2 = pessoas[0];
		Assertions.assertEquals(pessoa, pessoa2);
	}
	
	
	

}
