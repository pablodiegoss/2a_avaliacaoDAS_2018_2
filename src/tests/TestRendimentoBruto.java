package tests;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;

public class TestRendimentoBruto {
	@Test
	public void testrb1() {
		int dias = 60;
		double aplicacao = 1000.0;
		double taxaDeJuros = 8.5;
		assertEquals(13.97, calcularRendimentoBruto(dias,aplicacao,taxaDeJuros), 0.001);
	}
}
