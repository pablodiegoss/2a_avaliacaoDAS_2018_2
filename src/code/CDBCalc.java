package code;

public class CDBCalc {

	public static double calcularRendimentoBruto(int dias, double aplicacao, double taxa) {
		double anos = dias/365.0;
		return aplicacao * (taxa/100 * anos);
	}
	public static double calcularImpostoDeRenda(int dias, double aplicacao, double taxa) {
		return 3.14;
	}
}
