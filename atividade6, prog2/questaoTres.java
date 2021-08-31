import java.util.Scanner;

public class questaoTres {
	public static double distance(double x, double y, double a, double b) {
		double d = (a - x) * (a - x);
		d = d + (b - y) * (b - y);
		return Math.sqrt(d);
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner valor = new Scanner(System.in);
		double x, y, a, b;
		String s;
		while (true) {
			System.out.println("digite o valores para saber a distância:");
			System.out.println("digite os valores do ponto 1 (x,y)");
			System.out.println("digite o valor x ou s para encerrar:");
			s = valor.next();
			if (s.equals("s")) {
				break;
			}
			else {
				x = Integer.parseInt(s);
			}
			System.out.println("digite o valor y:");
			y = valor.nextDouble();
			System.out.println("digite os valores do ponto 2 (a,b)");
			System.out.println("digite o valor a:");
			a = valor.nextDouble();
			System.out.println("digite o valor b:");
			b = valor.nextDouble();
			System.out.printf("ponto 1: (%.2f; %.2f) %nponto 2: (%.2f; %.2f) %n",x,y,a,b); 
			System.out.println("a distancia entre esses dois pontos é: " + distance(x,y,a,b));
		}
	}
}
