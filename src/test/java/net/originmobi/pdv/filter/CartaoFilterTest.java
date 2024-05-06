package net.originmobi.pdv.filter;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import net.originmobi.pdv.enumerado.cartao.CartaoSituacao;
import net.originmobi.pdv.enumerado.cartao.CartaoTipo;

import org.junit.Test;

public class CartaoFilterTeste{
	
	private CartaoFilter cartaoTeste;
	
	@BeforeAll
	public void inicializa() {
		cartaoTeste = new CartaoFilter();
		cartaoTeste.setTipo(CartaoTipo.CREDITO);
		cartaoTeste.setSituacao(CartaoSituacao.APROCESSAR);
		cartaoTeste.setData_recebimento("14/12/2024");
	}
	
	@Test
	public void getTipoTest(){
		CartaoTipo tipoTeste = CartaoTipo.CREDITO;
		Assertions.assertEquals(CartaoTipo.CREDITO, tipoTeste);
	}
	
	@Test
	public void getSituacaoTest(){
		CartaoSituacao situacaoTeste = CartaoSituacao.APROCESSAR;
		Assertions.assertEquals(CartaoSituacao.APROCESSAR, situacaoTeste);
	}
	
	@Test
	public void getData_recebimentoTest() {
		String dataRecebimentoTeste = "14/12/2024";
		Assertions.assertEquals("14/12/2024", dataRecebimentoTeste);
	}
	
}
