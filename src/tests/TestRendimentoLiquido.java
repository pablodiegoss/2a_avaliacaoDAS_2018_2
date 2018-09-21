package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code.CDBCalc;

public class TestRendimentoLiquido {
	
	@Test
	public void testRendimento1() {
		int dias = 60;
		double aplicacao = 1000.0;
		double taxaDeJuros = 8.5;
		assertEquals(1.0829, CDBCalc.calcularRendimento(dias,aplicacao,taxaDeJuros),0.00005);
	}
	@Test
	public void testRendimento2() {
		int dias = 120;
		double aplicacao = 500.0;
		double taxaDeJuros = 8;
		assertEquals(2.0384, CDBCalc.calcularRendimento(dias,aplicacao,taxaDeJuros),0.00005);
	}
	@Test
	public void testRendimento3() {
		int dias = 240;
		double aplicacao = 3000.0;
		double taxaDeJuros = 9;
		assertEquals(4.7342, CDBCalc.calcularRendimento(dias,aplicacao,taxaDeJuros),0.00005);
	}
}
