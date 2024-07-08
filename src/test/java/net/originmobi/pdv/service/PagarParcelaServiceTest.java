package net.originmobi.pdv.service;

import net.originmobi.pdv.repository.ParcelaRepository;
import net.originmobi.pdv.model.Parcela;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.*;

@SpringBootTest
public class PagarParcelaServiceTest{
	
	@Autowired
	private PagarParcelaService pagarParcelaService;
	
	@Autowired
	private Parcela parcelas;
	
	@Autowired
	ParcelaRepository pagarParcelaRepository;
	
	@BeforeEach
	public void inicializa() {
		
		Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());
		
		parcelas.setValor_total(899.99);
		parcelas.setValor_desconto(null);
		parcelas.setValor_acrescimo(null);
		parcelas.setValor_recebido(null);
		parcelas.setValor_restante(899.99);
		parcelas.setQuitado(0);
		parcelas.setData_cadastro(dataDeHoje);
		parcelas.setData_vencimento(Date.valueOf(LocalDate.now()));
		parcelas.setData_pagamento(dataDeHoje);	
	}
	
	@Test
	public void pagarParcela() {
		inicializa();
		
		pagarParcelaRepository.save(parcelas);
		
		pagarParcelaService.cadastrar(899.90, 899.90, 0, null, null, null);
	}
	
}