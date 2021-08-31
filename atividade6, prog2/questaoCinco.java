import java.util.Scanner;
import java.util.ArrayList;

public class questaoCinco {
	public static double product(double ... numeros) {
		double result = 1;
		for (double res : numeros) {
            result = result * res;
		}
		return result;
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner valor = new Scanner(System.in);
		double x = 1, y, z;
		String s;
		ArrayList<Double> valores = new ArrayList<Double>();
		while (true) {
			System.out.println("digite o valores a serem calculados:");
			System.out.println("digite o valor x ou s para encerrar:");
			s = valor.next();
			if (s.equals("s")) {
				break;
			}
			else if (s.equals("p")){
				
			}
			else {
				x = Integer.parseInt(s);
				valores.add(x);
			}
			System.out.println("digite o valor y:");
			y = valor.nextDouble();
			System.out.println("digite o valor z:");
			z = valor.nextDouble();
			System.out.println("o produto desses valores (x,y,z) é: " + product(x, y, z));
			System.out.println("o produto desses valores (x,y) é: " + product(x, y));
			System.out.println("o produto desses valores (x) é: " + product(x));
		}
	}
}
