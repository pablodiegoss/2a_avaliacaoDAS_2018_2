package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code.CDBCalc;

public class TestImpostoDeRenda {

	@Test
	public void testImposto1() {
		int dias = 60;
		double aplicacao = 1000.0;
		double taxaDeJuros = 8.5;
		assertEquals(3.14, CDBCalc.calcularImpostoDeRenda(dias,aplicacao,taxaDeJuros),0.005);
	}
}
