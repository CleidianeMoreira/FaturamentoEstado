import java.util.Locale;
import java.util.Scanner;

public class Faturamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sp, rj, mg, es,outrosEstados;
		double faturamentoTotal;
		sp = 67836.43;
		rj = 36678.66;
		mg = 29229.88;
		es = 27165.48;
		outrosEstados = 19849.53;
		
		faturamentoTotal = sp + rj + mg + es + outrosEstados;
		
		double percentualSP = (sp * 100) /faturamentoTotal;
		System.out.printf("Percentual do estado de São Paulo: %.2f%n", percentualSP);
		double percentualRJ = (rj * 100) /faturamentoTotal;
		System.out.printf("Percentual do estado do Rio de Janeiro: %.2f%n", percentualRJ);
		double percentualMG = (mg * 100) /faturamentoTotal;
		System.out.printf("Percentual do estado de Minas Gerais: %.2f%n", percentualMG);
		double percentualES = (es * 100) /faturamentoTotal;
		System.out.printf("Percentual do estado do Espírito Santo: %.2f%n", percentualES);
		double percentualOutrosEstados = (outrosEstados * 100) /faturamentoTotal;
		System.out.printf("Percentual do estado de outros estados brasileiros: %.2f%n", percentualOutrosEstados);
		
		sc.close();
	}

}
