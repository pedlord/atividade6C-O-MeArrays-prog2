
public class questaoSete {
	public static void main(String args[]){ 
		Rectangle rec = new Rectangle();
		double l=5, w=10.5;
		System.out.println("inserindo valores 5 e 10 com set");
		rec.setLenght(l);
		rec.setWidth(w);
		System.out.printf("valores do retangulo: %nlenght: %.2f%nwidht: %.2f%n", rec.getLenght(),rec.getWidth() );
		System.out.printf("area: %.2f%nperimetro: %.2f%n", rec.area(rec), rec.perimetro(rec));
		System.out.println("inserindo valores 5 e 30 com set");
		rec.setLenght(l);
		rec.setWidth(30);
		System.out.printf("valores do retangulo: %nlenght: %.2f%nwidht: %.2f%n", rec.getLenght(),rec.getWidth() );
	}
}
class Rectangle{
	double lenght;
	double width;
	
	public static final double VAL_MIN = 0;
	public static final double VAL_MAX = 20;
	
	public double perimetro(Rectangle rec) {
		double result;
		result = 2 * (rec.getWidth() + rec.getLenght());
		return result;
	}
	public double area(Rectangle rec) {
		double result;
		result = rec.getWidth() * rec.getLenght();
		return result;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = (lenght > VAL_MIN && lenght < VAL_MAX )? lenght : VAL_MIN + 1;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = (width > VAL_MIN && width < VAL_MAX )? width : VAL_MIN + 1 ;
	}
	
}
