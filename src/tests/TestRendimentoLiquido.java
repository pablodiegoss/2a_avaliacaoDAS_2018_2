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
public class TestRendimentoLiquido{
	
	@Parameters(name="index = dias= {0}, aplicacao= {1}, taxa= {2}, rendimento esperado ={3}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{ 60, 1000.0, 8.5, 1.0829},
			{ 120, 500.0, 8.0, 2.0384},
			{ 240, 3000.0, 9.0, 4.7342}
		});
	}
	
	@Parameter
	public int dias;
	
	@Parameter(1)
	public double aplicacao;

	@Parameter(2)
	public double taxa;

	@Parameter(3)
	public double rendimentoLiq;
	
	@Test
	public void testMethod() {
		assertEquals(rendimentoLiq, CDBCalc.calcularRendimento(dias, aplicacao, taxa), 0.00005);
	}
}
