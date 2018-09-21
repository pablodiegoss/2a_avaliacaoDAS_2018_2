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
public class TestImpostoDeRenda{
	
	@Parameters(name="index = dias= {0}, aplicacao= {1}, taxa= {2}, imposto={3}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{ 60, 1000.0, 8.5, 3.14},
			{ 120, 500.0, 8.0, 2.96},
			{ 240, 3000.0, 9.0, 35.51}
		});
	}
	
	@Parameter
	public int dias;
	
	@Parameter(1)
	public double aplicacao;

	@Parameter(2)
	public double taxa;

	@Parameter(3)
	public double imposto;
	
	@Test
	public void testMethod() {
		assertEquals(imposto, CDBCalc.calcularImpostoDeRenda(dias, aplicacao, taxa), 0.005);
	}
}
