package net.originmobi.pdv.filter;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;

public class ParcelaFilterTest{
	
	private ParcelaFilter testeParcela;
	
	@BeforeAll
	public void inicializa() {
		testeParcela = new ParcelaFilter();
		testeParcela.setNome("Geladeira");
	}
	
	
	@Test
	public void getNomeTest() {
		inicializa();
		String nome = testeParcela.getNome();
		Assertions.assertEquals("Geladeira", nome);	
	}
	
}
