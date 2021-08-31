import java.util.Scanner;

public class questaoDois {
	public static int reverter(int valor) {
		String numero;
		numero = String.valueOf(valor);
		StringBuffer rever = new StringBuffer(numero);
		rever.reverse();
		numero = rever.toString();
		valor = Integer.parseInt(numero);  
		return valor;
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner valor = new Scanner(System.in);
		int val;
		String s;
		while (true) {
			System.out.println("digite o valor ou s para sair:");
			s = valor.next();
			if (s.equals("s")) {
				break;
			}
			else {
				val = Integer.parseInt(s);
			}
			System.out.println("o valor invertido é: " + reverter(val));
		}
	}
}
