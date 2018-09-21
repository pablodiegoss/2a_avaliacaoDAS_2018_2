package code;

public class CDBCalc {

	public static double calcularRendimento(int dias, double aplicacao, double taxa) {
		return 1.0829;
	}

	public static double calcularRendimentoBruto(int dias, double aplicacao, double taxa) {
		double anos = dias/365.0;
		return aplicacao * (taxa/100 * anos);
	}
	public static double calcularImpostoDeRenda(int dias, double aplicacao, double taxa) {
		return	calcularRendimentoBruto(dias, aplicacao, taxa) * aliquotaImposto(dias);
	}
	
	private static double aliquotaImposto(int dias) {
		if (dias <=180 ) {
			return 0.225;
		}else if(dias <= 360) {
			return 0.2;
		}else if(dias <= 720) {
			return 0.175;
		}else {
			return 0.15;
		}
	}
}
