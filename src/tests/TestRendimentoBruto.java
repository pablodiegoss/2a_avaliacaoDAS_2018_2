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
	
	@Parameters(name="{index} = dias= {0}, aplicacao= {1}, taxa= {2}, resultado={3}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{ 60, 1000.0, 8.5, 13.97},
			{ 120, 500.0, 8.0, 13.15},
			{ 240, 3000.0, 9.0, 177.53},
			{ 270, 2000.0, 8.5, 125.75},
			{ 390, 100.0, 7.5, 8.01},
			{ 420, 250.0, 8.0, 23.01},
			{ 550, 400.0, 8.0, 48.22},
			{ 670, 800.0, 8.0, 117.48},
			{ 700, 2500.0, 9.0, 431.51},
			{ 900, 4200.0, 9.5, 983.84},
			{ 1000, 100.0, 7.5, 20.55},
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
