import java.util.Scanner;

public class questaoSeis {    
	public static int Fibonacci(int n){
	    if (n <= 1) {
	    	return n;
	    }
	    else {
	    	return Fibonacci(n-1) + Fibonacci(n-2); 
	    }
	 }
	 @SuppressWarnings("resource")
	public static void main(String args[]) {
		 Scanner valor = new Scanner(System.in);
		 while (true) {
			 int n;
			 System.out.println("digite o valor da posi��o desejada da sequencia fibonacci ou -1 para sair:");
			 n = valor.nextInt();
			 if (n==-1) {
				 break;
			 }
			 /*for (int i=0; i <= n; i++) {
				 System.out.printf("%d ", Fibonacci(i));
			 }*/
			 System.out.printf("%nO num�ro da posi��o %d na sequencia de fibonacci �: %d%n", n, Fibonacci(n));
		 }
	 }
}
