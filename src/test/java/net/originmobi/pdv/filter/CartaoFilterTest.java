package net.originmobi.pdv.filter;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import net.originmobi.pdv.enumerado.cartao.CartaoSituacao;
import net.originmobi.pdv.enumerado.cartao.CartaoTipo;

import org.junit.Test;

public class CartaoFilterTeste{
	
	CartaoFilter cartaoTeste;
	
	@BeforeEach
	public void inicializa() {
		cartaoTeste = new CartaoFilter();
		cartaoTeste.setTipo(CartaoTipo.CREDITO);
		cartaoTeste.setSituacao(CartaoSituacao.APROCESSAR);
		cartaoTeste.setData_recebimento("14/12/2024");
	}
	
	@Test
	public void getTipoTest(){	
		inicializa();
		Assertions.assertEquals(CartaoTipo.CREDITO, cartaoTeste.getTipo());
	}
	
	@Test
	public void getSituacaoTest(){
		inicializa();
		CartaoSituacao situacaoTeste = cartaoTeste.getSituacao();
		Assertions.assertEquals(CartaoSituacao.APROCESSAR, situacaoTeste);
	}
	
	@Test
	public void getData_recebimentoTest() {
		inicializa();
		String dataRecebimentoTeste = cartaoTeste.getData_recebimento();
		Assertions.assertEquals("14/12/2024", dataRecebimentoTeste);
	}
	
}
