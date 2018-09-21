package tests;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import code.CDBCalc;

@RunWith(Parameterized.class)
public class TestRendimentoBruto {
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{ 60, 1000.0, 8.5, 13.97},
			{ 120, 500.0, 8.0, 13.15},
			{ 240, 3000.0, 9.0, 177.53}
		});
	}
	
	@Parameter
	public int dias;
	
	@Parameter(1)
	public double aplicacao;

	@Parameter(2)
	public double taxa;

	@Parameter(3)
	public double rendimento;
	
	@Test
	public void testMethod() {
		assertEquals(rendimento, CDBCalc.calcularRendimentoBruto(dias, aplicacao, taxa), 0.005);
	}
}
