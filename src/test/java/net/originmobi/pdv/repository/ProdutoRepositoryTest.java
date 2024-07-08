package net.originmobi.pdv.repository;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import net.originmobi.pdv.repository.ProdutoRepository;
import net.originmobi.pdv.service.ProdutoService;
import net.originmobi.pdv.enumerado.produto.ProdutoBalanca;
import net.originmobi.pdv.enumerado.produto.ProdutoSubstTributaria;
import net.originmobi.pdv.model.*;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.setAllowComparingPrivateFields;

//----------

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SpringBootTest
public class ProdutoRepositoryTest{
	
	Produto produto;
	@Autowired
	ProdutoService produtoService;
	private ProdutoRepository produtos;
	
	@BeforeEach
	public void inicializa() {
		produto = new Produto();
		produtoService = new ProdutoService();
		produto.setCodigo(1L);
		produto.setDescricao("Roda");
		produto.setValor_custo(430.26);
		produto.setValor_venda(980.90);
		produto.setValor_balanca(0.0);
		produto.setBalanca(ProdutoBalanca.NAO);
		produto.setData_validade(null);
		produto.setData_cadastro(null);
		produto.setVendavel(null);
		produto.setSubtributaria(ProdutoSubstTributaria.NAO);
		produto.setNcm(null);
		produto.setCest(null);
		produto.setData_cadastro(null);
		produto.setControla_estoque(null);
		produto.setFornecedor(null);
		produto.setTributacao(null);
		produto.setModBcIcms(null);
		produto.setEstoque(null);
	}
	
	
	@Test
	public void mergerTest() {
		inicializa();
		
		//this.produtoService.merger();
		
		
		
		this.produtoService.merger(0L, 12L, 36542L, 30L, 0, "Roda", 435.26, 980.90, null, null, null, null, ProdutoSubstTributaria.NAO, null, null, null, null, null);

	}
	
}

