import java.util.Scanner;

public class questaoUm {
	public static double minimum(double valorum, double valordois, double valortres) {
		double result;
		result = Math.min(valorum , valordois);
		result = Math.min(result, valortres);
		return result;
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner valor = new Scanner(System.in);
		double valorum, valordois, valortres;
		String s;
		while (true) {
			System.out.println("digite os valores:");
			System.out.println("1º valor ou s para sair:");
			s = valor.next();
			if (s.equals("s")) {
				break;
			}
			else {
				valorum = Integer.parseInt(s);
			}
			System.out.println("2º valor:");
			valordois = valor.nextDouble();
			System.out.println("3º valor:");
			valortres = valor.nextDouble();
			System.out.println("o menor valor é: " + minimum(valorum, valordois, valortres));
		}
	}
}
