package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code.CDBCalc;

public class TestRendimentoBruto {
	@Test
	public void testrb1() {
		int dias = 60;
		double aplicacao = 1000.0;
		double taxaDeJuros = 8.5;
		assertEquals(13.97, CDBCalc.calcularRendimentoBruto(dias,aplicacao,taxaDeJuros), 0.005);
	}
	
	@Test
	public void testrb2() {
		int dias = 120;
		double aplicacao = 500.0;
		double taxaDeJuros = 8.0;
		assertEquals(13.15, CDBCalc.calcularRendimentoBruto(dias,aplicacao,taxaDeJuros), 0.005);
	}
	
	@Test
	public void testrb3() {
		int dias = 240;
		double aplicacao = 3000.0;
		double taxaDeJuros = 9.0;
		assertEquals(177.53, CDBCalc.calcularRendimentoBruto(dias,aplicacao,taxaDeJuros), 0.005);
	}
}
