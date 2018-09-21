package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code.CDBCalc;

public class TestRendimentoLiquido {
	
	@Test
	public void testImposto1() {
		int dias = 60;
		double aplicacao = 1000.0;
		double taxaDeJuros = 8.5;
		assertEquals(1.0829, CDBCalc.calcularRendimento(dias,aplicacao,taxaDeJuros),0.00005);
	}
}
