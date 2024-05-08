package net.originmobi.pdv;

import net.originmobi.pdv.filter.BancoFilter;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class BancoFilterTest{
	
	private BancoFilter testeBanco;
	
	@Before
	public void inicializa() {
		testeBanco = new BancoFilter();
		testeBanco.setDataCadastro("06/05/2024");
	}
	
	
	@Test
	public void getDataCadastroTest() {
		inicializa();
		String data = testeBanco.getDataCadastro();
		Assert.assertEquals("06/05/2024", data);	
	}
	
}
