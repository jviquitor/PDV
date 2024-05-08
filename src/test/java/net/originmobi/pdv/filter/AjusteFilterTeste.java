package net.originmobi.pdv.filter;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import net.originmobi.pdv.enumerado.cartao.CartaoSituacao;
import net.originmobi.pdv.enumerado.cartao.CartaoTipo;

import org.junit.Test;

public class AjusteFilterTeste{
	
	private AjusteFilter ajusteTeste;
	
	@BeforeAll
	public void inicializa() {
		ajusteTeste = new AjusteFilter();
		ajusteTeste.setCodigo(1L);
	}
	
	@Test
	public void getCodigoTest() {
		inicializa();
		Assertions.assertEquals(1L, ajusteTeste.getCodigo());
	}
	
}
